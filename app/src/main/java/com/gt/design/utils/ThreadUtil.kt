package com.gt.design.utils

import android.os.Handler
import android.os.Looper

/**
 * Created by gt on 2018/11/20.
 */
class ThreadUtil{
    companion object {
        val mainThread = Looper.getMainLooper().thread
        val mainHandler = Handler(Looper.getMainLooper())
        /**
         * 判断是不是主线程
         */
        fun isMainThread():Boolean{
            return mainThread == Thread.currentThread()
        }

        /**
         * 主线程的post
         */
        fun mainThreadPost(runnable: Runnable){
            mainHandler.post(runnable)
        }
    }

}