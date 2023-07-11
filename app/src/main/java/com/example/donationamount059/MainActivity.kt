package com.example.donationamount059

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.donationamount059.Presenter.DonationPresenter
import com.example.donationamount059.Presenter.IViewPresenter
import com.example.donationamount059.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),IViewPresenter {




    private lateinit var binding: ActivityMainBinding
    private lateinit var presenter: DonationPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // inicialiar controller
       presenter = DonationPresenter(this)
        binding.button.setOnClickListener { makeDonation() }
    }

    private fun makeDonation() {

        presenter.saveDonation(binding.tvDonation.text.toString())
         binding.tvDonation.setText("")
        presenter.totalDonation()
        presenter.cketTotal()

        }

    // implementar la interfaz View

    override fun updateTotalDonation(totalAmount: Int) {
        val total = getString(R.string.total_donaciones, totalAmount.toString())
        binding.tvTotal.text=total
    }

    override fun displayConfirmationMessage() {
        val toast = Toast.makeText(applicationContext, "Donacion exitosa", Toast.LENGTH_LONG)
        toast.show()
    }

    override fun displayErrorMessage() {
        val toast1 = Toast.makeText(applicationContext, "Donacion Fallida", Toast.LENGTH_LONG)
        toast1.show()
    }

    override fun displayColorAlert(color: String) {
       binding.textView2.setBackgroundColor(Color.parseColor(color))
    }


}