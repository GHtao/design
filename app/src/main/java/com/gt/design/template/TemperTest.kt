package com.gt.design.template

/**
 * Created by gt on 2018/11/20.
 * 模版方法测试类
 */
class TemperTest{
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val paperA = TestPaperA()
            val paperB = TestPaperB()
            paperA.question1()
            paperB.question1()

            paperA.question2()
            paperB.question2()
        }
    }
}