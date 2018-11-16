package com.gt.design.strategy

/**
 * Created by gt on 2018/11/16.
 * 策略模式中的上下文 对象
 */
class CashContext(val cashSuper:CashSuper){

    /**
     * 获取最终的价钱
     */
    fun getEndMoney(money : Float) : Float{
        return cashSuper.algorit(money)
    }
}