package com.cwbase.money.db.entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import java.util.*

@Entity
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