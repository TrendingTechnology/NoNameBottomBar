package com.doctorblue.noname_library

import android.graphics.RectF
import android.graphics.drawable.Drawable

data class BottomBarItem (
    var title: String,
    val icon: Drawable,
    val activatedIcon:Drawable?,
    var rect: RectF = RectF(),
    var alpha: Int
)