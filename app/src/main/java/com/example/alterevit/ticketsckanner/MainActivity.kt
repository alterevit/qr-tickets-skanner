package com.example.alterevit.ticketsckanner

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.example.alterevit.ticketsckanner.extension.replaceFragment
import com.example.alterevit.ticketsckanner.ui.scanner.ScannerFragment
import kotlinx.android.synthetic.main.main_ui.*

class MainActivity : AppCompatActivity() {

    private val TAG = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_ui)
        setSupportActionBar(toolbar)
        fab.setOnClickListener(this::clickOnFAb)
    }

    // TODO inject like interface
    private fun clickOnFAb(view: View) {
        replaceFragment(ScannerFragment.DEFAULT_INSTANCE)
    }
}