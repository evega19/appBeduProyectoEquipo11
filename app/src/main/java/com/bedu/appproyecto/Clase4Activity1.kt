package com.bedu.appproyecto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView

class Clase4Activity1 : AppCompatActivity() {

    val modeloCoches = arrayOf(
        "Vento",
        "Jetta",
        "Fit",
        "Sonic",
        "206",
        "Tsuru",
        "Versa",
        "Windstar",
        "Safira",
        "Monsa",
        "Lobo",
        "HR-V",
        "Gol",
        "Bora",
        "Rav4",
        "Astra",
        "Mustang",
        "Corsa",
        "Pointer",
        "Aveo",
        "Beetle",
        "Mini cooper"
    )

    var language = arrayOf("Inglés", "Español", "Chino", "Ruso", "Coreano", "Alemán", "Francés", "Holandés")

    var country = arrayOf("EUA","México","Brazil", "Francia", "Alemania","Italia")

    private lateinit var listView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clase41)

        listView = findViewById(R.id.listView)

        val itemadapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,modeloCoches)

        listView.adapter = itemadapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(applicationContext, "seleccionaste el coche ${modeloCoches[i]}", Toast.LENGTH_SHORT).show()
        }

        val boton = findViewById<Button>(R.id.buttonClass4)
        var spinner = findViewById<Spinner>(R.id.spinnerClass4)

        val textview = findViewById<TextView>(R.id.textViewClass4)

        //val languageAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, language)

        val languageAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, country)


        var countrySelected = ""

        spinner.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                textview.text = country[p2]
                countrySelected = country[p2]
                //Toast.makeText(applicationContext, "Country: ${country[p2]}", Toast.LENGTH_SHORT).show()
            }
            override fun onNothingSelected(p0: AdapterView<*>?) { countrySelected = "" }
        }

        languageAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinner.adapter = languageAdapter

        boton.setOnClickListener {
            val mensaje = when(countrySelected){
                "EUA" -> "Welcome,"
                "México" -> "Bienvenido"
                "Brazil"-> "Bem-vindo"
                "Francia" ->"Bienvenue"
                "Alemania"->"Willkommen"
                "Italia"->"Benvenuto"
                else -> "Selecciona un idioma"
            }

            Toast.makeText(applicationContext, mensaje, Toast.LENGTH_SHORT).show()


        }

        val recycler = findViewById<RecyclerView>(R.id.recycler)

        recycler.adapter = RecyclerAdapter(listOf(
            Contact("Javier", "5511223344"),
            Contact("Juan", "5522334455"),
            Contact("Luis", "5533445566"),
            Contact("Fernanda", "5544556677"),
            Contact("Luisa", "5555667788"),
            Contact("Manuel", "5566778899"),
            Contact("Jose", "5577889900"),
            Contact("Maria", "5588990011"),
            Contact("Ana", "5599001122"),
        ))

    }

    private fun showDialog(title:String,message:String){
        AlertDialog.Builder(this)
            .setTitle(title)
            .setMessage(message)
            .setPositiveButton("OK"){dialogInterface, which -> }
            .create()
            .show()
    }
}

data class Contact (
    var name: String,
    var phone: String
)

class RecyclerAdapter(val contacts : List<Contact>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>(){

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
        private val name = view.findViewById<TextView>(R.id.tvNombre)
        private val phone = view.findViewById<TextView>(R.id.tvPhone)

        // función bind que recibe un objeto Contact y a partir de el genera un contact_item colocando la información en le layout
        fun bind(contact: Contact){
            name.text = contact.name
            phone.text = contact.phone
        }
    }

    //Cuando no se puede reciclar, lo que hace es llamar al método para crear uno nuevo
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_contact, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        val contact = contacts[position]
        holder.bind(contact)
    }

    override fun getItemCount(): Int {
        return contacts.size
    }
}