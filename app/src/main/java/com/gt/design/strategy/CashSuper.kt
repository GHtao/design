package com.gt.design.strategy

/**
 * Created by gt on 2018/11/16.
 * 抽象的算法类 让子类来继承
 */
abstract class CashSuper{
    //子类的算法
    abstract fun algorit(money : Float) : Float
}