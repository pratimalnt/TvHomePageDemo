package com.example.tvhomepage

import androidx.leanback.widget.HeaderItem
import androidx.leanback.widget.ListRow
import androidx.leanback.widget.ObjectAdapter
import androidx.leanback.widget.Row

class CustomListRow(header: HeaderItem?, adapter: ObjectAdapter?) : ListRow(header, adapter) {
    private val TAG = CustomListRow::class.java.simpleName
    private var mNumRows = 1

    fun setNumRows(numRows: Int) {
        mNumRows = numRows
    }

    fun getNumRows(): Int {
        return mNumRows
    }

}