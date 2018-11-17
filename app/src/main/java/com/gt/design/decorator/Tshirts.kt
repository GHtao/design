package com.gt.design.decorator

import com.gt.design.utils.SysoUtil

/**
 * Created by gt
 * on 2018/11/17
 * 装饰着 具体的实现类
 */
class Tshirts:Finery(){
    /**
     * 具体的添加功能
     */
    override fun show() {
        super.show()
        SysoUtil.syso("大T恤")
    }
}