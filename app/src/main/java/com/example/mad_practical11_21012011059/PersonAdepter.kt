package com.example.mad_practical11_21012011059

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.button.MaterialButton

class PersonAdepter(val context: Context,val personArray:ArrayList<Person>):RecyclerView.Adapter<PersonAdepter.PersonViewHolder>(){
    inner class PersonViewHolder(
        val view:View):RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val view=LayoutInflater.from(context).inflate(R.layout.person_item,parent,false)
        return PersonViewHolder(view)
    }

    override fun getItemCount(): Int {
        return personArray.size
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        val view=holder.view
        view.findViewById<TextView>(R.id.name).text=personArray[position].name
        view.findViewById<TextView>(R.id.mobileno).text=personArray[position].phoneNO
        view.findViewById<TextView>(R.id.email).text=personArray[position].emailId
        view.findViewById<TextView>(R.id.address).text=personArray[position].address
        view.findViewById<MaterialButton>(R.id.btn_1).setOnClickListener {
            Intent(context, MapsActivity::class.java).putExtra("object", personArray[position])
                .apply {
                    context.startActivity(this)
                }
        }
    }

}