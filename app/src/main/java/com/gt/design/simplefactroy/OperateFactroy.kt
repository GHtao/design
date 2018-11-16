package com.gt.design.simplefactroy

/**
 * Created by gt on 2018/11/15.
 */
class OperateFactroy{
    companion object {
        fun getOperate(operate :OperateEnum ) : IOperate{
            when(operate){
                OperateEnum.ADD->return AddOperate()
                OperateEnum.LESS -> return LessOperate()
                OperateEnum.MULT -> return MultOperate()
                OperateEnum.DIV -> return DivOperate()
            }
        }
    }

}