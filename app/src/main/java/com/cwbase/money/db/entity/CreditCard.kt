package com.cwbase.money.db.entity

import android.arch.persistence.room.*
import com.cwbase.money.db.AppTypeConverters
import java.util.*

@Entity(foreignKeys = (arrayOf(
        ForeignKey(entity = Account::class, parentColumns = ["id"], childColumns = arrayOf("account_id"))
)))
@TypeConverters(AppTypeConverters::class)
data class CreditCard(

        @PrimaryKey
        var id: Long,

        @ColumnInfo(name = "account_id")
        var accountId: Long,

        @ColumnInfo(name = "cutoff_day")
        var cutoffDay: Int,

        @ColumnInfo(name = "due_day")
        var dueDay: Int,

        @ColumnInfo(name = "credit_limit")
        var creditLimit: Double,

        @ColumnInfo(name = "modify_date")
        var modifyDate: Date
)