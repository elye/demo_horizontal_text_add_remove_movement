package com.elyeproj.horizontaltextarragement

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.transition.TransitionManager
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_constraint_space.*
import kotlinx.android.synthetic.main.layout_equal_space.*
import kotlinx.android.synthetic.main.layout_wrap_space.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_normal_remove.setOnClickListener {
            if (txt_worst_normal.visibility == View.VISIBLE) {
                txt_worst_normal.visibility = View.GONE
            } else {
                txt_worst_normal.visibility = View.VISIBLE
            }
        }

        btn_wrap_remove.setOnClickListener {
            if (txt_worst_wrap.visibility == View.VISIBLE) {
                txt_worst_wrap.visibility = View.GONE
                space_worst_wrap.visibility = View.GONE
            } else {
                txt_worst_wrap.visibility = View.VISIBLE
                space_worst_wrap.visibility = View.VISIBLE
            }
        }

        btn_constraint_remove.setOnClickListener {
            if (txt_worst_constraint.visibility == View.VISIBLE) {
                txt_worst_constraint.visibility = View.GONE
            } else {
                txt_worst_constraint.visibility = View.VISIBLE
            }
        }
    }
}
