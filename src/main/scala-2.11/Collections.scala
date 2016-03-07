/**
 * Created by kurichak on 28/01/16.
 */
 object Collections {
    def main(args: Array[String]) {

      val intList: List[Int] = List(1, 2, 3)
      val newList: List[Int] = intList.map(_ * 2)

      val words = List("the", "quick", "brown", "fox")

      println(words.map(_.toList))
      println(words.flatMap(_.toList))
      println(words.filter(_.length == 3))
      println(words.partition(_.length == 3))
      println(words.find(_.length == 3))
    }
}
