package com.example.alterevit.ticketsckanner.ui.list_ticket

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.alterevit.ticketsckanner.R
import com.example.alterevit.ticketsckanner.extension.inflate

class TicketListFragment : Fragment() {

    companion object {
        val DEFAULT_INSTANCE get() = TicketListFragment().apply {
            arguments = Bundle()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return container?.inflate(R.layout.fragment_list_ticket)
    }
}