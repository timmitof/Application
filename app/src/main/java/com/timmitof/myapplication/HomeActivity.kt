package com.timmitof.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContentProviderCompat.requireContext
import com.google.android.material.tabs.TabLayout

class HomeActivity : AppCompatActivity() {
    var array: ArrayList<String> = ArrayList()

    lateinit var diaryBtn: ImageButton
    lateinit var calendarBtn: ImageButton
    lateinit var addBtn: ImageButton
    lateinit var resultNotes: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        addBtn = findViewById(R.id.fab)
        resultNotes = findViewById(R.id.resultNotes)

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

        val headEditText: EditText = inflater.findViewById(R.id.heading)
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
        array.add(headText)
        array.add(textText)

        var result = ""

        for (i in array){
            result += "$i\n"
        }
        resultNotes.text = result
    }

}