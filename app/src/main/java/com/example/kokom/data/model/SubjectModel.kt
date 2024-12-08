package com.example.kokom.data.model
import android.os.Parcelable
import kotlinx.parcelize.Parcelize
@Parcelize
data class SubjectModel(val index: Int,
                        val title: String,
                        val date: String,
                        val description: String): Parcelable
