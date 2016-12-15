package com.lsmtime.demo

/**
 * Created by lsmtime on 2016/12/15.
 */
fun main(args: Array<String>) {
    numEqual()
    numEqual1()
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