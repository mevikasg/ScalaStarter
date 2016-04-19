package com.vikasg.scalastarter.java2scala

/**
  * Created by vikasg on 4/18/2016.
  */
object MultipleReturnsTuple {

  def main(args: Array[String]) {
    val (fName, lName, email) = getPersonInfo(1)

    println(s"User Details:-")
    println(s"First Name: $fName")
    println(s"Last Name: $lName")
    println(s"Email: $email")

  }

  def getPersonInfo(id: Int) = {
    // hard coded person details to  test Multiple returns i.e. Tuple
    // (FName, LName, Email)
    ("Vikas", "Gupta", "mevikasg@email.com")
  }

}
