package com.studio.neopanda.braintastic

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var selector = 0
    var nameActivity = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initVars()
        initUI()
    }

    override fun onClick(v: View?) {
        var intentSelection = Intent()
        when (v?.id) {
            R.id.new_game_btn -> {
                Log.d("Log1", "NewGame asked")
                intentSelection = Intent(this, FirstScreenActivity::class.java)
            }
            R.id.load_game_btn -> {
                Log.d("Log2", "LoadGame asked")
                intentSelection = Intent(this, PreloadScreenActivity::class.java)
            }
            R.id.main_settings_btn -> {
                Log.d("Log3", "Settings asked")
                intentSelection = Intent(this, SettingsScreenActivity::class.java)
            }
        }
        startActivity(intentSelection)
    }

    private fun initUI() {
        new_game_btn.setOnClickListener(this)
        load_game_btn.setOnClickListener(this)
        main_settings_btn.setOnClickListener(this)
    }

    private fun initVars() {
        selector = 0
        nameActivity = ""
    }
}
