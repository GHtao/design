package com.gt.design.strategy

/**
 * Created by gt on 2018/11/16.
 */
class StrategyTest{

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val cashInfo = CashInfo()
            cashInfo.cashEnum = CashInfo.Companion.CashEnum.REBATE
            cashInfo.rebate = 0.8f

            val cashSuper = CashFactroy.createCash(cashInfo)
            val cashContext = CashContext(cashSuper)
            val endMoney = cashContext.getEndMoney(100f)
            System.out.print("endMoney:"+endMoney)
        }
    }
}