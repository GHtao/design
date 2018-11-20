package com.gt.design.builder

/**
 * Created by gt on 2018/11/20.
 */
class Director{
    /**
     * 需要具体的实例类 来做构建
     */
    fun buildHuman(human:IBuildHuman):Human{
        human.buildHead()
        human.buildBody()
        human.buildHand()
        human.buildFoot()
        return human.createHuman()
    }
}