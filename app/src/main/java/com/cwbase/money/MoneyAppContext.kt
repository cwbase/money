package com.cwbase.money

import android.arch.persistence.db.SupportSQLiteDatabase
import android.arch.persistence.room.Room
import android.arch.persistence.room.migration.Migration
import android.content.Context
import com.cwbase.money.db.AppDatabase


class MoneyAppContext(ctx: Context) {

    var db: AppDatabase? = null

    val INIT: Migration = object : Migration(1, 2) {
        override fun migrate(database: SupportSQLiteDatabase) {
            // database.execSQL("CREATE TABLE `currency` (`id` INTEGER, `name` TEXT, PRIMARY KEY(`id`))")
        }
    }

    init {
        this.db = Room.databaseBuilder(ctx,
                AppDatabase::class.java, "money")
                .addMigrations(INIT)
                .build()
    }

    companion object {

        var context: MoneyAppContext? = null

        fun instance(ctx: Context): MoneyAppContext {
            val c = context ?: MoneyAppContext(ctx)
            context = c
            return context!!
        }
    }

}