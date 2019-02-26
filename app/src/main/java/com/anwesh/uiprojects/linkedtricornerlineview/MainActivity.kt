package com.anwesh.uiprojects.linkedtricornerlineview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.tricornerlineview.TriCornerLineView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        TriCornerLineView.create(this)
    }
}
