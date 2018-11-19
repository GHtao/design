package com.gt.design.decorator

import com.gt.design.utils.SysoUtil

/**
 * Created by gt
 * on 2018/11/17
 */
class BigTrouser:Finery(){
    override fun show() {
        super.show()
        SysoUtil.syso("kua ku")
    }
}