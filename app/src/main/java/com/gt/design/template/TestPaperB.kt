package com.gt.design.template

import com.gt.design.utils.SysoUtil

/**
 * Created by gt on 2018/11/20.
 */
class TestPaperB:TestPaper(){
    override fun answer1() {
        SysoUtil.syso("paperB: b")
    }

    override fun answer2() {
        SysoUtil.syso("paperB: d")
    }

}