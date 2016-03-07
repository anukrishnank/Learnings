/**
 * Created by kurichak on 28/01/16.
 */
object Curring {
  def main(args: Array[String]) {
    def multiply(x: Int)(y: Int): Int = x*y

    println(multiply(2)(3))

    val multTwo = multiply(2) _

    println(multTwo(4))

  }
}
