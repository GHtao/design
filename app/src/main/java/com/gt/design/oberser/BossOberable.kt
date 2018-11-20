package com.gt.design.oberser

/**
 * Created by gt on 2018/11/20.
 */
class BossOberable:IOberable{
    val observers:ArrayList<IOberser> = ArrayList()
    /**
     * 添加观察者
     */
    fun addObserver(observer: IOberser){
        observers.add(observer)
    }

    /**
     * 移出观察者
     */
    fun removeObserver(observer: IOberser){
        observers.remove(observer)
    }

    /**
     * 通知观察者
     */
    override fun notifyOberser() {
        for(oberser in observers){
            oberser.update()
        }
    }

}