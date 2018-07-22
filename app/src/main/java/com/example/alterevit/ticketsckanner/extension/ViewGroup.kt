package com.example.alterevit.ticketsckanner.extension

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

fun ViewGroup.inflate(
    layoutId: Int,
    attachToRoot: Boolean = false,
    initView: (View.() -> Unit)? = null
): View =
    LayoutInflater.from(context).inflate(layoutId, this, attachToRoot).apply { initView?.invoke(this) }