package com.main.scala

class Human(override val name: String) extends Friend

class Man(override val name: String) extends Human(name)
class Woman(override val name : String) extends Human(name)


