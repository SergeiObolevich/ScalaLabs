package Solution

import scala.annotation.tailrec

object LabObject {
  def main(args: Array[String]): Unit = {}

  @tailrec
  def occurrencesNumberTailRec(list: List[Char], index: Int, characterNumber: Int, character: Char): Int = {
    if (index < list.length) {
      if (list(index) == character) occurrencesNumberTailRec(list, index + 1, characterNumber + 1, character)
      else occurrencesNumberTailRec(list, index + 1, characterNumber, character)
    }
    else characterNumber
  }

  def occurrencesNumberNotRec(list: List[Char], character: Char): Int = {
    var index = 0
    for (i <- 0 to list.length - 1) {
      if (list(i) == character)
        index += 1
    }
    index
  }

  def occurrencesNumberRec(list: List[Char], character: Char, index: Int): Int = {
    if (index < list.length) {
      val result = occurrencesNumberRec(list, character, index + 1)
      if (list(index) == character)
        result + 1
      else
        result
    }
    else
      0
  }

  @tailrec
  def maxIndexTailRec(list: List[Int], curIndex: Int, maxIndex: Int): Int = {
    if (curIndex < list.length - 2) {
      if (list(curIndex + 1) - list(curIndex) > list(maxIndex + 1) - list(maxIndex)) maxIndexTailRec(list, curIndex + 1, curIndex)
      else maxIndexTailRec(list, curIndex + 1, maxIndex)
    }
    else maxIndex
  }

  def maxIndexNotRec(list: List[Int]): Int = {
    var index = 0
    for (i <- 1 to list.length - 2) {
      if (list(i + 1) - list(i) > list(index + 1) - list(index))
        index = i
    }
    index
  }

  def maxIndexRec(list: List[Int], curIndex: Int): Int = {
    if (curIndex < list.length - 2) {
      val index = maxIndexRec(list, curIndex + 1)
      if (list(curIndex + 1) - list(curIndex) > list(index + 1) - list(index))
        curIndex
      else
        index
    }
    else list.length - 2
  }
}