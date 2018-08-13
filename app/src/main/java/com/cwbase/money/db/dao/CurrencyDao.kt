package com.cwbase.money.db.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import android.arch.persistence.room.Update
import com.cwbase.money.db.entity.Currency

interface CurrencyDao {

    @Query("SELECT * FROM currency")
    fun loadAllUsers(): LiveData<List<Currency>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(cur: Currency)

    @Update
    fun update(cur: Currency)

}