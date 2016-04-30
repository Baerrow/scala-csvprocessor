package com.lucianomolinari.csvprocessor

import scala.io.Source

/**
  * Implementation of [[SalesReader]] responsible for reading sales from a CSV file.
  *
  * @param fileName The name of the CSV file to be read.
  * @author Luciano Molinari
  */
class SalesCSVReader(val fileName: String) extends SalesReader {

  override def readSales(): Seq[Sale] = {
    for {
      line <- Source.fromFile(fileName).getLines().drop(1).toVector
      values = line.split(",").map(_.trim)
    } yield Sale(values(0), values(1), values(2).toInt, values(3), values(4))
  }

}