package com.main.scala

object FriendTraitClient {
  
  def helpAsFriend(friendObj : Friend){
    friendObj.listen
  }
  
  
  def main(args: Array[String]): Unit = {
    
    val john = new Man("John")
    val jenny = new Woman("Jenny")
    val bruno = new Dog("Bruno")
    
    
    john.listen
    jenny.listen
    bruno.listen
    
    println("------------------------------------")
    
    helpAsFriend(john)
    helpAsFriend(jenny)
    helpAsFriend(bruno)
    
    println("------------------------------------")
    
    val meow = new Cat("Meow") with Friend
    meow.listen
    helpAsFriend(meow)
    
  }
}