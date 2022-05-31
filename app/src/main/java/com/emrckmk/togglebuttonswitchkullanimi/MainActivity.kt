package com.emrckmk.togglebuttonswitchkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        switch1.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked){
                Log.e("Switch","On")
            }else{
                Log.e("Switch","Off")
            }

        }

        toggleButton.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                Log.e("Toogle","On")

            }else{
                Log.e("Toggle","Off")
            }
        }

        button.setOnClickListener {
            val switchDurum = switch1.isChecked
            val toogleDurum = toggleButton.isChecked

            Log.e("SwitchDurumu",switchDurum.toString())
            Log.e("ToggleDurumu",toogleDurum.toString())



        }

    }
}