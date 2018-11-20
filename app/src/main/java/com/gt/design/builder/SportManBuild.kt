package com.gt.design.builder

/**
 * Created by gt on 2018/11/20.
 */
class SportManBuild:IBuildHuman{
    var human = Human()
    override fun buildHead() {
        human.head = ("运动员的大脑")
    }

    override fun buildBody() {
        human.body = ("运动员的身体")
    }

    override fun buildHand() {
        human.hand = ("运动员的手")
    }

    override fun buildFoot() {
        human.foot = ("运动员的脚")
    }

    override fun createHuman(): Human {
        return human
    }

}
