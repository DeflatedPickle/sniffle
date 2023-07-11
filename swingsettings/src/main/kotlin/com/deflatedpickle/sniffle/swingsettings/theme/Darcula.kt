/* Copyright (c) 2021 DeflatedPickle under the MIT license */

package com.deflatedpickle.sniffle.swingsettings.theme

import com.bulenkov.darcula.DarculaLaf
import com.deflatedpickle.sniffle.swingsettings.api.Project
import com.deflatedpickle.sniffle.swingsettings.api.Theme
import javax.swing.UIManager

object Darcula : Project("DARCULA")

object DarculaTheme :
    Theme(
        Darcula,
        "Darcula",
    ) {
    override fun changeTo() {
        UIManager.setLookAndFeel(DarculaLaf())
    }
}
