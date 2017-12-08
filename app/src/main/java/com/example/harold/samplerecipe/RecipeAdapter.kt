package com.example.harold.samplerecipe

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import java.security.Key

/**
 * Created by Harold on 12/7/2017.
 */

class RecipeAdapter(val recipeList: ArrayList<Recipe>): RecyclerView.Adapter<RecipeAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.tvName?.text = recipeList[position].name
        holder?.tvDesc?.text = recipeList[position].desc
       holder?.linearLayout?.setOnClickListener(object  : View.OnClickListener{
           override fun onClick(v: View?) {
               val intent = Intent(v?.context, FullRecipe::class.java)
               intent.putExtra(RecipeKey.RECIPE, recipeList[position])
               v?.context?.startActivity(intent)
           }
       })

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder{
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.item_layout, parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return recipeList.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        val tvName: TextView = itemView.findViewById(R.id.txtName1)
        val tvDesc: TextView = itemView.findViewById(R.id.txtTitle1)
        val linearLayout = itemView.findViewById<LinearLayout>(R.id.linear1)

    }
}