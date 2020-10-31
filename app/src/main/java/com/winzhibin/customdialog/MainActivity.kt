package com.winzhibin.customdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.sdk27.coroutines.onClick
/**
 * Created by wenzhibin(yanhuomatou2015) on 2020/10/31.
 *
 */
class MainActivity : AppCompatActivity() {

    //初始化buttom
   private val mBtn :Button by lazy {
        btn
    }

    //初始化BottomUpDialog
    private val mBottomUpDialog :BottomUpDialog by lazy {
        BottomUpDialog(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mBtn.onClick {
            //显示弹窗
            mBottomUpDialog.show()
        }
    }
}
