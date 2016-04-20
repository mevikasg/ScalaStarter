package com.vikasg.scalastarter.java2scala

/**
  * Created by vikasg on 4/20/2016.
  */
object TestImplicitParameters {

    def rideCar(user: String)(implicit driveCar:DriveCar): Unit ={
      println(s" $user drives $driveCar car.")
    }

    def drivesToWork: Unit ={
      println("------- Drives to work --------")
      def driveHatchBack = new DriveCar("BMW Mini")
      implicit def driveSedan = new DriveCar("Camry Hybrid")

      rideCar("Ajay Gupta")(driveHatchBack)
      rideCar("Vikas Gupta") // Implicit DriveCar instance filled in w/o compiler issue.
    }

    def drivesToVacation: Unit ={
      println("-------- Drives to Vacation ------")
      implicit def driveMinivan = new DriveCar("Honda Odessey")

      rideCar("Vikas Gupta")(driveMinivan)
      rideCar("Ajay Gupta")
    }

  def main(args:Array[String]){

    drivesToWork

    drivesToVacation
  }

}
