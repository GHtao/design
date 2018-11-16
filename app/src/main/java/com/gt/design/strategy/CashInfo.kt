package com.gt.design.strategy

/**
 * Created by gt on 2018/11/16.
 * 活动详情
 */
class CashInfo{
    var rebate:Float = 10f
    var returnMoney:Float = 0f
    var conditionMoney:Float = 0f
    var cashEnum:CashEnum = CashEnum.NORMAL
    companion object {
        enum class CashEnum{
            NORMAL,//无优惠
            REBATE,//打折
            RETURN//满减
        }
    }
}
