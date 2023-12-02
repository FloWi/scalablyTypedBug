ThisBuild / scalaVersion     := "2.13.10"
ThisBuild / organization     := "de.flwi"
ThisBuild / organizationName := "Florian Witteler"
ThisBuild / startYear        := Some(2023)
ThisBuild / licenses         := Seq(License.Apache2)

import org.scalajs.linker.interface.ModuleSplitStyle

import scala.sys.process.Process

lazy val leaderboardFrontendApp = project
  .in(file("./leaderboard-frontend"))
  .enablePlugins(ScalaJSPlugin)
  .enablePlugins(ScalablyTypedConverterExternalNpmPlugin)
  .settings(
    name                            := "leaderboard-frontend",
    scalaVersion                    := "3.3.1",
    scalaJSUseMainModuleInitializer := true,
    scalaJSLinkerConfig ~= {
      _.withModuleKind(ModuleKind.ESModule)
        .withModuleSplitStyle(ModuleSplitStyle.SmallModulesFor(List("de.flwi.spacetraders.leaderboard")))
    },
    externalNpm := baseDirectory.value,

    libraryDependencies ++= Seq(
      "com.raquo" %%% "laminar" % "15.0.1"
    ),
  )


lazy val root = project
  .aggregate(leaderboardFrontendApp)
  .settings(
    Compile / doc / sources := Seq()
  )
