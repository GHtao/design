package com.gt.design.proxy.simple

/**
 * Created by gt on 2018/11/19.
 */
class SimplyProxyTest{
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val girl = SchoolGirl("mei nv")
            val simplyProxy = SimplyProxy(girl)
            simplyProxy.giveChocolate()
        }
    }
}