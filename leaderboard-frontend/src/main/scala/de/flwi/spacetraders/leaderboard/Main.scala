package de.flwi.spacetraders.leaderboard

import com.raquo.laminar.api.L._
import de.flwi.spacetraders.leaderboard.Model.{DataItem, DataItemID}
import org.scalajs.dom

object Main extends App {

  renderOnDomContentLoaded(dom.document.querySelector("#app"), appElement())
  private val dataVar    = Var[List[DataItem]](List(DataItem(new DataItemID(), "one", 1.0)))
  private val dataSignal = dataVar.signal

  private def addDataItem(item: DataItem): Unit =
    dataVar.update(_.appended(item))

  private def removeDataItem(id: DataItemID): Unit =
    dataVar.update(_.filterNot(_.id == id))

  private def appElement(): Element = {
    div(
      h1("Hello, Scala.js, Vite and Laminar!"),
      renderDataTable(),
    )
  }

  private def renderDataTable(): Element = {
    table(
      thead(
        tr(th("Label"), th("Value"), th("Action"))
      ),
      tbody(
        children <-- dataSignal.split(_.id) { (id, _, itemSignal) =>
          renderDataItem(id, itemSignal)
        }
      ),
      tfoot(
        tr(td(button("+", onClick --> (_ => addDataItem(DataItem())))))
      ),
    )
  }

  private def renderDataItem(id: DataItemID, item: Signal[DataItem]): Element = {
    tr(
      td(child.text <-- item.map(_.label)),
      td(child.text <-- item.map(_.value + 42)),
      td(button("🗑️", onClick --> (_ => removeDataItem(id)))),
    )
  }

}
