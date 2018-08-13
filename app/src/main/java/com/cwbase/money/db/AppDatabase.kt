package com.cwbase.money.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.cwbase.money.db.dao.CurrencyDao
import com.cwbase.money.db.entity.Currency

@Database(entities = arrayOf(Currency::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun currencyDao(): CurrencyDao
}