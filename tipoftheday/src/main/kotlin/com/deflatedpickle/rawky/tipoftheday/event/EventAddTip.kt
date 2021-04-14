/* Copyright (c) 2020 DeflatedPickle under the MIT license */

package com.deflatedpickle.rawky.tipoftheday.event

import com.deflatedpickle.haruhi.api.event.AbstractEvent
import org.jdesktop.swingx.tips.TipOfTheDayModel

object EventAddTip : AbstractEvent<MutableList<TipOfTheDayModel.Tip>>()
