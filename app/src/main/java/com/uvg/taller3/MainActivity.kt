package com.uvg.taller3

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        mult.setOnClickListener{
            val intent: Intent = Intent(this,MainActivity2:: class.java)
            intent.putExtra("valor","mult")

            startActivityForResult(intent,1)

        }

        div.setOnClickListener {
            val intent: Intent = Intent(this,MainActivity2:: class.java)
            intent.putExtra("valor","div")


            startActivityForResult(intent,1)
        }

        sum.setOnClickListener {
            val intent: Intent = Intent(this,MainActivity2:: class.java)
            intent.putExtra("valor","sum")


            startActivityForResult(intent,1)
        }

        rest.setOnClickListener {
            val intent: Intent = Intent(this,MainActivity2:: class.java)
            intent.putExtra("valor","rest")


            startActivityForResult(intent,1)
        }


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(resultCode == RESULT_OK){
            if(requestCode ==1){
                val bundle = data?.extras
                if(bundle != null){
                    val resultado = bundle.getString("resultado1")
                    //Toast.makeText(this,resultado,Toast.LENGTH_SHORT).show()
                    result.setText(resultado)
                }

            }

            }
        }
    }
