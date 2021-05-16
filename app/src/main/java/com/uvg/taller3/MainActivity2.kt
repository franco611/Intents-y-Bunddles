package com.uvg.taller3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bundle = intent.extras
        var num1=0
        var num2=0
        var valor=""

        if (bundle != null) {
            val valor1 = bundle.getString("valor")
            Toast.makeText(this, valor1, Toast.LENGTH_SHORT).show()

            if (valor1 != null) {
                valor=valor1
            }
        }


        btnRegresar.setOnClickListener {
            val intent: Intent = Intent()
            var numR=0

            if(valor.equals("mult")){
                num1 = val1.text.toString().toInt()
                num2 = val2.text.toString().toInt()

                System.out.println(num1)
                System.out.println(num2)
                numR = num1*num2

            }else if (valor.equals("div")){
                num1 = val1.text.toString().toInt()
                num2 = val2.text.toString().toInt()
                numR = num1/num2
            }else if (valor.equals("sum")){
                num1 = val1.text.toString().toInt()
                num2 = val2.text.toString().toInt()
                numR = num1+num2
            }else if (valor.equals("rest")){
                num1 = val1.text.toString().toInt()
                num2 = val2.text.toString().toInt()
                numR = num1-num2
            }


            intent.putExtra("resultado1",numR.toString())
            setResult(RESULT_OK,intent)
            finish()

        }

    }
}