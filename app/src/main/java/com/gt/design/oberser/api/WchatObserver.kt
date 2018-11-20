package com.gt.design.oberser.api

import com.gt.design.utils.SysoUtil

/**
 * Created by gt on 2018/11/20.
 */
class WchatObserver:IWchatObserver{

    override fun update(message:Any?) {
        SysoUtil.syso("update:${message.toString()}   thread:${Thread.currentThread()}")
    }

}