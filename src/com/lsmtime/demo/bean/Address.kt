package com.lsmtime.demo.bean

/**
 * Created by lsmtime on 17/6/19.
 */
class Address {
    var name: String = ""
    var street: String = ""
        set(value) {
            street = value
        }
    var city: String = ""
        get() = "北京"

}