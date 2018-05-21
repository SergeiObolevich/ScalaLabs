package Decision

import scala.collection.mutable

object Main {
  def palin(list: List[String]): mutable.MutableList[String] = {
    val result = mutable.MutableList[String]()
    for (i <- 0 until list.length) {
      if (list(i) == list(i).reverse)
        result += list(i)
    }
    result
  }

  def listLeng(list: List[Int]): Int = {
    list.foldLeft(0) { (count, _) => count + 1 }
  }

  def maxLeng(list: List[String]): String = {
    list.reduceLeft((x,y) => {
      if (x.length() > y.length()) x
      else y
    })
  }
}
