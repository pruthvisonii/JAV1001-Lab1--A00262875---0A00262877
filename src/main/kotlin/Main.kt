/**
 * JAV1001 App Development for Android -- LAB 01

STUDENT NAME       STUDENT ID

Pruthvi Soni  -    A00262875   -  Mobile Application Development

Sakshi Sheth  -    A00262877   -  Mobile Application Development

 -------Program Discription------

 1. Miles to KM
 2. KM to Miles
 3. CM to Inches
 4. Inches to CM
 5. Kg to Lb
 6. Lb to Kg
 7. Gram to Oun
 8. Oun to Gram
 9. F to C


 **/

package prog
import java.util.Scanner
import java.util.*


fun main(args: Array<String>) {

    // 1  Miles To KM


    val read = Scanner(System.`in`)
    print("Enter miles: ")
    val miles = read.nextInt()
    val milestokm = miles * 1609.344 / 1000
    println("Kilometer is $milestokm")

    // 2  KM TO Miles


    print("Enter KM: ")
    val km = read.nextInt()
    val kmtomiless = km * 0.6214
    println("Miles is $kmtomiless")

    // 3  CM TO INCHES


    print("Enter CM: ")
    val cm = read.nextInt()
    val centemeter = cm * 0.393701
    println("Inches is $centemeter")

    // 4  INCHES TO CENTEMETER


    print("Enter Inches: ")
    val inc = read.nextInt()
    val inches = inc * 2.54
    println("CM is $inches")

    // 5  KG TO LB


    print("Enter KG: ")
    val kg = read.nextInt()
    val kgs = kg * 2.2
    println("Pound is $kgs")

    // 6  LB TO KG


    print("Enter Lb: ")
    val lb = read.nextInt()
    val lbs = lb * 0.45359237
    println("KG is $lbs")

    // 7  Gram TO Oun


    print("Enter Gram: ")
    val Gram = read.nextInt()
    val Gramtooun = Gram / 28.34952
    println("Oun is $Gramtooun")

    // 8  Oun TO Gram


    print("Enter Oun: ")
    val oun = read.nextInt()
    val ounc = oun * 28.34952
    println("Grams is $ounc")

    // 9  F to C


    print("Enter temperature into Fahrenheit : ")
    val fahrenheit = read.nextDouble()
    val celsius =( (fahrenheit  -  32  ) *  5)/9
    println("Temperature in Fahrenheit ($fahrenheit) = Celsius ($celsius)")

}


