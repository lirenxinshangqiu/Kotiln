package com.lsmtime.demo

/**
 * Created by lsmtime on 2016/12/19.
 */

open class Base {

    private var age: Int

    constructor(age: Int) {
        this.age = age
    }

    fun getAge(): Int? {
        return age
    }
}