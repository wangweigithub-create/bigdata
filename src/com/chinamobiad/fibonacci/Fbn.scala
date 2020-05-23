package com.chinamobiad.fibonacci

/**
  * Created by WangWei on 2020/5/9.
  */
import scala.math.BigInt

object Fbn {
  val fbn: Stream[BigInt] =
    BigInt(0) #:: BigInt(1) #:: fbn.zip(fbn.tail).map(n => n._1 + n._2)

  def main(args: Array[String]): Unit = {
    println(fbn(100));
    println(location)

  }

  def location: BigInt = {
    var a: BigInt = 0
    var b: BigInt = 1
    var count = 0
    while (a.toString.length < 1000) {
      val c: BigInt = a + b
      a = b
      b = c
      count += 1
    }
    count
  }
}

