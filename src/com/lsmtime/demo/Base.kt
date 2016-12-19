package com.lsmtime.demo

/**
 * Created by lsmtime on 2016/12/19.
 */
/**
 * open注解和java中的final相反,允许别的类进行继承,在默认情况下Kotlin中的类都不能够被其他的类继承,默认为final类
 */
 open class Base {

    private var age: Int

    constructor(age: Int) {
        this.age = age
    }

    open  fun getAge(): Int? {
        return age
    }
}