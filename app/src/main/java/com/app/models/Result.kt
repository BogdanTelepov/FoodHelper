package com.app.models


import com.google.gson.annotations.SerializedName

data class Result(
    @SerializedName("aggregateLikes")
    val aggregateLikes: Int,
    @SerializedName("cheap")
    val cheap: Boolean,
    val cuisines: List<String>,
    @SerializedName("dairyFree")
    val dairyFree: Boolean,
    @SerializedName("extendedIngredients")
    val extendedIngredients: List<ExtendedIngredient>,
    @SerializedName("gaps")
    val gaps: String,
    @SerializedName("glutenFree")
    val glutenFree: Boolean,
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: String,
    @SerializedName("occasions")
    val occasions: List<Any>,
    @SerializedName("pricePerServing")
    val pricePerServing: Double,
    @SerializedName("readyInMinutes")
    val readyInMinutes: Int,
    @SerializedName("sourceName")
    val sourceName: String,
    @SerializedName("sourceUrl")
    val sourceUrl: String,
    @SerializedName("spoonacularScore")
    val spoonacularScore: Double,
    @SerializedName("spoonacularSourceUrl")
    val spoonacularSourceUrl: String,
    @SerializedName("summary")
    val summary: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("vegan")
    val vegan: Boolean,
    @SerializedName("vegetarian")
    val vegetarian: Boolean,
    @SerializedName("veryHealthy")
    val veryHealthy: Boolean


)