package com.vikasg.scalastarter.java2scala

/**
  * Created by vikasg on 4/18/2016.
  */
object VariableParameters {

  def main(args: Array[String]) {
    multipleParameters(3,8,9,1,23,78)

  }

  def multipleParameters(nums : Int*) {

    println(nums.reverse)
  }


}
