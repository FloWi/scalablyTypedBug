package de.flwi.spacetraders.leaderboard

object Model {

  final class DataItemID

  case class DataItem(id: DataItemID, label: String, value: Double)

  object DataItem {
    def apply(): DataItem = DataItem(new DataItemID(), "?", Math.random())
  }


}
