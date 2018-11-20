package com.gt.design.facade

/**
 * Created by gt on 2018/11/20.
 * 减少相互之间的依赖 包括对老系统的维护 三层架构
 */
class FacadeTest{
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val fund = Fund()
            fund.buyFund()
            fund.sellFund()
        }
    }
}