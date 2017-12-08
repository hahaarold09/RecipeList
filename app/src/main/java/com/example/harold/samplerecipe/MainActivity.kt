package com.example.harold.samplerecipe

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    private var mRecyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findView()

        mRecyclerView!!.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        val recipe = ArrayList<Recipe>()

        recipe.add(Recipe(getString(R.string.recipe1),
                "Jacket potatoes and chilli are great comfort food when the nights draw in." +
                        " Make ours in the week when you're short on time for a nutritious family dinner \n",
                "Ingredients: \n" +
                        "        4 large jacket potatoes \n" +
                        "        1 tbsp sunflower oil \n" +
                        "        2 red onions, chopped \n" +
                        "        3 garlic cloves, crushed \n" +
                        "        1 sachet (30-39g),chilli con carne seasoning mix \n" +
                        "        500g beef mince \n" +
                        "        100g smoked bacon lardons \n" +
                        "        2 tbsp tomato purée \n" +
                        "        400g can chopped tomatoes \n" +
                        "        400g can black beans, \n" +
                        "        drained soured cream, \n" +
                        "        grated cheese and \n" +
                        "        coriander leaves, to serve \n",
                "Method: \n" +
                "   1. Heat oven to 200C/180C fan/gas 6. Prick the potatoes all over with a fork, then put on a baking sheet and bake in the oven for 1 hr." +
                "        \n 2. While the potatoes are baking, heat the oil in a large frying pan. Add the onion and fry over a high heat for 5 mins until softened. Add the garlic and chilli sachet. Stir a few times to coat the onions in the spices, then tip the onion mixture into a large ovenproof dish." +
                "   \n 3. Put the pan back over high heat and add the beef mince, breaking it up with a spatula as you go. Cook until starting to become crisp at the edges, then add to the dish with the onions. Return the pan to heat and cook the bacon until crisp at the edges. Add the bacon to the beef and stir to combine." +
                "   \n 4. Stir in the tomato purée and tomatoes, then put the dish in the oven with the potatoes and bake for 25-30 mins until bubbling and starting to thicken. Stir in the beans and season well. Return to the oven for 5 mins to warm through." +
                "   \n 5. Cut a cross in the top of each potato and squeeze the sides to open. Spoon in the baked chilli and top with soured cream, cheese and coriander if you like." +
                "    "))
        recipe.add(Recipe(getString(R.string.recipe2),
                "This budget-friendly supper combines two favourites in one dish." +
                        " Top your jacket spuds with cheese, tomato, pepperoni and basil \n",
                "Ingredients:" +
                "       \n 4 baking potatoes" +
                "       \n 1 tbsp olive oil" +
                "      \n  ½ red onion, finely chopped" +
                "       \n 1 garlic clove, crushed" +
                "      \n  60g pack sliced pepperoni, torn" +
                "      \n  400g can chopped tomato" +
                "      \n  ½ small pack basil leaves, shredded" +
                "     \n   100g grated mozzarella\\n  ",
                "\nMethod:" +
                "\n 1. Heat oven to 200C/180C fan/gas 6. Scrub the potatoes and dry well, then prick several times with a fork. Bake directly on the oven shelf for 1-1½ hrs, until they feel soft. If you are short of time, prick each potato with a fork, wrap in a sheet of kitchen paper and microwave on High for 8-10 mins until soft inside." +
                "\n 2. While the potatoes cook, heat the oil in a small pan and sauté the onion for 5 mins to soften. Stir in the garlic and pepperoni, and cook for 1-2 mins, then add the chopped tomatoes. Bring to the boil, then simmer for 5 mins. Season and stir in half the basil. Spoon over the split potatoes and top each one with a good handful of cheese and the rest of the basil." ))
        recipe.add(Recipe("Mexican chicken burger",
                "Ready in under 20 minutes, this burger with spiced chipotle chicken breast," +
                        "in toasted brioche with guacamole, makes for a satisfying weeknight treat for one \n",
                "Ingredients:" +
                "    \n    1 chicken breast" +
                "    \n    1 tsp chipotle paste" +
                "    \n    1 lime , juiced" +
                "    \n    1-2 slices cheese" +
                "    \n    1 brioche bun, split" +
                "    \n    ½ avocado" +
                "    \n    2 cherry tomatoes, chopped" +
                "    \n    3-4 pickled jalapeño slices, chopped" +
                "    \n    ½ small garlic clove, finely grated",
                "\nMethod:" +
                "" +
                "\n 1. Put the chicken breast between two pieces of cling film and bash with a rolling pin or pan to about 1cm thick. Mix the chipotle paste with half the lime juice and spread over the chicken." +
                "\n 2. Heat a griddle pan over a high heat. Once hot, cook the chicken for 3 mins each side until cooked through, adding the cheese for the final 2 mins of cooking. Add the bun, cut-side down, to the griddle pan to toast lightly. Season the chicken." +
                "\n 3. Meanwhile, mash the avocado with the remaining lime juice. Stir in the cherry tomatoes, jalapeño and garlic, and season with a little salt. Spread over the base of the bun, then add the chicken followed by the top of the bun." +
                "    "))
        recipe.add(Recipe("Chicken Madras",
                "Cook our healthy chicken Madras curry and ditch the takeaway menu." +
                        " This simple family dinner is full of fragrant spices and tender pieces of chicken \n",
                "Ingredients:" +
                "\n 1 onion, peeled and quartered" +
                "\n 2 garlic cloves thumbsized chunk of ginger, peeled" +
                "\n ½ red chilli" +
                "\n 1 tbsp vegetable oil" +
                "\n ½ tsp turmeric" +
                "\n 1 tsp ground cumin" +
                "\n 1 tsp ground coriander" +
                "\n 1-2 tsp hot chilli powder (depending on how spicy you like your curry)" +
                "\n 4 chicken breasts, cut into chunks" +
                "\n 400g can chopped tomatoes" +
                "\n small pack coriander, chopped" +
                "\n rice, naan and mango chutney, to serve<",
                "\nMethod:" +
                "\n 1. Blitz the onion, garlic, ginger and chilli together in a food processor until it becomes a coarse paste. Heat the oil in a large saucepan and add the paste, fry for 5 mins, until softened. If it starts to stick to the pan at all, add a splash of water." +
                "\n 2. Tip in the spices and stir well, cook for a couple of minutes to toast them a bit, then add the chicken. Stir and make sure everything is covered in the spice mix. Cook until the chicken begins to turn pale, adding a small splash of water if it sticks to the base of the pan at all." +
                "\n 3. Pour in the chopped tomatoes, along with a big pinch of salt, cover and cook on a low heat for 30 mins, until the chicken is tender." +
                "\n 4. Stir through the coriander and serve with rice, naan and a big dollop of mango chutney." +
                "   "))
        recipe.add(Recipe("Churros ice cream sandwich",
                "Try a crispy Spanish-style doughnut coated in cinnamon sugar filled with dulce de leche or" +
                        " chocolate ice cream - not your average ice cream sandwich!\n",
                "Ingredients:" +
                "\n 50g butter, melted" +
                "\n ½ tsp vanilla extract" +
                "\n 250g plain flour" +
                "\n 1 tsp baking powder" +
                "\n about 1 litre sunflower oil" +
                "\n a few chunks of bread" +
                "\n ice cream, to serve, chocolate or dulce de leche work well" +
                "\n For the cinnamon sugar:" +
                "\n 100g caster sugar "+
                "\n 2 tsp cinnamon",
                "\nMethod:" +
                "\n 1. Boil the kettle, then measure 300ml boiling water into a jug and add the melted butter and vanilla extract. Sift the flour and baking powder into a large mixing bowl with a generous pinch of salt. Make a well in the centre, then pour in the contents of the jug and very quickly beat into the flour with a wooden spoon until lump-free." +
                "\n 2. Cut out 6 10cm x 10cm squares of baking parchment and grease them well with oil. Transfer the churro batter to a piping bag fitted with a large star nozzle, and pipe spiraled circles of batter onto the parchment. This is easiest if you start from the centre, and swirl the nozzle round and round until you reach the edge of the paper, avoiding any gaps. Chill for 45 mins, or up to 2 hrs, until the batter feels firm to the touch." +
                "\n 3. Fill a large deep saucepan one-third full of oil. Heat until a cube of bread browns in 45 seconds – 1 min (about 180C). Cover a tray with kitchen paper and mix the caster sugar and cinnamon together." +
                "\n 4. Remove the churros from the fridge and drop 2 or 3 directly into the pan, discarding the parchment. Fry until golden brown and crisp, then remove with a slotted spoon and drain on the kitchen paper-lined tray. Carry on cooking the rest of the dough in batches, sprinkling the cooked churros with some cinnamon sugar as you go. Once you’ve cooked all the churros, toss with any remaining cinnamon sugar and sandwich with balls of your favourite ice cream." +
                "   "))
        recipe.add(Recipe("Giant mint choc ice",
                "This ice-cream and mint chocolate block takes just a handful of ingredients but is sure to impress. " +
                        " Ideal for feeding a crowd with a sweet tooth, simply slice and serve",
                "Ingredients:\n" +
                "\n" +
                "\n 2 tbsp vegetable oil, plus extra for the tin" +
                "\n 200g dark chocolate" +
                "\n 500ml good-quality vanilla ice cream" +
                "\n 8 chocolate digestives or wafers" +
                "\n 250g chocolate mint thins (around 24 individual chocolates)",
                "\nMethod:" +
                "\n 1. Brush a 450g loaf tin with oil. As neatly as you can, line the bottom and sides of the tin with two strips of baking parchment. Melt 100g of the chocolate in the microwave with 1 tbsp vegetable oil on high in 30-sec bursts until smooth and glossy, then pour the melted chocolate into the loaf tin. Carefully spread the chocolate up the sides of the tin using a cutlery knife until they are all evenly coated. Put the tin in the freezer for 15 mins to set and take the ice cream out of the freezer to soften." +
                "\n 2. Take the tin out of the freezer and, working as quickly as you can, spread a quarter of the ice cream onto the base, then top with a single layer of chocolate mint thins. Add another layer of ice cream, followed by a layer of biscuits and mint thins. Top with another layer of ice cream, then a single layer of mint thins, before sealing with the last of the ice cream. Put back in the freezer to harden for at least 2 hrs or overnight. Don’t worry if your layers are a bit messy – once everything has set and you cut a slice, it will look great." +
                "\n 3. Melt the remaining chocolate with the oil, leave it to cool a little, then, working quickly, spoon blobs over the ice cream and smooth over with the back of the spoon to cover the base. Return to the freezer until set. About 10 mins before you want to serve it, invert the ice cream bar onto a plate and peel off the baking parchment. Cut into six slices using a hot, sharp knife." +
                "   "))

        val adapter = RecipeAdapter(recipe)

        mRecyclerView!!.adapter = adapter

        mRecyclerView!!.addItemDecoration(DividerItemDecoration(recyclerView1.getContext(), LinearLayoutManager.VERTICAL))
    }

    private fun findView() {
        mRecyclerView = findViewById<RecyclerView>(R.id.recyclerView1) as RecyclerView
    }


}
