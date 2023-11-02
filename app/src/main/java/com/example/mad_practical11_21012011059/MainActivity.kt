package com.example.mad_practical11_21012011059

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
        val fab:FloatingActionButton=findViewById(R.id.fab)
        fab.setOnClickListener{
            CoroutineScope(Dispatchers.IO).launch {
                try {
                    val data = HttpRequest().makeServiceCall(
                        "https://api.json-generator.com/templates/qjeKFdjkXCdK/data",
                        "rbn0rerl1k0d3mcwgw7dva2xuwk780z1hxvyvrb1")
                    withContext(Dispatchers.Main) {
                        try {
                            if(data != null)
                                runOnUiThread{getPersonDetailsFromJson(data)}
                        } catch (e: Exception) {
                            e.printStackTrace()
                        }
                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }
    }

    fun jsonDB(){

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
     menuInflater.inflate(R.menu.main_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){R.id.share->{

            true
        }

            else -> {
                super.onOptionsItemSelected(item)
            }
        }
    }

    private fun getPersonDetailsFromJson(sJson: String) {
        val personList = ArrayList<Person>()
        try {
            val jsonArray = JSONArray(sJson)
            for (i in 0 until jsonArray.length()) {
                val jsonObject = jsonArray[i] as JSONObject
                val person = Person(jsonObject)
                personList.add(person)
            }
            val RecyclerView=findViewById<RecyclerView>(R.id.listview1)
            RecyclerView.adapter = PersonAdepter(this, personList)
        } catch (ee: JSONException) {
            ee.printStackTrace()
        }
    }

   /* fun setArraytoListView(){
        val personlistview=findViewById<ListView>(R.id.listview1)
        val array= arrayListOf<Person>(
            Person("vfgfg", "tyrdytrf",  "abc@gmail.com",  "938387635",  "sdftsfat", 90.2,  239.3),
            Person("vfgfg", "tyrdytrf",  "abc@gmail.com",  "938387635",  "sdftsfat", 873.2,  233.3),
            Person("vfgfg", "tyrdytrf",  "abc@gmail.com",  "938387635",  "sdftsfat", 327.3,  123.4),
            Person("vfgfg", "tyrdytrf",  "abc@gmail.com",  "938387635",  "sdftsfat", 44.4,  23.42),
            Person("vfgfg", "tyrdytrf",  "abc@gmail.com",  "938387635",  "sdftsfat", 87.267,  743.4)
        )
        personlistview.adapter=PersonAdepter(this,array)
    }*/

}