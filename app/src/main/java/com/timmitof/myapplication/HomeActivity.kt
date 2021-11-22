package com.timmitof.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AlertDialog
import com.timmitof.myapplication.R

class HomeActivity : AppCompatActivity() {
    var arrayHead: ArrayList<String> = ArrayList()
    var arrayText: ArrayList<String> = ArrayList()

    lateinit var diaryBtn: ImageButton
    lateinit var calendarBtn: ImageButton
    lateinit var addBtn: ImageButton
    lateinit var resultNotes: TextView

//    lateinit var cancelBtn: Button
//    lateinit var addButton: Button
//    lateinit var headEt: EditText
//    lateinit var textEt: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        addBtn = findViewById(R.id.fab)
        resultNotes = findViewById(R.id.resultNotes)

//        cancelBtn = findViewById(R.id.cancel)
//        addButton = findViewById(R.id.add)
//        headEt = findViewById(R.id.head)
//        textEt = findViewById(R.id.text)

        addBtn.setOnClickListener{
            addNotesDialog()

        }
    }

    private fun addNotesDialog(){
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
            checkField(headEditText, textEditText, dialog)
            dialog.dismiss()
        }
        dialog.show()
    }

    private fun checkField(headEditText: EditText, textEditText: EditText, dialog: AlertDialog) {
        val headText = headEditText.text.toString()
        val textText = textEditText.text.toString()
        arrayHead.add(headText)
        arrayText.add(textText)

        var result = ""

        for (i in arrayHead){
            result += "$i\n"
        }

        for (i in arrayText){
            result += "$i\n"
        }
        resultNotes.text = result
    }
}