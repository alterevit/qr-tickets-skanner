package com.example.alterevit.ticketsckanner.ui.ticket

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.alterevit.ticketsckanner.R
import com.example.alterevit.ticketsckanner.extension.inflate
import kotlinx.android.synthetic.main.fragment_ticket.*

class TicketFragmet : Fragment() {

    private val scannerResult by lazy { arguments?.getString(SCANNER_RESULT)!! }

    companion object {

        private const val SCANNER_RESULT = "scanner_result"

        fun getInstance(scannerResult: String) = TicketFragmet().apply {
            arguments = Bundle().apply {
                putString(SCANNER_RESULT, scannerResult)
            }
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return container?.inflate(R.layout.fragment_ticket)
    }

    override fun onResume() {
        super.onResume()
        tvScannerResult.text = scannerResult
    }
}