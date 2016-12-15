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

