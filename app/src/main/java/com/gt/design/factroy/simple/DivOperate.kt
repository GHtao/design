package com.gt.design.factroy.simple

/**
 * Created by gt on 2018/11/16.
 */
class DivOperate : IOperate {
    override fun getResult(number1: Float, number2: Float): Float {
        if(number2 == 0f){
            throw IllegalArgumentException("div number not 0")
        }
        return number1 / number2
    }

}