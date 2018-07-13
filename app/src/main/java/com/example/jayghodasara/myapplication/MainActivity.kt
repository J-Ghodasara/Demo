package com.example.jayghodasara.myapplication

import android.graphics.drawable.Drawable
import android.graphics.drawable.LayerDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var layers:Array<Drawable> = arrayOf(resources.getDrawable(R.drawable.a),resources.getDrawable(R.drawable.d))
        var layerDrawable:LayerDrawable= LayerDrawable(layers)
        img.setImageDrawable(layerDrawable)

    }
}
