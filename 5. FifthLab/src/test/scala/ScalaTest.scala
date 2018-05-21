import Solution.LabObject
import org.scalatest._

class ScalaTest extends FlatSpec with Matchers {

  it should "Number occurrences of character tail recursion" in {
    val list = List[Char]('a', 'b', 'c', 'c')
    LabObject.occurrencesNumberTailRec(list, 0, 0, 'c') should be(2)
  }

  it should "Number occurrences of character recursion" in {
    val list = List[Char]('a', 'b', 'c', 'c')
    LabObject.occurrencesNumberRec(list, 'c', 0) should be(2)
  }

  it should "Number occurrences of character without recursion" in {
    val list = List[Char]('a', 'b', 'c', 'c')
    LabObject.occurrencesNumberNotRec(list, 'c') should be(2)
  }

  it should "Max index tail recursion" in {
    val list = List[Int](10, 15, 80, 100)
    LabObject.maxIndexTailRec(list, 0, 0) should be(1)
  }

  it should "Max index without recursion" in {
    val list = List[Int](10,15,80,100)
    LabObject.maxIndexNotRec(list) should be(1)
  }

  it should "Max index recursion" in {
    val list = List[Int](10,15,80,100)
    LabObject.maxIndexRec(list, 0) should be(1)
  }


}