package com.example.aplikasielearning.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Material (
    @SerializedName("id_material")
    val idMateril: Int? = null,
    @SerializedName("thumbnail_material")
    val thumbnailMaterial: String? = null,
    @SerializedName("title_material")
    val titleMateril: String? = null
) : Parcelable