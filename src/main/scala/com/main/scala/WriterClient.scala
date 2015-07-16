package com.main.scala

object WriterClient {
  def main(args: Array[String]): Unit = {
    
    val myWriterProfanityFirst =
      new StringWriterDelegate with UpperCaseWriter with ProfanityFilteredWriter
    
      val myWriterProfanityLast =
      new StringWriterDelegate with ProfanityFilteredWriter with UpperCaseWriter

    myWriterProfanityFirst writeMessage "There is no sin except stupidity"
    myWriterProfanityLast writeMessage "There is no sin except stupidity"
 
    println(myWriterProfanityFirst)
    println(myWriterProfanityLast)

  }
}