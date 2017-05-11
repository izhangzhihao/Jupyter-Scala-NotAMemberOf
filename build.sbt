lazy val NotAMemberOf = project
lazy val use = project.dependsOn(NotAMemberOf)

name := "NotebookBug"

version := "1.0"

scalaVersion := "2.11.11"
