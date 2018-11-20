package com.gt.design.builder

/**
 * Created by gt on 2018/11/20.
 * 构建需要的接口数据 确保所有的数据都创建了
 */
interface IBuildHuman{
    fun buildHead()
    fun buildBody()
    fun buildHand()
    fun buildFoot()
    fun createHuman():Human
}