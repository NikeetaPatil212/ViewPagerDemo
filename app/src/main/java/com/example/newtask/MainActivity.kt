package com.example.newtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageObjects : MutableList<Images>  = mutableListOf()
        imageObjects.add(Images(R.drawable.offer,"Diwali Offer"))
        imageObjects.add(Images(R.drawable.kids1,"Kids Design"))
        imageObjects.add(Images(R.drawable.boys,"Boys Fashion"))
        imageObjects.add(Images(R.drawable.girls1,"Girls Kurta Collection"))


        viewPage.adapter = viewPagerAdapter(imageObjects)

    }

}