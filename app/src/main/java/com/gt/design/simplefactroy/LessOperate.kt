package com.gt.design.simplefactroy

/**
 * Created by gt on 2018/11/16.
 */
class LessOperate : IOperate{
    override fun getResult(number1: Float, number2: Float): Float {
        return number1 - number2
    }

}