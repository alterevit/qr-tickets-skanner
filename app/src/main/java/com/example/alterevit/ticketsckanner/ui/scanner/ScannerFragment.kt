package com.example.alterevit.ticketsckanner.ui.scanner

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.alterevit.ticketsckanner.R
import com.example.alterevit.ticketsckanner.extension.inflate
import com.example.alterevit.ticketsckanner.extension.replaceFragment
import com.example.alterevit.ticketsckanner.ui.ticket.TicketFragmet
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
                activity?.replaceFragment(TicketFragmet.getInstance(result.text))
            }
            startCamera()
        }
    }

    override fun onPause() {
        super.onPause()
        scanner.stopCamera()
    }
}