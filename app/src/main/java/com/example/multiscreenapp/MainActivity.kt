package com.example.multiscreenapp
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {

    //creating key
    companion object{
        const val KEY = "com.example.multiscreen.KEY"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        btnOrder.setOnClickListener {
            val ordersPlaced = eT1.text.toString() + " " + eT2.text.toString() + " " + eT3.text.toString() + " " + eT4.text.toString()

            //here we are gonna apply intent concept

            intent = Intent(this,Order::class.java)
            intent.putExtra(KEY,ordersPlaced)
            startActivity(intent)
        }

    }
}