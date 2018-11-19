package com.gt.design.proxy.simple

import com.gt.design.utils.SysoUtil

/**
 * Created by gt on 2018/11/19.
 * 封装具体的业务类 可以在业务类执行之前或之后来添加操作
 */
class SimplyProxy(val girl: SchoolGirl):IGiveGift{
    val pursuit:Pursuit

    init {
        pursuit = Pursuit(girl)
    }

    override fun giveDolls() {
        pursuit.giveDolls()
    }

    override fun giveFlowers() {
        pursuit.giveFlowers()
    }

    override fun giveChocolate() {
        SysoUtil.syso("before give chocolate")
        pursuit.giveChocolate()
        SysoUtil.syso("after give chocolate")
    }

}