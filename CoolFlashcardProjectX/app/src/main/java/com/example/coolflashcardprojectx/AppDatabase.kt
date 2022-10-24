package com.example.coolflashcardprojectx

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.coolflashcardprojectx.Flashcard
import com.example.coolflashcardprojectx.FlashcardDao

@Database(entities = [Flashcard::class], version = 1)

abstract class AppDatabase : RoomDatabase() {
    abstract fun flashcardDao(): FlashcardDao
}
