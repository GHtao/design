package com.gt.design.decorator

/**
 * Created by gt
 * on 2018/11/17
 * 装饰类
 */
open class Finery:IPerson{
    var person:IPerson? = null
    /**
     * 设置要装饰的对象
     */
    fun decorate(person: IPerson){
        this.person = person
    }

    /**
     * 接口中的父类方法
     */
    override fun show() {
        person!!.show()
    }
}