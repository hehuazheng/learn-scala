package com.hzz.lang

object MethodMain {
  def main(args: Array[String]): Unit = {
    val md = new MethodDemo;
    println(md.func(1)(2));
  }
}
