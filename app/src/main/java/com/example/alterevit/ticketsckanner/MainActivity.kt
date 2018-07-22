package com.example.alterevit.ticketsckanner

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.main_ui.*

class MainActivity : AppCompatActivity() {

    private val TAG = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_ui)
        setSupportActionBar(toolbar)
        fab.setOnClickListener(this::clickOnFAb)
    }

    override fun onResume() {
        super.onResume()
//        with(qr_scanner) {
//            setAutoFocus(true)
//            flash = false
//            setShouldScaleToFill(true)
//            setFormats(listOf(BarcodeFormat.QR_CODE))
//            setResultHandler { result: Result ->
//                Log.i(TAG,  "text: ${result.text} \nbarcodeFormat: ${result.barcodeFormat}")
//            }
//            startCamera()
//        }
    }

    override fun onPause() {
        super.onPause()
        // qr_scanner.stopCamera()
    }

    // TODO inject like interface
    private fun clickOnFAb(view: View) {

    }
}