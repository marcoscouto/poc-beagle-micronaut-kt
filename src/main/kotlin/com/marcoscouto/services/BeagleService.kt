package com.marcoscouto.services

import br.com.zup.beagle.widget.Widget
import br.com.zup.beagle.widget.action.Action
import br.com.zup.beagle.widget.action.Alert
import br.com.zup.beagle.widget.core.TextAlignment
import br.com.zup.beagle.widget.layout.Screen
import br.com.zup.beagle.widget.layout.ScreenBuilder
import br.com.zup.beagle.widget.ui.Text
import javax.inject.Singleton

@Singleton
class BeagleService {

    fun createAction(): Action = Alert(
        title = "My Dialog",
        message = "This is a native popup!",
        labelOk= "Close"
    )

    fun createScreen(): Screen =
        Screen(child = this.createWidget())

    fun createScreenBuilder(): ScreenBuilder =
        BeagleScreenBuilder(this.createWidget())

    fun createWidget(): Widget = Text(
        text = "Hello, world!",
        alignment = TextAlignment.CENTER,
        textColor = "#505050"
    )
}

