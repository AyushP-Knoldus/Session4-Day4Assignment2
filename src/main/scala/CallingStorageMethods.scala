package com.knoldus

import scala.jdk.CollectionConverters._

trait StorageMethods {
  def addElement(element: Int): List[Int]

  def removeElement(element: Int): Boolean

  def removeAll(): List[Int]

  def checkIfContains(element: Int): Boolean
}

class CallingStorageMethod extends StorageMethods {
  private val storageObject = new Storage

  override def addElement(element: Int): List[Int] = {
    val result = storageObject.addElement(element)
    val convertedList = result.asScala.toList
    convertedList.map(element => element.intValue())
  }

  override def removeElement(element: Int): Boolean = {
    val result=storageObject.removeElement(element)
    result
  }

  override def removeAll(): List[Int] = {
    val result = storageObject.removeAll()
    val convertedList = result.asScala.toList
    convertedList.map(element => element.intValue())
  }

  override def checkIfContains(element: Int): Boolean = {
    val result = storageObject.checkIfContains(element)
    result
  }
}
