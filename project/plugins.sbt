addSbtPlugin("com.disneystreaming.smithy4s" % "smithy4s-sbt-codegen"     % "0.18.3")
addSbtPlugin("org.scala-js"                 % "sbt-scalajs"              % "1.14.0")
addSbtPlugin("ch.epfl.scala"                % "sbt-scalajs-bundler"      % "0.21.1")
addSbtPlugin("org.scalameta"                % "sbt-scalafmt"             % "2.5.0")
addSbtPlugin("org.typelevel"                % "sbt-tpolecat"             % "0.5.0")
addSbtPlugin("com.github.sbt"               % "sbt-native-packager"      % "1.9.16")
addSbtPlugin("org.portable-scala"           % "sbt-scalajs-crossproject" % "1.0.0")
addSbtPlugin("org.scalablytyped.converter"  % "sbt-converter"            % "1.0.0-beta43")

// for reading npmDependencies from package.json
libraryDependencies ++= Seq("com.lihaoyi" %% "upickle" % "3.1.3")
