package com.gt.design.facade

/**
 * Created by gt on 2018/11/20.
 * 外观模式类 将客户端与具体的操作隔离
 */
class Fund{
    val stock1:Stock1 = Stock1("stock1")
    val stock2:Stock2 = Stock2("stock2")
    /**
     * 封装具体的调用
     */
    fun buyFund(){
        stock1.buy()
        stock2.buy()
    }

    /**
     *
     */
    fun sellFund(){
        stock1.sell()
        stock2.sell()
    }
}