package com.example.tvhomepage

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.leanback.widget.HorizontalGridView
import kotlinx.android.synthetic.main.horizontal_gird_view.view.*

class CustomListRowView(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) :
    LinearLayout(context, attrs, defStyleAttr) {



   init {
       LayoutInflater.from(context).inflate(R.layout.horizontal_gird_view,this)
   }

    fun getGridView(): HorizontalGridView {
        return grid_view

    }

 /*   fun getTextView(): TextView {

        return mTextView
    }
*/


}