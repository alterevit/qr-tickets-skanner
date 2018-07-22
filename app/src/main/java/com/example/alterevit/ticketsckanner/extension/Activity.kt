package com.example.alterevit.ticketsckanner.extension

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity
import android.support.v4.app.FragmentTransaction
import com.example.alterevit.ticketsckanner.R

fun FragmentActivity.openFragment(
    fragment: Fragment,
    transactionConfig: (FragmentTransaction.() -> Unit)? = null
) = supportFragmentManager?.beginTransaction()?.apply {
    setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
    replace(R.id.fragmentContainer, fragment, fragment::class.java.simpleName)
    transactionConfig?.invoke(this)
    commit()
}
