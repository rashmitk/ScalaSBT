package com.main.scala

class StringWriterDelegate extends Writer {
  val writer = new java.io.StringWriter
  def writeMessage(message: String) = writer.write(message)
  override def toString(): String = writer.toString
}