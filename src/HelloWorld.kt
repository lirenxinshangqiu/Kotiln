import java.util.*

/**
 *
 * Created by lsmtime on 2016/12/15.
 */

fun main(args: Array<String>) {
    //    if (args.size == 0) {
    //        return
    //    }
    //    print("first argument:${args[0]}")
    println("Hello World!");
    println(max(100, 200));
    print("\n")
    println("sum:" + sum(13, 2))
    variable()
    var list: ArrayList<Int> = ArrayList<Int>();
    for (i in 1..100)
        list.add(i)
    //循环写法 一
    println("循環寫法一")
    for (arg in list) {
        println(arg)
    }
    //循環寫法 二,通過索引值去遍歷集合中的值
    println("循環寫法二")
    for (i in list.indices) {
        println(list[i])
    }
    println("循環寫法三")
    var i = 0
    while (i < list.size) {
        println(list[i++])
    }
    case('a')
    //過濾list
    val positives = list.filter { cat -> cat > 0 }
    val positives_1 = list.filter { it > 0 }
    var name = "123"
    //字符串插值
    println("Name $name")
    //非基本數據類型
    var person = Person();
    person.age = 4
    person.name = "kotlin"
    println(person)
    var list_1 = listOf("a", "b", "c")
    for (arg in list_1) {
        println(arg)
    }

    //map
    var map = HashMap<Int, String>()

    filter()
}

/**

 * 過濾方法
 */
public fun filter() {
    var list = ArrayList<Person>()
    for (i in 1..50) {
        var person = Person();
        person.name = "name" + i
        person.age = i
        list.add(person)
    }
    //此時過濾條件中的必須是it
    var filterList = list.filter { it.age > 10 }
    println(filterList)
    //此時過濾條件中的必須是
    var filterList_1 = list.filter { cat -> cat.age > 40 }
}

fun case(obj: Any) {
    println("數據類型")
    when (obj) {
        1 -> println("one")
        "hello" -> println("Greeting")
        is Long -> println("Long")
        !is Long -> println("Not a string")
        else -> print("Unknown")
    }
}


//
//fun max(a: Int, b: Int): Int {
//    if (a > b) {
//        return a
//    } else {
//        return b
//    }
//}
/**
 * 条件表达式
 */
fun max(a: Int, b: Int) = if (a > b) a else b

//fun sum(a: Int, b: Int): Int {
//    return a + b;
//}

fun sum(a: Int, b: Int) = a + b

/**
 * 返回一个没有意义的值
 */
//fun printSum(a:Int,b:Int):Unit{
//    print(a+b)
//}

fun printSum(a: Int, b: Int) {
    print(sum(a, b))
}

fun variable() {
    val a: Int = 1;
    val b = 1;
    val c: Int//在没有赋值的时候没有声明类型会报错的
    c = 1

    var x = 5
    x += 1
    println("x=" + x)
}

//使用值检查并自动转换
fun getStringLegenth(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }
    return null
}