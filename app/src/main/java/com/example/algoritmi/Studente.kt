package com.example.algoritmi

import java.lang.IllegalArgumentException
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.Period

class Studente (var nome:String, var cognome:String, nascita:LocalDate ){
    var nascita:LocalDate = LocalDate.now()
    set(value){
        if(betterIsofAge(value)){
            field=value
        }
        else {
            throw IllegalArgumentException("lo studente deve esssere maggiorenne")
        }
    }
    init {
        this.nascita = nascita
    }

    fun isOfAge (nascita:LocalDate): Boolean{

        val dataOggi = LocalDate.now()

        val year = dataOggi.year
        val month = dataOggi.month.value
        val day = dataOggi.dayOfMonth

        val annoNascita = nascita.year
        val monthNascita = nascita.month.value
        val dayNascita = nascita.dayOfMonth

        val difAnno = year - annoNascita
        val difMonth = month - monthNascita
        val difDay = day - dayNascita

        if (difAnno > 18){
            return true
        }
        if (difAnno < 18){
            return  false
        }
        if(difMonth > 0){
            return true
        }
        if (difMonth < 0){
            return false
        }
        if (difDay >= 0){
            return true
        }
        return false

    }
 fun betterIsofAge(nascita:LocalDate):Boolean{
     val period  = Period.between(nascita, LocalDate.now())
     return period.years >= 18
 }






}