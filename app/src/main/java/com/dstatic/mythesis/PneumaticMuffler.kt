package com.dstatic.mythesis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.cardview.widget.CardView
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_pneumatic_muffler.*
import java.util.*

class PneumaticMuffler : AppCompatActivity() {

    private var currentPage = 0
    private var numPages = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pneumatic_muffler)

        val images = listOf(
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPneumatic%20muffler%2Fpneumatic_muffler1.jpg?alt=media&token=eedd0ad7-dce7-4ddb-aff8-5b6ec877b0bf",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPneumatic%20muffler%2Fpneumatic_muffler2.jpg?alt=media&token=c0c109a7-8768-4260-8dfe-b053d40bb57a",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPneumatic%20muffler%2Fpneumatic_muffler3.jpg?alt=media&token=41f40bd4-7097-44b1-bd25-578a11d6b5a7",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPneumatic%20muffler%2Fpneumatic_muffler4.jpg?alt=media&token=2300351c-3ded-4b15-ad72-0a54438a82a5",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPneumatic%20muffler%2Fpneumatic_muffler5.jpg?alt=media&token=1fee2691-ff80-4b9f-b633-95646bfcae53"
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