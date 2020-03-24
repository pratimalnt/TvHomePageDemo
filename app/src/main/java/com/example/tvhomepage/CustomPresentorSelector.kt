package com.example.tvhomepage

import androidx.leanback.widget.HeaderItem
import androidx.leanback.widget.Presenter
import androidx.leanback.widget.PresenterSelector

class CustomPresentorSelector: PresenterSelector {
    private val mListRowPresenter: CustomListRowPresenter = CustomListRowPresenter()

    constructor(){
        mListRowPresenter.setNumRows(1)
       mListRowPresenter.headerPresenter = IconHeaderItemPresenter()
    }
    override fun getPresenter(item: Any?): Presenter {
       // val listRow: CustomListRow = item as CustomListRow
        return mListRowPresenter
    }
}