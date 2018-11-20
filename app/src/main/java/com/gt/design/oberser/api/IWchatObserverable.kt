package com.gt.design.oberser.api

/**
 * Created by gt on 2018/11/20.
 */
interface IWchatObserverable{
    fun register(observer: IWchatObserver)
    fun unRegister(observer: IWchatObserver)
    fun notifyObserver()
}