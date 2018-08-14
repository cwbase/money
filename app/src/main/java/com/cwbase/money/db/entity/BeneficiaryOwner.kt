package com.cwbase.money.db.entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.arch.persistence.room.TypeConverters
import com.cwbase.money.db.AppTypeConverters
import java.util.*

@Entity
@TypeConverters(AppTypeConverters::class)
data class BeneficiaryOwner(

        @PrimaryKey
        var id: Long,

        @ColumnInfo(name = "name")
        var name: String,

        @ColumnInfo(name = "display_order")
        var displayOrder: Int,

        @ColumnInfo(name = "modify_date")
        var modifyDate: Date
)