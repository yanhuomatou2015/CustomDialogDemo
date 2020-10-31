package com.winzhibin.customdialog

import android.app.Dialog
import android.content.Context
import android.view.Gravity
import android.view.ViewGroup
import android.widget.Button
import kotlinx.android.synthetic.main.dialog_layout.*
import org.jetbrains.anko.sdk27.coroutines.onClick
/**
 * Created by wenzhibin(yanhuomatou2015) on 2020/10/31.
 * 
 */
class BottomUpDialog :Dialog {

    private val mBtncancle: Button by lazy {
        btn_cancel
    }

    //一个参数的构造方法调用两个参数的构造方法
    constructor(context: Context?): this(context,0)
    constructor(context: Context?,themeResId:Int):super(context!!,R.style.bottom_dialog){//引入自定义样式
        //关联自定义dialog布局
        setContentView(R.layout.dialog_layout)
        //设置大小：宽度，高度
        window!!.setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT)
        //设置位置：底部显示
        window!!.setGravity(Gravity.BOTTOM)

        mBtncancle.onClick { dismiss() }

    }

}