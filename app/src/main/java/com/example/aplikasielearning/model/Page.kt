package com.example.aplikasielearning.model

import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import android.os.Parcelable as Parcelable



@Parcelize
data class Page (
    @SerializedName("parts_pages")
    val partsPage: List<PartsPage>? = null
) : Parcelable