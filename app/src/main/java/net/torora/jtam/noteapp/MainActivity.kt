package net.torora.jtam.noteapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.ticket.view.*

class MainActivity : AppCompatActivity() {

    var listNotes=ArrayList<Note>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Add dummy data
        listNotes.add(Note(1,"meet professor","Dictumst sagittis mattis facilisis sociosqu ut eros morbi maecenas quam, vehicula platea nullam nunc venenatis turpis viverra metus, egestas neque augue luctus eu mi ullamcorper taciti. Sodales aptent penatibus parturient sociis iaculis, aliquam porttitor hac class."))
        listNotes.add(Note(2,"meet doctor","Dictumst sagittis mattis facilisis sociosqu ut eros morbi maecenas quam, vehicula platea nullam nunc venenatis turpis viverra metus, egestas neque augue luctus eu mi ullamcorper taciti. Sodales aptent penatibus parturient sociis iaculis, aliquam porttitor hac class."))
        listNotes.add(Note(3,"meet friend","Dictumst sagittis mattis facilisis sociosqu ut eros morbi maecenas quam, vehicula platea nullam nunc venenatis turpis viverra metus, egestas neque augue luctus eu mi ullamcorper taciti. Sodales aptent penatibus parturient sociis iaculis, aliquam porttitor hac class."))
        listNotes.add(Note(4,"meet student","Dictumst sagittis mattis facilisis sociosqu ut eros morbi maecenas quam, vehicula platea nullam nunc venenatis turpis viverra metus, egestas neque augue luctus eu mi ullamcorper taciti. Sodales aptent penatibus parturient sociis iaculis, aliquam porttitor hac class."))

        var myNotesAdapter=MyNotesAdapter(listNotes)
        lvNotes.adapter=myNotesAdapter
    }

    inner class MyNotesAdapter:BaseAdapter{
        var listNotesAdapter=ArrayList<Note>()
        constructor(listNotesAdapter:ArrayList<Note>):super(){
            this.listNotesAdapter=listNotesAdapter
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var myView=layoutInflater.inflate(R.layout.ticket,null)
            var myNode=listNotesAdapter[position]
            myView.tvTitle.text=myNode.nodeName
            myView.tvDes.text=myNode.nodeDes

            return myView
        }

        override fun getItem(position: Int): Any {
            return listNotesAdapter[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getCount(): Int {
            return listNotesAdapter.size
        }
    }
}
