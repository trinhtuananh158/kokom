package com.example.kokom.ui.activities

import android.app.Activity
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.kokom.R
import com.example.kokom.data.model.SubjectModel

class SubjectDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subject_detail)
        val titleTextView = findViewById<TextView>(R.id.tvTitle)
        val descTextView = findViewById<TextView>(R.id.tvDesc)
        val dateTextView = findViewById<TextView>(R.id.tvDate)
        val btnDelete = findViewById<Button>(R.id.btnDelete)
        titleTextView.text =
            String.format(getString(R.string.title), intent.getStringExtra("Title"))
        descTextView.text = String.format(getString(R.string.desc), intent.getStringExtra("Desc"))
        dateTextView.text = String.format(getString(R.string.date), intent.getStringExtra("Date"))
        btnDelete.setOnClickListener {
            val resultIntent = Intent()
            resultIntent.putExtra("result_key", intent.getIntExtra("Index", 0))
            setResult(Activity.RESULT_OK, resultIntent)
            finish()
        }
    }
}