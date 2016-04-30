package com.lucianomolinari.csvprocessor

import org.scalatest.FunSuite
import org.scalatest.Matchers._

/**
  *
  * @author Luciano Molinari
  */
class SalesCSVReaderTest extends FunSuite {

  test("Load CSV file") {
    val sales = new SalesCSVReader("src/main/resources/SalesJan2009.csv").readSales

    sales.size shouldBe 50

    sales(0) shouldBe Sale("1/2/09 6:17", "Product1", 1200, "Mastercard", "United Kingdom")
    sales(49) shouldBe Sale("1/10/09 14:43", "Product1", 1200, "Diners", "Ireland")
  }

}
