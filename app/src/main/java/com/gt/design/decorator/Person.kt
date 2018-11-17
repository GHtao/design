package com.gt.design.decorator

import com.gt.design.utils.SysoUtil

/**
 * Created by gt
 * on 2018/11/17
 */
open class Person(val name:String):IPerson{
    /**
     * 显示穿的衣服
     */
    override fun show(){
        SysoUtil.syso("name: kaishi daban---"+name)
    }
}