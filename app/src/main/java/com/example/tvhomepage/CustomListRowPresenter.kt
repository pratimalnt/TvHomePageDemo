package com.example.tvhomepage

import android.view.ViewGroup
import androidx.leanback.widget.ListRowPresenter
import androidx.leanback.widget.RowPresenter

class CustomListRowPresenter : ListRowPresenter() {
    private val TAG = CustomListRowPresenter::class.java.simpleName
    private lateinit var rowView: CustomListRowView

    override fun createRowViewHolder(parent: ViewGroup): RowPresenter.ViewHolder? {
        rowView = CustomListRowView(parent.context, null, -1)
        rowView.getGridView()!!.setRowHeight(300)

        //rowView.getTextView()
        return ViewHolder(rowView, rowView.getGridView(), this)
    }

    override fun onBindRowViewHolder(
        holder: RowPresenter.ViewHolder,
        item: Any
    ) {
        val numRows = (item as CustomListRow).getNumRows()
        (holder as ViewHolder).gridView.setNumRows(numRows)

        super.onBindRowViewHolder(holder, item)

    }

    override fun initializeRowViewHolder(holder: RowPresenter.ViewHolder?) {
        super.initializeRowViewHolder(holder)
        /* Disable Shadow */ // setShadowEnabled(false);
    }
}