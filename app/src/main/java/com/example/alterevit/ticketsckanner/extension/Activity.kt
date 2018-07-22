package com.example.alterevit.ticketsckanner.extension

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity
import android.support.v4.app.FragmentTransaction
import com.example.alterevit.ticketsckanner.R

const val FRAGMENT_CONTAINER = R.id.fragmentContainer

fun FragmentActivity.replaceFragment(
    fragment: Fragment,
    container: Int = FRAGMENT_CONTAINER,
    transactionConfig: (FragmentTransaction.() -> Unit)? = null
) = supportFragmentManager?.beginTransaction()?.apply {
    setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
    replace(container, fragment, fragment::class.java.simpleName)
    transactionConfig?.invoke(this)
}?.commit()
