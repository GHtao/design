package com.gt.design.oberser

/**
 * Created by gt on 2018/11/20.
 */
class OberserTest{
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val nbaMan = NBAMan()
            val stockMan = StockMan()
            val bossOberable = BossOberable()
            bossOberable.addObserver(nbaMan)
            bossOberable.addObserver(stockMan)
            bossOberable.notifyOberser()
        }
    }
}