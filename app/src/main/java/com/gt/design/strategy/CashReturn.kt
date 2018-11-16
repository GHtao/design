package com.gt.design.strategy

/**
 * Created by gt on 2018/11/16.
 */
class CashReturn(val returnMoney:Float,val moneyCondition:Float) :CashSuper(){
    /**
     * 满减的优惠
     */
    override fun algorit(money: Float): Float {
        var result = when(money){
            in 0f..moneyCondition -> return money
            else ->{
                money - money / moneyCondition * returnMoney
            }
        }

        return result
    }

}