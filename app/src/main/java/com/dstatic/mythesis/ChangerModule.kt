package com.dstatic.mythesis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.cardview.widget.CardView
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_air_solenoid_valve.*
import java.util.*

class ChangerModule : AppCompatActivity() {

    private var currentPage = 0
    private var numPages = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_changer_module)

        val images = listOf(
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2FChanger%20module.jpg?alt=media&token=590a76dc-08ad-478e-ad4f-b132c52bd6b2",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2FChanger%20module2.JPG?alt=media&token=f7620cf8-6e64-4db1-b550-77017dba90aa",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2FChanger%20module3.JPG?alt=media&token=0dc3e411-6daf-45ed-b74d-313990721e56",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2FChanger%20module4.JPG?alt=media&token=b38c8277-d5dd-48e1-b731-f904a3ce4805",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2FChanger%20module5.JPG?alt=media&token=8adeedfe-a26e-4c32-836a-4f7c10415739"
        )

        createSlider(images)

        val backButton = findViewById<CardView>(R.id.back)
        val camButton = findViewById<CardView>(R.id.camBtn)

        backButton.setOnClickListener {
            onBackPressed()
        }

        camButton.setOnClickListener {
            val intent = Intent(this, MenuScannerActivity::class.java)
            startActivity(intent)
        }
    }

    private fun createSlider(string: List<String>) {

        vpSlider.adapter = SliderAdapter(this, string)
        indicator.setViewPager(vpSlider)
        val density = resources.displayMetrics.density
        //Set circle indicator radius
        indicator.radius = 5 * density
        numPages = string.size
        // Auto getData of viewpager
        val update = Runnable {
            if (currentPage === numPages) {
                currentPage = 0
            }
            vpSlider.setCurrentItem(currentPage++, true)
        }
        val swipeTimer = Timer()
        swipeTimer.schedule(object : TimerTask() {
            override fun run() {
                Handler(Looper.getMainLooper()).post(update)
            }
        }, 5000, 5000)
        // Pager listener over indicator
        indicator.setOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageSelected(position: Int) {
                currentPage = position
            }

            override fun onPageScrolled(pos: Int, arg1: Float, arg2: Int) {}
            override fun onPageScrollStateChanged(pos: Int) {}
        })
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}