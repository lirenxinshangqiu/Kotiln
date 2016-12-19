package com.lsmtime.demo

/**
 * 伴随对象
 * Created by lsmtime on 2016/12/19.
 */
/**
 * 在Kotlin中写一个没有实例对象也可以调用的类.可以定义工厂模式,另外一种就是声明一个伴随对象
 */
class Books(var name: String, var page: Int) {
    companion object ComBooks {
        //伴随对象
        val a: Int = 10

        fun doNote() {
            println("do note")
        }
    }
}

fun main(args: Array<String>) {
    Books.ComBooks.doNote()//调用伴随函数,不需要进行实例化
    println("-------")
    Books.doNote()
}