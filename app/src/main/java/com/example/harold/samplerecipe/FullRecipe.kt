package com.example.harold.samplerecipe

import android.graphics.drawable.Drawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView




class FullRecipe : AppCompatActivity() {


    private var mTvDesc: TextView? = null
    private var mTvName: TextView? = null
    private var mTvInd: TextView? = null
    private var mTvMethod: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full_recipe)


        supportActionBar?.title = "Recipe1"
        supportActionBar?.setDisplayShowHomeEnabled(true)


        findViews()

        if(intent != null){
            val recipe = intent.getParcelableExtra<Recipe>(RecipeKey.RECIPE)

            mTvName?.text = recipe.name
            mTvDesc?.text = recipe.desc
            mTvInd?.text = recipe.inged
            mTvMethod?.text = recipe.method

        }


    }

    private fun findViews() {
        mTvDesc = findViewById<TextView>(R.id.txtRecipeDesc)
        mTvName = findViewById<TextView>(R.id.txtRecipeName)
        mTvMethod = findViewById<TextView>(R.id.description)
        mTvInd = findViewById<TextView>(R.id.ingredients)
    }

}


