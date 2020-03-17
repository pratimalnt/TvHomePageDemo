package com.example.tvhomepage

import androidx.leanback.widget.HeaderItem

class IconHeaderItem(id: Long, name: String?) : HeaderItem(id, name) {
    private val TAG = IconHeaderItem::class.java.simpleName
    val ICON_NONE = -1
    private var mIconResId: Int = ICON_NONE
    constructor(id: Long, name: String?, resId: Int):this(id, name){
        this.mIconResId = resId
    }

    fun getIconResId(): Int {
        return mIconResId
    }
}