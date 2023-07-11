package com.example.donationamount059

class Controller {


    // comunicar con el model la referencia a la clase Model

    private val model : DonationModel
    init {
        model = DonationModel()
    }


    // llamar la funcion del model guardar
    fun saveDonation(amount: String): Boolean{

        return model.saveDonation(amount)

    }

    // llamar la funcion  del model que mostrara las donaciones

    fun totalDonation(): Int{
        return  model.getDonationAmount()
    }



}