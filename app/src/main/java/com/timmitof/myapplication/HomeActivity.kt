package com.timmitof.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.timmitof.myapplication.models.NotesClass

class HomeActivity : AppCompatActivity() {
    var notesArray = ArrayList<NotesClass>()

    lateinit var diaryBtn: ImageButton
    lateinit var calendarBtn: ImageButton
    lateinit var addBtn: ImageButton
    lateinit var recyclerView: RecyclerView

//    lateinit var cancelBtn: Button
//    lateinit var addButton: Button
//    lateinit var headEt: EditText
//    lateinit var textEt: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        addBtn = findViewById(R.id.fab)
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = NotesAdapter(notesArray)

//        cancelBtn = findViewById(R.id.cancel)
//        addButton = findViewById(R.id.add)
//        headEt = findViewById(R.id.head)
//        textEt = findViewById(R.id.text)

        addBtn.setOnClickListener {
            addNotesDialog()
        }
    }

    private fun addNotesDialog() {
        val alert = AlertDialog.Builder(this)
        val inflater = layoutInflater.inflate(R.layout.add_notes, null)
        alert.setView(inflater)

        val negativeButton: Button = inflater.findViewById(R.id.cancel)
        val positiveButton: Button = inflater.findViewById(R.id.add)

        val headEditText: EditText = inflater.findViewById(R.id.head)
        val textEditText: EditText = inflater.findViewById(R.id.text)

        val dialog = alert.create()

        negativeButton.setOnClickListener {
            dialog.dismiss()
        }
        positiveButton.setOnClickListener {
            notesArray.add(NotesClass(headEditText.text.toString(), textEditText.text.toString()))

//            checkField(headEditText, textEditText, dialog)
            dialog.dismiss()
        }
        dialog.show()
    }

//    private fun checkField(headEditText: EditText, textEditText: EditText, dialog: AlertDialog) {
//        val head = headEditText.text.toString()
//        val text = textEditText.text.toString()
//        arrayHead.add(head)
//        arrayText.add(text)
//
//        var result = ""
//
//        for (i in arrayHead){
//            result += "$i\n"
//        }
//
//        for (i in arrayText){
//            result += "$i\n"
//        }
//    }
}