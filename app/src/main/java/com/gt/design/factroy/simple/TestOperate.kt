package com.gt.design.factroy.simple

import com.gt.design.utils.SysoUtil

/**
 * Created by gt on 2018/11/16.
 */
class TestOperate{
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val addOperate =
                OperateFactroy.getOperate(OperateEnum.ADD)
            var result = addOperate.getResult(11.1f,22.2f)

            val divOperate =
                OperateFactroy.getOperate(OperateEnum.DIV)
            val divResult = divOperate.getResult(10f,3f)

            val multOperater =
                OperateFactroy.getOperate(OperateEnum.MULT)
            val multResult = multOperater.getResult(11.1f, 22.2f)

//            System.out.print("mult result:"+multResult)
            val addFactroy = AddFactroy()
            val addMethodOperate = addFactroy.getOperateFactroy()
            result = addMethodOperate.getResult(11.3f,66.6f)
            SysoUtil.syso("result:$result")

        }
    }
}