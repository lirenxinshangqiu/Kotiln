package com.lsmtime.demo

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

fun stringFunFormat() {
    
}
