package com.designpatterns.templates.strategy

class StrategyVariant1: Strategy {
    override fun execute(param: String): String {
        return "Executing strategy variant 1 with param $param"
    }
}