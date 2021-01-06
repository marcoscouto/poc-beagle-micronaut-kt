package com.marcoscouto.services

import br.com.zup.beagle.core.ServerDrivenComponent
import br.com.zup.beagle.widget.layout.Screen
import br.com.zup.beagle.widget.layout.ScreenBuilder

class BeagleScreenBuilder(private val component: ServerDrivenComponent): ScreenBuilder {

    override fun build(): Screen = Screen(child = this.component)

}