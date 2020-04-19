package com.everton.caricaturakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var list: MutableList<Caricatura> = emptyList<Caricatura>().toMutableList()
    lateinit var adapter: CaricaturaAdapter
    lateinit var recycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list.add(Caricatura(R.drawable.foto1,"Stallone","55","Ator"));
        list.add(Caricatura(R.drawable.foto2,"Palha","39","Palhaço"));
        list.add(Caricatura(R.drawable.foto3,"Tico","75","Ator"));
        list.add(Caricatura(R.drawable.foto4,"Leticia","55","Atriz"));
        list.add(Caricatura(R.drawable.foto5,"Joelma","46","Cozinheira"));
        list.add(Caricatura(R.drawable.foto6,"Nicinha","29","Modelor"));
        list.add(Caricatura(R.drawable.foto7,"Trump","74","Presidente"));
        list.add(Caricatura(R.drawable.foto8,"Elvis","100","Cantor"));
        list.add(Caricatura(R.drawable.foto9,"Bacon","65","Ator"));
        list.add(Caricatura(R.drawable.foto10,"Tom Cruise","50","Ator"));
        list.add(Caricatura(R.drawable.foto11,"Robin","100","Ator"));
        list.add(Caricatura(R.drawable.foto12,"Doido","77","Comediante"));

        recycler = findViewById(R.id.recycler)

        adapter = CaricaturaAdapter(list,this)
        recycler.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recycler.adapter = adapter
    }
}
