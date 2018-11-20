package com.gt.design.oberser.api

/**
 * Created by gt on 2018/11/20.
 */
class WchatObserverable:IWchatObserverable{
    val observers = ArrayList<IWchatObserver>()

    var message:String = ""
    set(value) {
        field = value
        notifyObserver()
    }
    override fun register(observer: IWchatObserver) {
        observers.add(observer)
    }

    override fun unRegister(observer: IWchatObserver) {
        if(observers.size>0){
            observers.remove(observer)
        }
    }

    /**
     * 主线程中运行
     */
    override fun notifyObserver() {
//        if(ThreadUtil.isMainThread()){
            for (observer in observers){
                observer.update(message)
            }
//        }else{
//            ThreadUtil.mainThreadPost(object : Runnable{
//                override fun run() {
//                    for (observer in observers){
//                        observer.update(message)
//                    }
//                }
//            })
//        }
    }

}