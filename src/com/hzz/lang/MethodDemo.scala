package com.hzz.lang

import scala.reflect.ClassTag

class MethodDemo {
  def func(x: Int)(y: Int) = x + y

  def mkArray[T: ClassTag](elems: T*) = Array[T](elems: _*)
}