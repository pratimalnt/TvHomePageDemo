package com.example.tvhomepage

import android.view.ViewGroup
import androidx.leanback.widget.ItemBridgeAdapter
import androidx.leanback.widget.ListRow
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
        val rowItem: CustomListRow = item as CustomListRow
        //val numRows: Int = (item as CustomListRow).getNumRows()
        //rowView.getGridView()!!.setNumRows(numRows)
        val mItemBridgeAdapter = ItemBridgeAdapter()
       // mItemBridgeAdapter.setAdapter(rowItem.getAdapter())
        //rowView.getGridView()!!.adapter = mItemBridgeAdapter

        rowView.getGridView()!!.contentDescription = rowItem.getContentDescription()
        super.onBindRowViewHolder(holder, item)
    }

    override fun initializeRowViewHolder(holder: RowPresenter.ViewHolder?) {
        super.initializeRowViewHolder(holder)
        /* Disable Shadow */ // setShadowEnabled(false);
    }
}