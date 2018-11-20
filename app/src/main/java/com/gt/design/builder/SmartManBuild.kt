package com.gt.design.builder

/**
 * Created by gt on 2018/11/20.
 */
class SmartManBuild:IBuildHuman{
    var human = com.gt.design.builder.Human()
    override fun buildHead() {
        human.head = "智商180的大脑"
    }

    override fun buildBody() {
        human.body = "智商180的身体"
    }

    override fun buildHand() {
        human.hand = "智商180的手"
    }

    override fun buildFoot() {
        human.foot = "智商180的脚"
    }

    override fun createHuman(): Human {
        return human
    }

}