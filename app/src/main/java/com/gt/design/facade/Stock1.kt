package com.gt.design.facade

import com.gt.design.utils.SysoUtil

/**
 * Created by gt on 2018/11/20.
 */
class Stock1(val name:String):IStock{
    override fun buy() {
        SysoUtil.syso("$name buy")
    }

    override fun sell() {
        SysoUtil.syso("$name sell")
    }

}