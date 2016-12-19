package com.lsmtime.demo

/**
 * Created by lsmtime on 2016/12/16.
 */
class Invoice(name: String?) : Base(10) {
    var name: String? = name
    fun getBaseInfo(): String? {
        return name +" "+getAge()
    }


}