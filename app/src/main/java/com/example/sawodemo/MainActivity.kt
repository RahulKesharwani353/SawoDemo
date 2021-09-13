package com.example.sawodemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sawodemo.databinding.ActivityMainBinding
import com.sawolabs.androidsdk.Sawo

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginBtn.setOnClickListener {
            Sawo(
                this,
                "bedc5548-0e21-4a82-91c1-2739545af9a4", // your api key
                "613cd714ddeacf55b9696d79OJSfITQuFMLiGnocOblpSdsC"  // your api key secret
            ).login(
                "email", // can be one of 'email' or 'phone_number_sms'
                HomeActivity::class.java.name // Callback class name
            )
        }
    }
}