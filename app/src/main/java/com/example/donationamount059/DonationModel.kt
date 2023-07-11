package com.example.donationamount059

class DonationModel {

    private var totalAmount: Int = 0

    init {

        this.totalAmount = 0
    }

    // para  guardar las donaciones
    fun saveDonation(donation: String): Boolean {
        val amount = donation.toIntOrNull()
        if (amount != null && amount > 0) {

            totalAmount += amount
            return true
        }
        return false
    }

    // retorno el total acumulado


    fun getDonationAmount(): Int{

        return totalAmount
    }







}
