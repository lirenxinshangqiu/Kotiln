import com.lsmtime.demo.Turtile
import java.io.File
import java.util.*

/**
 * Created by lsmtime on 2016/12/15.
 */

fun main(args: Array<String>) {
    val files = File("test").listFiles();
    //判斷是否為空
    println(files?.size)
    //如果files為空則顯示提示語empty
    println(files?.size ?: "empty")
    //    empty()//聲明為空,執行操作
    doEmpty()//不為空的時候執行某種操作
    println("返回when判斷:" + transform("Red"))
    getTurtle()
}

/**
 * 利用with調用一個對象實例的多個方法
 */
fun getTurtle() {
    val myTurtle = Turtile()
    with(myTurtle) {
        penDown()
        for (i in 1..4) {
            forward(100.0)
            trun(90.0)
        }
        penUp()
    }
}


/**
 * 聲明為空執行某操作
 */
fun empty() {
    val data = HashMap<String, Int>()//聲明一個沒有數據的map
    val email = data["email"] ?: throw IllegalStateException("Email is missing!")
}

/**
 * 如果不為空的時候執行操作
 */
fun doEmpty() {
    val data = HashMap<String, Int>()
    //如果不為空的事後執行操作
    data?.let {
        if (data?.size == 0) {
            println("map中沒有值")
        } else {
            println(data)
        }
    }
}

/**
 * 返回when判斷
 */
fun transform(color: String): Int {
    return when (color) {
        "Red" -> 1
        "Green" -> 2
        "Blue" -> 3
        else -> throw IllegalStateException("沒有這種類型")
    }
}

/**
 * try-catch表达式
 */
fun tryCatch() {
    val result = try {

    } catch(e: ArithmeticException) {
        throw IllegalStateException(e)
    }
}