package com.example.game

import android.content.Context
import android.util.AttributeSet
import android.widget.Button

class SquareButton : Button {
    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec)
        if(widthMeasureSpec < heightMeasureSpec) {
            setMeasuredDimension(widthMeasureSpec, widthMeasureSpec)
        } else {
            setMeasuredDimension(heightMeasureSpec, heightMeasureSpec)
        }
        print(widthMeasureSpec + heightMeasureSpec)
    }
}