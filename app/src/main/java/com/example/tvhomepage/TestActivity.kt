package com.example.tvhomepage

import android.app.Activity
import android.os.Bundle
import androidx.leanback.widget.ArrayObjectAdapter
import androidx.leanback.widget.ItemBridgeAdapter
import kotlinx.android.synthetic.main.vertical_grid_view.*
import java.util.*

class TestActivity : Activity() {

    private var mRowsAdapter: ArrayObjectAdapter? = null
    private val NUM_ROWS = 10
    private val NUM_COLS = 15
    private val sCardPresenter = CardPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val list = MovieList.list
        val newPresenterSelector = CustomPresentorSelector()
        val customListRowPresenter = CustomListRowPresenter()
        mRowsAdapter = ArrayObjectAdapter(newPresenterSelector)
        var i: Int
        for (i in 0 until NUM_ROWS){
            if (i != 0) {
                Collections.shuffle(list)
            }
            val listRowAdapter = ArrayObjectAdapter(sCardPresenter)
            for (j in 0 until NUM_COLS ) {
                listRowAdapter.add(list[j % 5])
            }
            val header = IconHeaderItem(0,"GridItemPresenter ", R.drawable.movie)
            mRowsAdapter!!.add(CustomListRow(header, listRowAdapter))
        }
        val itemBridgeAdapter = ItemBridgeAdapter(mRowsAdapter)
        setContentView(R.layout.vertical_grid_view)
        main_grid_view.adapter = itemBridgeAdapter

    }

}