package com.designpatterns.templates.strategy

class StrategyVariant2: Strategy {
    override fun execute(param: String): String {
        return "Executing strategy variant 2 with param $param"
    }
}