package com.example.multiscreenapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlinx.android.synthetic.main.activity_order.tvOrder

class Order : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_order)

        //now we write a code for getting order from Main Activity

        val ordersOfCustomer = intent.getStringExtra(MainActivity.KEY)
        tvOrder.text = "Order Placed" + ordersOfCustomer.toString()

    }
}