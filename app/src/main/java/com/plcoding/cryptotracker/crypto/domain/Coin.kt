package com.plcoding.cryptotracker.crypto.domain

data class Coin(
    val id: String,
    val rank: Int,
    val name: String,
    val symbol: String,
    val marketCapUsd: Double,  //usd stands for the currency
    val priceUsd: Double,
    val changePercent24Hr: Double
)



// this data class shows
// what kind of data
// we get from the api
// and we display on screen