package com.main.scala

trait ProfanityFilteredWriter extends Writer {
  abstract override def writeMessage(message: String) =
    super.writeMessage(message.replace("stupid", "s-----"))
}