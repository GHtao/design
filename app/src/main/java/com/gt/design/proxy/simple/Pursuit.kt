package com.gt.design.proxy.simple

import com.gt.design.utils.SysoUtil

/**
 * Created by gt on 2018/11/19.
 * 追求着类
 */
class Pursuit(val girl: SchoolGirl):IGiveGift{

    override fun giveFlowers() {
        SysoUtil.syso(girl.name+":give flowers")
    }

    override fun giveChocolate() {
        SysoUtil.syso(girl.name+":give chocolate")
    }

    override fun giveDolls() {
        SysoUtil.syso(girl.name+":give dolls")
    }

}