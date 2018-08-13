package com.cwbase.money

import android.os.Bundle
import android.support.v7.app.AppCompatActivity


class LoginActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    val appCtx = MoneyAppContext.instance(applicationContext)

    setContentView(R.layout.activity_login)
  }
}
