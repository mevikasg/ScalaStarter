package com.vikasg.scalastarter.java2scala

/**
  * Created by vikasg on 4/18/2016.
  */
object VariableParameters {


  def main(args: Array[String]) {
    multipleParameters(3,8,9,1,23,78)

    // Type mismatch as multipleParameters looks for Int values not Array of Int.

    /*val nums = Array(2,4,8,2,1)
    multipleParameters(nums)*/

    val numbers = Array(2,4,8,2,1)
    // Use Array Explode notation so that it will tell compiler to explode the array into required format.
        multipleParameters(numbers: _*)
  }

  def multipleParameters(nums : Int*) {
    println(nums.reverse)
  }


}
