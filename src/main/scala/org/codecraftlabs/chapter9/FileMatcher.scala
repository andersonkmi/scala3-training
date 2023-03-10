package org.codecraftlabs.chapter9

import java.io.File

object FileMatcher {
  private def filesHere = new File(".").listFiles

  private def filesMatching(matcher: String => Boolean) =
    for file <- filesHere if matcher(file.getName)
      yield file

  def filesEnding(query: String): Seq[File] = {
    filesMatching(_.endsWith(query))
  }

  def filesContaining(query: String): Seq[File] = {
    filesMatching(_.contains(query))
  }

  def filesRegEx(query: String): Seq[File] = {
    filesMatching(_.matches(query))
  }
}
