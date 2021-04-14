/* Copyright (c) 2020 DeflatedPickle under the MIT license */

package com.deflatedpickle.rawky.settings.widget

import java.awt.Color
import java.awt.Font
import javax.swing.JLabel

class ErrorLabel(text: String) : JLabel("<html>$text</html>") {
    init {
        this.font = this.font.deriveFont(Font.BOLD)
        this.foreground = Color.RED
    }
}
