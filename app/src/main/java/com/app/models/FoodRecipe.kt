package com.app.models


import com.google.gson.annotations.SerializedName
import java.io.Serializable


data class FoodRecipe(
    @SerializedName("results")
    val results: List<Result>,

    ) : Serializable