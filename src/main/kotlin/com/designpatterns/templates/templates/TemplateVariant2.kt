package com.designpatterns.templates.templates

class TemplateVariant2: BaseTemplate() {

    override fun run(param: String): String {
        return "Running from template variant 2 with param: $param"
    }
    override fun execute(param: String): String {
        return "Executing from template variant 2 with param: $param"
    }
}