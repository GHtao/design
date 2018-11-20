package com.gt.design.factroy.simple

/**
 * Created by gt on 2018/11/20.
 * 工厂方法的接口类 开闭原则 不再修改工厂类
 */
interface IFactroy{
    fun getOperateFactroy():IOperate
}