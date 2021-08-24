ThisBuild / scalaVersion := "2.12.14"
ThisBuild / useSuperShell := false
ThisBuild / autoStartServer := false

update / evictionWarningOptions := EvictionWarningOptions.empty

addSbtPlugin("com.timushev.sbt" % "sbt-rewarn"   % "0.1.3")
addSbtPlugin("com.timushev.sbt" % "sbt-updates"  % "0.5.3")
addSbtPlugin("com.typesafe.sbt" % "sbt-git"      % "1.0.1")
addSbtPlugin("io.spray"         % "sbt-revolver" % "0.9.1")
