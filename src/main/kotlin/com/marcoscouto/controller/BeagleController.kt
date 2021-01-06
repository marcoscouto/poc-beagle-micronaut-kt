package com.marcoscouto.controller

import com.marcoscouto.services.BeagleService
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller
class BeagleController(private val service: BeagleService) {

    @Get("/action")
    fun getAction() = service.createAction()

    @Get("/screen")
    fun getScreen() = service.createScreen()

    @Get("/builder")
    fun getScreenBuilder() = service.createScreenBuilder()

    @Get("/widget")
    fun getWidget() = service.createWidget()

}