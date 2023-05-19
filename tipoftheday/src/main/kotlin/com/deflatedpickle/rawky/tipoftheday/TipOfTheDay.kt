/* Copyright (c) 2020 DeflatedPickle under the MIT license */

package com.deflatedpickle.rawky.tipoftheday

import com.deflatedpickle.haruhi.Haruhi
import com.deflatedpickle.haruhi.api.plugin.Plugin
import com.deflatedpickle.haruhi.api.plugin.PluginType
import com.deflatedpickle.haruhi.event.EventWindowShown
import com.deflatedpickle.haruhi.util.PluginUtil
import com.deflatedpickle.rawky.tipoftheday.event.EventAddTip
import org.jdesktop.swingx.JXTipOfTheDay
import org.jdesktop.swingx.tips.DefaultTipOfTheDayModel
import org.jdesktop.swingx.tips.TipOfTheDayModel

@Plugin(
    value = "tip_of_the_day",
    author = "DeflatedPickle",
    version = "1.0.0",
    description = """
        <br>
        Provides a dialog to show tips other plugins have registered
    """,
    type = PluginType.API
)
@Suppress("unused")
object TipOfTheDay {
    private val tips = mutableListOf<TipOfTheDayModel.Tip>()

    init {
        EventWindowShown.addListener {
            if (it != Haruhi.window) return@addListener

            EventAddTip.trigger(this.tips)

            if (this.tips.size > 0) {
                val model = DefaultTipOfTheDayModel(this.tips)
                val tipOfTheDay = JXTipOfTheDay(model)
                tipOfTheDay.showDialog(it)
            }
        }

        /*EventAddTip.addListener {
            it.add(object : TipOfTheDayModel.Tip {
                override fun getTipName(): String = "Example"
                override fun getTip(): Any = "You can easily add new tips for plugins"
            })
        }*/
    }
}
