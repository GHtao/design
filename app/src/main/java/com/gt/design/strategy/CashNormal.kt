package com.gt.design.strategy

/**
 * Created by gt on 2018/11/16.
 */
class CashNormal : CashSuper() {
    /**
     * 子类的具体算法
     */
    override fun algorit(money:Float) :Float{
        return money
    }

}