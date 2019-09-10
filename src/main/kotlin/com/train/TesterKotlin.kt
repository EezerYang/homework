package com.train

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    println("Please enter number of tickets:")
    var ticketnumber = scan.nextInt()
    println("How many round-trip tickets:")
    var roundtripticket = scan.nextInt()

    val tck = TicketKT(ticketnumber, roundtripticket)
    tck.print()
}

class TicketKT(var ticketnumber:Int, var roundtripticket:Int){
    var onewayPrice = 1000
    var roundtripDiscount = 0.9f
    var roundtripPrice = 2000 * roundtripDiscount

    fun print(){
        println("Total tickets: $ticketnumber \tRound-trip: $roundtripticket \tTotal: ${getPrice()}")
    }

    fun getPrice(): Float{
        return ((ticketnumber-roundtripticket)*onewayPrice + roundtripticket*roundtripPrice)
    }
}