//package com.au.mylearning.scalding
//
//import com.twitter.scalding.{JobTest, TextLine, Tsv}
//import org.junit.runner.RunWith
//import org.scalatest.junit.JUnitRunner
//import org.scalatest.{Matchers, WordSpec}
//
//@RunWith(classOf[JUnitRunner])
//class UniqueProductTest extends WordSpec with Matchers {
//  "test" should {
//    JobTest(new uniqueProduct(_))
//      .arg("input1", "usersInput")
//      .arg("input2", "transactionsInput")
//      .arg("output", "outputFile")
//      .source(TextLine("usersInput"), List((0, "1 abc@test.com EN AU"), (1, "2 abc2@test.com EN US"), (2, "3 abc3@test.com EN IN")))
//      .source(TextLine("transactionsInput"), List((0, "1 1 1 300 jumper"), (1, "2 1	2	300 jumper"), (2, "3 1 2 300 jumper"), (3, "4 2 3 100 chicken"), (4, "5 1 3 300 jumper")))
//      .sink[(Int, Int)](Tsv("outputFile")){ outputBuffer =>
//        val outMap = outputBuffer.toMap
//        "count number of locations per product correctly" in {
//          outMap(1) shouldBe 3
//          outMap(2) shouldBe 1
//        }
//      }
//      .run
//      .finish
//  }
//}