package com.knoldus

object Driver {
  def main(args: Array[String]): Unit = {
    val calculatorObject = new Calculator
    println("Sum of two numbers 10 and 3 is =>" + calculatorObject.additionOfNumbers(10, 3))
    println("Subtraction of numbers 11 and 5 is =>" + calculatorObject.subtractionOfNumbers(11, 5))
    println("Product of numbers 7 and 9 is =>" + calculatorObject.multiplicationOfNumbers(7, 9))
    println("256 divided by 32 is =>" + calculatorObject.divisionOfNumbers(256, 32))
    //The Calculator class will throw exception if number is divide by zero.
    println("32 divided by zero is not possible" + calculatorObject.divisionOfNumbers(32, 0))
    println("\nWorking with Storage Class through CallingStorageMethods")
    val callingStorageMethodObject = new CallingStorageMethod
    println("Adding number 5 " + callingStorageMethodObject.addElement(5))
    println("Adding number 10 " + callingStorageMethodObject.addElement(10))
    println("Adding number 9 " + callingStorageMethodObject.addElement(9))
    println("Remove number 10 from the array. Status:" + callingStorageMethodObject.removeElement(10))
    println("Remove number 10 from the array. Status:" + callingStorageMethodObject.removeElement(23))
    println("Is 5 present in array :" + callingStorageMethodObject.checkIfContains(5))
    println("Is 99 present in array :" + callingStorageMethodObject.checkIfContains(99))
    println("Remove all elements from array :" + callingStorageMethodObject.removeAll)
  }
}