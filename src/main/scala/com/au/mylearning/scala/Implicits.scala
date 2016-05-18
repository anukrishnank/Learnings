package com.au.mylearning.scala

object implictExample extends App {
  def greeting(msg: String)(implicit append: String) = {
  	println(s"$msg $append")
  }

  implicit val appendWord = "World"

  greeting("Hello")

  implicit def convertToInt(str: String) = str.toInt

  val n:Int = "4" + 1

  implicit class StringOperation(s: String){
  	def increment = s.map(c => (c+1).toChar)
  }

  println("ABC".increment)
}