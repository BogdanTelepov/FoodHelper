package com.example.foody.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.foody.data.database.entities.FavoritesEntity
import com.example.foody.data.database.entities.FoodJokeEntity
import com.example.foody.data.database.entities.RecipeEntity

@Database(
    entities = [RecipeEntity::class, FavoritesEntity::class, FoodJokeEntity::class],
    version = 3,
    exportSchema = false
)


@TypeConverters(RecipesTypeConverter::class)
abstract class RecipesDatabase : RoomDatabase() {

    abstract fun recipesDao(): RecipesDao
}