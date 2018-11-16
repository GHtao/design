package com.gt.design.strategy

/**
 * Created by gt on 2018/11/16.
 * 初始化时 就将打折的传入
 */
class CashRebate(val rebate : Float) : CashSuper(){
    val mRebate : Float = rebate
    /**
     * 打折收费
     */
    override fun algorit(money: Float): Float {
        return money * mRebate
    }

}