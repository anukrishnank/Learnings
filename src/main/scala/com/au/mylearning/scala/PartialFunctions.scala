package com.au.mylearning.scala

/**
 * Created by kurichak on 29/01/16.
 */
object PartialFunctions {

  def main (args: Array[String]){
    println(List(41, "cat") map { case i: Int ⇒ i + 1 })
  }

}
