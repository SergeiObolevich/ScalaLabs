import Decision.Main
import org.scalatest._

import scala.collection.mutable

class ScalaTest extends FlatSpec with Matchers {
  it should "Max length in list" in {
    val list = List[Int](1,2,3,4,5,6)
    assert(Main.listLeng(list) == 6)
  }

  it should "List length" in {
    val list = List[String]("Hello", "man", "of", "interesting", "Future")
    assert(Main.maxLeng(list) == "interesting")
  }

  it should "Uppercase letter words" in {
    val list = List[String]("Hello", "lol", "My", "of", "Friend", "ABA")
    val result = mutable.MutableList[String]("lol", "ABA")
    assert(Main.palin(list) == result)
  }
}