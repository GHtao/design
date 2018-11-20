package com.gt.design.oberser.api

import kotlin.concurrent.thread

/**
 * Created by gt on 2018/11/20.
 */
class WChatTest{
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val wchatObserver = WchatObserver()
            val wchatObserverable = WchatObserverable()
            wchatObserverable.register(wchatObserver)
            wchatObserverable.message = "php niu  bi!!"
            thread { wchatObserverable.message = "java niu  bi!!" }

        }
    }
}