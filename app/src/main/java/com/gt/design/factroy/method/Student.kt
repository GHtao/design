package com.gt.design.factroy.method

import com.gt.design.utils.SysoUtil

/**
 * Created by gt on 2018/11/20.
 */
class Student(val name:String):ILeiFeng{
    override fun wash() {
        SysoUtil.syso("$name wash")
    }

    override fun sweep() {
        SysoUtil.syso("$name sweep")
    }

    override fun buyRice() {
        SysoUtil.syso("$name buyRice")
    }

}