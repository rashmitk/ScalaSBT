package com.main.scala

trait UpperCaseWriter extends Writer {
  abstract override def writeMessage(message: String) =
    super.writeMessage(message.toUpperCase)
}