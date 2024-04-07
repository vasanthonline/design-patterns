package com.designpatterns.templates.templates

class TemplateVariant1: BaseTemplate() {
    override fun execute(param: String): String {
        return "Executing from template variant 1 with param: $param"
    }
}