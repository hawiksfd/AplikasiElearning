package com.example.aplikasielearning.model

import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import android.os.Parcelable as Parcelable


@Parcelize
data class Content (
    @SerializedName("id_content")
    val idContent: Int? = null,
    @SerializedName("pages")
    val pages: List<Page>? = null
) : Parcelable