package com.au.mylearning.scala

/**
 * Created by kurichak on 28/01/16.
 */
object Lists {
  def main(args: Array[String]) {


    val num = List(1, 1, 2, 3, 3, 3, 5, 8)

    println("last element" + num.last)

    def kthElement(x: List[Int], pos: Int): Int = x.take(pos).reverse.head

    println(kthElement(num, 4))

    def sum(list: List[Int]): Int = list match {
      case Nil => 1
      case n :: rest => n + sum(rest)
    }

    println(sum(num))

  }
}
