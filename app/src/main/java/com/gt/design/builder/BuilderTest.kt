package com.gt.design.builder

import com.gt.design.utils.SysoUtil

/**
 * Created by gt on 2018/11/20.
 */
class BuilderTest{
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val director = Director()
            val smartManBuild = SmartManBuild()
            var human = director.buildHuman(smartManBuild)
            SysoUtil.syso("smart:${human.head}")

            val sportManBuild = SportManBuild()
            val sportHuman = director.buildHuman(sportManBuild)
            SysoUtil.syso("sport:${sportHuman.body}")

        }
    }
}