package com.example.tvhomepage

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.leanback.widget.ListRow
import androidx.leanback.widget.Presenter
import androidx.leanback.widget.RowHeaderPresenter

class IconHeaderItemPresenter: RowHeaderPresenter() {
    private val TAG = IconHeaderItemPresenter::class.java.simpleName

    private var mUnselectedAlpha = 0f

    override fun onCreateViewHolder(viewGroup: ViewGroup): ViewHolder? {
        mUnselectedAlpha = viewGroup.resources
            .getFraction(R.fraction.lb_browse_header_unselect_alpha, 1, 1)
        val inflater = viewGroup.context
            .getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = inflater.inflate(R.layout.icon_header_item, null)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: Presenter.ViewHolder, o: Any) {
        val iconHeaderItem = (o as ListRow).headerItem as IconHeaderItem
        val rootView = viewHolder.view
        val iconView = rootView.findViewById<View>(R.id.header_icon) as ImageView
        val iconResId = iconHeaderItem.getIconResId()
        if (iconResId != iconHeaderItem.ICON_NONE) { // Show icon only when it is set.
            val icon = rootView.resources.getDrawable(iconResId, null)
            iconView.setImageDrawable(icon)
        }
        val label =
            rootView.findViewById<View>(R.id.header_label) as TextView
        label.text = iconHeaderItem.name
    }

    override fun onUnbindViewHolder(viewHolder: Presenter.ViewHolder?) { // no op
    }



}