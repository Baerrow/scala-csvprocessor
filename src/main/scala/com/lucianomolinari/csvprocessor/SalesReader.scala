package com.lucianomolinari.csvprocessor

/**
  * Trait responsible for reading/loading [[Sale]].
  *
  * @author Luciano Molinari
  */
trait SalesReader {

  /**
    * @return A [[Seq]] containing all the sales.
    */
  def readSales(): Seq[Sale]

}

case class Sale(date: String, product: String, price: Int, paymentType: String, country: String)