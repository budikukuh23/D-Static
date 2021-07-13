package com.dstatic.mythesis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.cardview.widget.CardView
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_push_in_bulkhead_connector.*
import java.util.*

class PushInBulkheadConnector : AppCompatActivity() {

    private var currentPage = 0
    private var numPages = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_push_in_bulkhead_connector)

        val images = listOf(
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPush-in%20bulkhead%20connector%2Fpush_in_bulkhead_connector1.jpg?alt=media&token=6ac3da0b-f2ab-4332-a831-9af87753bb30",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPush-in%20bulkhead%20connector%2Fpush_in_bulkhead_connector2.jpg?alt=media&token=edc89393-b6b0-45ab-a319-65ce70d38762",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPush-in%20bulkhead%20connector%2Fpush_in_bulkhead_connector3.jpg?alt=media&token=b9cb077a-184d-4caf-aa5e-c3987c8fb328",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPush-in%20bulkhead%20connector%2Fpush_in_bulkhead_connector4.jpg?alt=media&token=b76b6686-a212-4883-9fb2-9ac57e199451",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPush-in%20bulkhead%20connector%2Fpush_in_bulkhead_connector5.jpg?alt=media&token=fc9b9cb4-7a8f-45eb-a4ba-a3aed206ee2a",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPush-in%20bulkhead%20connector%2Fpush_in_bulkhead_connector6.jpg?alt=media&token=510986fb-e358-49df-ab1f-15c6f069b0d5"
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
}