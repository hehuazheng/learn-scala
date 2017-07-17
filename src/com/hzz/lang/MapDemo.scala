package com.hzz.lang

object MapDemo {
  val parseR = (row: (String, Int, Int)) => {
    val clearKeyword = (keyword: String) => {
      Option(keyword).map("""(\s|）|（|·|'|\|)+""".r replaceAllIn(_, ""))
        .map(_.toLowerCase)
        .getOrElse("")
    }
    val k = row._1.split('_')
    (s"${row._2}_${clearKeyword(k(0))}_${k(3)}_${k(1)}", row._3)
  }
  // 1:点击类型_关键词_商品ID_点击位置 2:点击数

  def main(args: Array[String]): Unit = {
    val row = new Tuple3[String, Int, Int]("a_b_c_d_e", 1, 1)
    val s = parseR(row)
    println(s)
  }
}
