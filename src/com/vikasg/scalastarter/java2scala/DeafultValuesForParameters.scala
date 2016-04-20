package com.vikasg.scalastarter.java2scala

/**
  * Created by vikasg on 4/20/2016.
  */
object DeafultValuesForParameters {

  def main(args:Array[String]){
    testDefaultValues()

    testDefaultValues("Ajay","Aggarwal","myemail@email.com")

    // Substitution of Default values of skipped parameters is done at compile time
    // Compiler would treat provided values in Order only.

    testDefaultValues("Vineet","mytestemail@email.com")

    // Named Argument would help to deal with the exact match of the provided values instead of the skipped parameters
        testDefaultValues(fName="Vineet",email="myemail@email.com")

  }

  def testDefaultValues(fName: String="Vikas", lName:String="Gupta",email:String="test@email.com"): Unit ={
    println(s"Details: $fName $lName $email")
  }

}
