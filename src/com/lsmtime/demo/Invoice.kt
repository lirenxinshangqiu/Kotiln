package com.lsmtime.demo

/**
 * Created by lsmtime on 2016/12/16.
 */
class Invoice : Base {
    var name: String?

    /**
     * 如果没有构造函数,需要在构造函数后面添加super字段条用父类构造
     */
    constructor(age: Int, name: String?) : super(age) {
        this.name = name
    }

    fun getBaseInfo(): String? {
        return name
    }

    //如果一个方法不想被继承,在前面加关键字final
    final override fun getAge(): Int? {
        return 1
    }


}