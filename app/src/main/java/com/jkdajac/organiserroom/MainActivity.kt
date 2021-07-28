package com.jkdajac.organiserroom

import TextAdapter
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_writefield.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        floatBut.setOnClickListener {
            val intent = Intent(this, R.layout.item_writefield)
            startActivity(intent)
        }

        val profiles = getText()
        rvText.adapter = TextAdapter(profiles, this,)
        rvText.layoutManager = LinearLayoutManager(this)



    }

    private fun Intent(mainActivity: MainActivity, item_writefield: Int): Intent? {
return null
    }

    private fun getText() : ArrayList<Text>{
        val profiles = ArrayList<Text>()
        //if (profiles != null)
                profiles.add(Text(etEdText!!.toString()))
return profiles
    }
}