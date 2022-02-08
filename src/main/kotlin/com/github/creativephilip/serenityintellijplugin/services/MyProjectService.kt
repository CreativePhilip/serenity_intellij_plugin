package com.github.creativephilip.serenityintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.creativephilip.serenityintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
