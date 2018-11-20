package com.gt.design.factroy.simple

/**
 * Created by gt on 2018/11/15.
 * 简单工厂模式 根据客户端的条件来动态实例化 去除了与具体产品的依赖
 */
class OperateFactroy{
    companion object {
        fun getOperate(operate : OperateEnum) : IOperate {
            when(operate){
                OperateEnum.ADD ->return AddOperate()
                OperateEnum.LESS -> return LessOperate()
                OperateEnum.MULT -> return MultOperate()
                OperateEnum.DIV -> return DivOperate()
            }
        }
    }

}