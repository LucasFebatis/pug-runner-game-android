package com.febatis.mygamehtml.view

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import com.febatis.mygamehtml.R
import kotlinx.android.synthetic.main.view_loading.view.*

class LoadingView(context: Context, attributes: AttributeSet) :
    LinearLayout(context, attributes) {

    init {
        inflate(context, R.layout.view_loading, this)
    }

    fun setText(text:String) {
        loadingText.text = text
    }

}