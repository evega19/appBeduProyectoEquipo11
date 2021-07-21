package com.bedu.appproyecto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var btnAccept: Button
    private lateinit var text: TextView

    private lateinit var editText: EditText
    private lateinit var editText2: EditText
    private lateinit var editText3: EditText
    private lateinit var editText4: EditText
    private lateinit var textView: TextView
    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //En esta función se cargó la vista

        btnAccept = findViewById(R.id.btnAccept)
        //text = findViewById(R.id.text)

        //textView = findViewById(R.id.textView)
        editText = findViewById(R.id.editText)
        editText2 = findViewById(R.id.editText2)
        editText3 = findViewById(R.id.editText3)
        editText4 = findViewById(R.id.editText4)

        imageView = findViewById(R.id.imageviewbeto)
        /*btnAccept.setOnClickListener {
            // text.text = "Haz dado click al botón!"
            // Como buena práctica, el texto de la aplicación va en strings.xml
            text.text = getString(R.string.button_clicked)

            btnAccept.isEnabled = false

            text.visibility = View.INVISIBLE

        }

        editText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                textView.text = editText.text
            }
        })*/

        btnAccept.setOnClickListener {
            if(editText.text.isNotEmpty() && editText2.text.isNotEmpty() && editText3.text.isNotEmpty() && editText4.text.isNotEmpty()){
                imageView.setImageResource(R.drawable.correct)
            }else{
                imageView.setImageResource(R.drawable.wrong)
            }
        }

    }
}