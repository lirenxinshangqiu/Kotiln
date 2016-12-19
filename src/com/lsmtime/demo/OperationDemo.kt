package com.lsmtime.demo

import java.util.*

/**
 * Kotlin运算符,提供了中缀形式的运算符
 * Created by lsmtime on 2016/12/16.
 */
fun main(args: Array<String>) {
    val a: Int? = 1
    val b: Int? = 2
    //正负号
    println(a?.unaryPlus())
    println(a?.unaryMinus())
    a?.unaryMinus()//负号 -a
    a?.unaryPlus()//正号 +a
    //    a?.inc()//
    //    print(a)
    //    println(decimalDigitValue('1'))//字符不在1--9之间会抛出异常
    //    createArray()//创建数组
    stringFun()//字符串函数
    stringFunFormat()//字符串模板
    expressIf()//if表达式
    expressWhen(4)//when表达式

    expressBreakAndContinue()//返回与跳转
    foo()

    var invoice = Invoice("lushan")
    print(invoice.getBaseInfo())
}

/**
 * 位运算符,至于位运算符,Kotlin没有提供特殊的操作符,只是提供了可以叫中缀形式的方法
 * shl(bits) -带符号左移(<<)
 * shr(bits) -带符号右移(>>)
 * ushr(bits) 无符号右移(>>>)
 * ushl(bits) 无符号左移(<<<)
 * and(bits)  按位与
 * or(bits)   按位或
 * inv(bits)  按位翻转
 *
 * 注意:只能够用在Int和Long类型的数据
 */
fun orOperation() {

    val x = (1 shl 2 ) and 0x000FF00//左移两位
    1 shr 2//右移两位

}

/**
 * 字符
 */
fun decimalDigitValue(c: Char): Int {
    if (c !in '0'..'9') {
        throw IllegalStateException("Out of range")
    } else {
        return c?.toInt() - '0'.toInt()
    }
}

/**
 * Array,IntArray,ByteArray,ShortArray
 */
fun createArray() {
    val asc = Array(5, { i -> (i * i).toString() })
    println(asc.indices)
    val x: IntArray = intArrayOf(1, 2, 3)//直接对数组进行赋值1,2,3
    for (i in x.indices) {
        //x.indices为数组x的位置索引
        println(x[i])
    }

}

/**
 * 字符串,一种可以带分割符的,和java中的用法相同,一种是可以包含新行以及任意文本的,
 * 整行String是由三个引号包裹的""" ....""",输出的是和...中的格式相同的
 */
fun stringFun() {
    val s = "Hello World!" +
            "" +
            "sdf"
    print(s)
    val text = """
    这个是整行的字符串,由三个引号包括,可以添加任意的文本\n
    转义字符在此处也无法转义
    """
    print(text)
}

/**
 * 字符串模板,模板表达式
 * 第一种:由一个$开头,包括另一个简单的名称
 * 第二种:带有大括号的表达式,
 */
fun stringFunFormat() {
    var i: Int = 10
    var str: String = "i = $i"
    println(str)
    val s = "abc"
    val str1 = "the length of $s is ${s.length}"
    println(str1)
}

/**
 * if表达式
 */
fun expressIf() {
    val a: Int = 10
    val b: Int = 11
    var max: Int
    if (a < b) {
        max = b
    } else {
        max = a
    }
    //真是卧槽了,为什么还能够这么写呢?
    val max1 = if (a > b) a else b
    val max2 = if (a > b) {
        a
        print("max num is$a")
    } else {
        b
        print("max num is $b")
    }
}

/**
 * when 表达式
 * 类似于switch -case
 */
fun expressWhen(x: Int) {
    when (x) {
        1 -> print("x == 1")
        2 -> print("x==2")
        3, 4 -> print("x ==3 or x ==4")
        in 5..10 -> print(" x>=5 && x<=10")
        else -> {
            print("x is neither 1 nor 2")
        }
    }
    val str: String = "1"//str.toInt()把字符串数字转化为Int值
    println(str.toInt())

    //此时用when表达式判断是否是某种类型的时候,只能够是相同类型的
    val hasPrefix = when (str) {
        is String -> str.startsWith("lu")
        else -> false
    }
    //when也可以用来代替if-else if,如果没有任何参数提供,那么分支的条件就是简单地布尔表达式,当条件为真时执行相应的分支
    when {
        x.mod(2) == 1 -> print("$x 是 奇数")
        else -> print("$x 是偶数")

    }
}

/**
 * 返回和跳转
 * break continue和java中用法一致
 * loop@ break@loop 结束循环后直接跳转到loop指定循环
 */
fun expressBreakAndContinue() {
    loop@for (i in 1..100) {
        println("i = $i")
        for (j in 1..100) {
            println("j = $j")
            if (j == 10) {
                println("i = $i ,j = $j")
                break@loop
            }
        }
    }
}

/**
 * return
 * lit@返回到最近的闭合函数
 */
fun foo() {
    val list = ArrayList<Int>()
    var i = 0
    while (i < 10) {
        list.add(i)
        i++
    }
    //    list.forEach lit@{//只有当数据为5的时候没有打印
    //        if(it == 5){
    //            return@lit
    //        }
    //        println("list's element is $it")
    //    }

    list.forEach {
        if (it == 5) {
            //只有当数据为5的时候没有打印,作用和continue类似
            return@forEach
        }
        println("list's element is $it")
    }
}

