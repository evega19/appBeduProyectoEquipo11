package com.bedu.appproyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val btn = findViewById<Button>(R.id.button)
        val txtName = findViewById<TextView>(R.id.textViewAct5)



        btn.setOnClickListener {
            val bundle = Bundle() //Es un conjunto de identificadores con sus valores
            bundle.putString("name",txtName.text.toString())

            val intent = Intent(this,MainActivity6::class.java).apply {
                putExtras(bundle)
            }

            Toast.makeText(this, "hola ${txtName.text}",Toast.LENGTH_SHORT).show()


            startActivity(intent)
        }
    }
}