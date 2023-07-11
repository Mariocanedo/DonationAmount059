package com.example.donationamount059.Presenter

import com.example.donationamount059.Model.DonationModel

class DonationPresenter(private val view:IViewPresenter) {


    // comunicar con el model la referencia a la clase Model

    private val model : DonationModel
    init {
        model = DonationModel()
    }


    // llamar la funcion del model guardar
    fun saveDonation(donation: String) {
        if (model.saveDonation(donation)) {
            view.displayConfirmationMessage()
            view.updateTotalDonation(model.getDonationAmount())
        } else {
            view.displayErrorMessage()
        }
    }

    // llamar la funcion  del model que mostrara las donaciones

    fun totalDonation(){
        view.updateTotalDonation(model.getDonationAmount())
    }

    // colorear el texview
    fun cketTotal(){
     view.displayColorAlert(model.checkAmount())
    }



}