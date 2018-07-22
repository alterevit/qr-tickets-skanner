package com.example.alterevit.ticketsckanner

import android.app.Activity
import android.os.Bundle

class MainActivity : Activity() {

    private val TAG = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_ui)
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
}