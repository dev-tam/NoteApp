package net.torora.jtam.noteapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AddNote : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_note)
    }
    fun buAdd(view: View){
        finish()
    }
}
