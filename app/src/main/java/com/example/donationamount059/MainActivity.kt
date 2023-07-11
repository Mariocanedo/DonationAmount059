package com.example.donationamount059

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.donationamount059.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {




    private lateinit var binding: ActivityMainBinding
    private lateinit var controller: Controller

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // inicialiar controller
        controller = Controller()
        binding.button.setOnClickListener { makeDonation() }
    }

    private fun makeDonation() {

        val donation = controller.saveDonation(binding.tvDonation.text.toString())
        if (donation) {
            val totalDonation = controller.totalDonation()
            // recibir el total de las donaciones
            val total = getString(R.string.total_donaciones, totalDonation.toString())
            binding.tvTotal.text = total
            binding.tvDonation.setText("")
            val toast = Toast.makeText(applicationContext, "Donacion exitosa", Toast.LENGTH_LONG)
            toast.show()

        } else {

            val toast1 = Toast.makeText(applicationContext, "Donacion Fallida", Toast.LENGTH_LONG)
            toast1.show()
        }


    }





}