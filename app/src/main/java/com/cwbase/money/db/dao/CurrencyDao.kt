package com.cwbase.money.db.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.*
import com.cwbase.money.db.entity.Currency

@Dao
interface CurrencyDao {

    @Query("SELECT * FROM currency")
    fun loadAll(): LiveData<List<Currency>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(cur: Currency)

    @Update
    fun update(cur: Currency)

}