package com.example.alterevit.ticketsckanner.ui.scanner

import android.content.ContentValues.TAG
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.alterevit.ticketsckanner.R
import com.example.alterevit.ticketsckanner.extension.inflate
import com.google.zxing.BarcodeFormat
import com.google.zxing.Result
import kotlinx.android.synthetic.main.fragment_scanner.*

class ScannerFragment : Fragment()  {

    companion object {
        val DEFAULT_INSTANCE get() = ScannerFragment().apply {
            arguments = Bundle()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return container?.inflate(R.layout.fragment_scanner)
    }

    override fun onResume() {
        super.onResume()
        with(scanner) {
            setAutoFocus(true)
            flash = false
            setShouldScaleToFill(true)
            setFormats(listOf(BarcodeFormat.QR_CODE))
            setResultHandler { result: Result ->
                Log.i(TAG,  "text: ${result.text} \nbarcodeFormat: ${result.barcodeFormat}")
            }
            startCamera()
        }
    }

    override fun onPause() {
        super.onPause()
        scanner.stopCamera()
    }
}