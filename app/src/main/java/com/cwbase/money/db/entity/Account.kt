package com.cwbase.money.db.entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.ForeignKey
import android.arch.persistence.room.PrimaryKey
import java.util.*

@Entity(foreignKeys = (arrayOf(
        ForeignKey(entity = BeneficiaryOwner::class, parentColumns = ["id"], childColumns = arrayOf("default_owner_id")),
        ForeignKey(entity = Currency::class, parentColumns = ["code"], childColumns = arrayOf("currency_code")),
        ForeignKey(entity = CreditCard::class, parentColumns = ["id"], childColumns = arrayOf("credit_card_id")),
        ForeignKey(entity = Bank::class, parentColumns = ["id"], childColumns = arrayOf("bank_id"))
)))
data class Account(

        @PrimaryKey
        var id: Long,

        @ColumnInfo(name = "display_order")
        var displayOrder: Int,

        @ColumnInfo(name = "bank_id")
        var bankId: Long,

        @ColumnInfo(name = "credit_card_id")
        var creditCardId: Long,

        @ColumnInfo(name = "currency_code")
        var currencyCode: String,

        @ColumnInfo(name = "default_owner_id")
        var defaultOwnerId: Long,

        @ColumnInfo(name = "account_no")
        var accountNo: String,

        @ColumnInfo(name = "name")
        var name: String,

        @ColumnInfo(name = "create_date")
        var createDate: Date,

        @ColumnInfo(name = "modify_date")
        var modifyDate: Date
)
