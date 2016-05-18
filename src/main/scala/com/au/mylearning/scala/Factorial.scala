package com.au.mylearning.scala

object Factorial {
  def factTail(i: Int): Int = {
  	def recursive(i: Int, acc: Int): Int = {
  		if(i == 0) acc
  		else recursive(i-1, i*acc)
  	}
  	recursive(i, 1)
  }

   def factFold(i: Int): Int = {
   	(1 to i).foldLeft(1)((a,b) => a*b)
   }

   def factFoldAnony(i: Int): Int = {
   	 (1 to i).foldRight(1)(_ * _)
   }

   def factFoldSynonm(i: Int): Int = {
   	 ((1 to i) :\ 1)(_ * _)
   }

  def main(args: Array[String]) {
    println(factTail(4))
    println(factFold(5))
    println(factFoldAnony(3))
    println(factFoldSynonm(5))
  }
}