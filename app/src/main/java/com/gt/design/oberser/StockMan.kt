package com.gt.design.oberser

import com.gt.design.utils.SysoUtil

/**
 * Created by gt on 2018/11/20.
 */
class StockMan:IOberser{

    override fun update() {
        SysoUtil.syso("不能再看股票了")
    }

}