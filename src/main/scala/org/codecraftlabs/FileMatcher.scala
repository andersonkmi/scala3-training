package org.codecraftlabs

import java.io.File

object FileMatcher {

  def filesEnding(query: String): Array[File] = {
    filesMatching(_.endsWith(query))
  }

  def filesContaining(query: String): Array[File] = {
    filesMatching(_.contains(query))
  }

  def filesRegex(query: String): Array[File] = {
    filesMatching(_.matches(query))
  }

  private def filesHere = new java.io.File(".").listFiles

  private def filesMatching(matcher: String => Boolean): Array[File] = {
    for file <- filesHere if matcher(file.getName)
      yield file
  }
}
