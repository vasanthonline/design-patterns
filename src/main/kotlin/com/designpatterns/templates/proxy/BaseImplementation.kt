package com.designpatterns.templates.proxy

class BaseImplementation: BaseInterface {
    override fun run(variant: String): String {
        return "Base Implementation received variant: $variant"
    }

}