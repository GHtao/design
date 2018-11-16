package com.gt.design.strategy

/**
 * Created by gt on 2018/11/16.
 * 优惠的工厂类
 */
class CashFactroy{

    companion object {
        /**
         * 创建工厂类来获取 具体的算法
         */
        fun createCash(cash:CashInfo) : CashSuper{
            when(cash.cashEnum){
                CashInfo.Companion.CashEnum.NORMAL -> return CashNormal()
                CashInfo.Companion.CashEnum.REBATE -> return CashRebate(cash.rebate)
                CashInfo.Companion.CashEnum.RETURN -> return CashReturn(cash.returnMoney,cash.conditionMoney)
            }
        }
    }
}