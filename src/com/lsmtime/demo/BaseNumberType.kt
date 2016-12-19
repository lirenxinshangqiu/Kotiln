package com.lsmtime.demo

/**
 * Created by lsmtime on 2016/12/15.
 */
fun main(args: Array<String>) {
    numEqual()
    numEqual1()
    intEqualLong()
    changeNumberType()
    val str: String? = null
    print(str?.length)

}

/**
 * ===比較地址,==比較值,和java中== 和equals類似
 */
fun numEqual() {
    val a: Int = 10000
    println(a === a)
    val boxedA: Int ? = a
    val anotherBoxedA: Int ? = a
    println(boxedA === anotherBoxedA)
}

fun numEqual1() {
    println("numEqual1")
    val a: Int = 10000
    println(a == a)
    val boxedA: Int? = a
    val anotherBoxedA: Int ? = a
    println(boxedA == anotherBoxedA)
}

fun intEqualLong() {
    val a: Int = 1
    //    val b:Long? = a//不能如此写,编译器编译不过
    val b: Long? = a.toLong()
    //不能够隐式转换
    //    print(a == b)
}

fun changeNumberType() {
    val l = 1.toLong() + 1;
    if (l is Long) {
        println("Long")
    } else {
        print(l.javaClass.canonicalName)
    }
}
