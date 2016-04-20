package com.vikasg.scalastarter.java2scala

/**
  * Created by vikasg on 4/18/2016.
  */
object Java2Scala {

  def main(args:Array[String]) {

    println("Hello Scala!!!")

    for (i <- 1 to 3)
      print(s"$i, ")

    println(" That's Scala...")


    for (i <- 1 until 3)
      print(s"$i, ")

    println(" for loop until 3")
  }

}
