package com.gt.design.template

import com.gt.design.utils.SysoUtil

/**
 * Created by gt on 2018/11/20.
 * 把不变的行为搬移到父类 去除子类中重复的代码
 */
abstract class TestPaper{
    /**
     * 问题1
     */
    fun question1(){
        SysoUtil.syso("""1+1=[]
            |a 2, b 3, c 4, d 5""".trimMargin())
        answer1()
    }

    /**
     * 答案1
     */
    abstract fun answer1()

    fun question2(){
        SysoUtil.syso("""10*10=[]
            |a 100, b 101, c 200, d 400
        """.trimMargin())
        answer2()
    }

    abstract fun answer2()
}