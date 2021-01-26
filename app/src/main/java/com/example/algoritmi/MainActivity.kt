package com.example.algoritmi

import android.icu.util.LocaleData
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.EditText
import android.widget.TextView
import java.lang.IllegalArgumentException
import java.time.LocalDate

class MainActivity : AppCompatActivity() {
    lateinit var inputUtente:EditText
    lateinit var risultatoCompleto:TextView

    lateinit var inputDataNascita:EditText
    lateinit var risultatoVerifica:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inputUtente =findViewById<EditText>(R.id.inputText)
        risultatoCompleto=findViewById(R.id.stringaRisultato)
        inputDataNascita=findViewById(R.id.insermentonascita)
        risultatoVerifica=findViewById(R.id.verificaMaggiorenne)

    }
     fun onVerifiAge (v:View){
         val inputDateAsString= inputDataNascita.text.toString()
         val inputDate = LocalDate.parse(inputDateAsString)

         try {
             val studente = Studente( "paolo", "rossi",inputDate)
             risultatoVerifica.text="lo studente e maggiorenne"
         }
         catch (e:IllegalArgumentException){
             risultatoVerifica.text=e.message
         }

     }

    fun calcMaxNoRep ( v:View) {
        val input=inputUtente.text.toString()
        if (input== ""){
            risultatoCompleto.text= "scrivi qualcosa "
        }
        else{
        risultatoCompleto.text=inputUtente.text.toString()
        }
}

    fun findMaxUniqueSubstring ( s:String):Int {

        if (s.length <= 2){
            return  s.length
        }


        // se la stringa ha una lunghezza minore  di 2 ritorna la lunghezza della stringa
        // definire una variabile la piu lunga longhest che sara da restituire alla fine
        // fare un ciclo per ogni carattere della stringa
        // definire una variabile corrente uguale a 0
        // creare una mappa  di char e Int
        // fare un altro ciclo for dal carattere fino alla stringa
        // guardo il carattere in questo posizione
        // se il carattere non e contenutto nella mappa
            // aumento di uno la variabile corrente
            // inserisco nella mappa questo carattere e la sua posizione
            // vado ad aggiornare la variabile longest : longest= Max di longest e di current
       // altrimenti imterrompi il ciclo interno
            // return longest

        return 0
    }
}