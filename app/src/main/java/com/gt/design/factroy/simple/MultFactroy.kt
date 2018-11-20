package com.gt.design.factroy.simple

/**
 * Created by gt on 2018/11/20.
 */
class MultFactroy:IFactroy{

    override fun getOperateFactroy(): IOperate {
        return LessOperate()
    }

}