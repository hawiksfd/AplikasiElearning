package com.example.aplikasielearning.repository

import android.content.Context
import com.example.aplikasielearning.model.Content
import com.example.aplikasielearning.model.Material
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.IOException

object Repository {
    fun getMaterials(context: Context? ) : MutableList<Material>? {
        val json: String
        try{
            val inputStream = context?.assets?.open("json/materials.json")
            json = inputStream?.bufferedReader().use { it?.readText().toString() }
        }catch (e: IOException){
            e.printStackTrace()
            return null
        }

        val type = object : TypeToken<MutableList<Material>>() {}.type
        val materials = Gson().fromJson<MutableList<Material>>(json,type)
        materials?.let {return it}

        return null
    }

    fun getContent(context: Context? ) : MutableList<Content>? {
        val json: String
        try{
            val inputStream = context?.assets?.open("json/contents.json")
            json = inputStream?.bufferedReader().use { it?.readText().toString() }
        }catch (e: IOException){
            e.printStackTrace()
            return null
        }

        val type = object : TypeToken<MutableList<Content>>() {}.type
        val contents = Gson().fromJson<MutableList<Content>>(json,type)
        contents?.let {return it}

        return null
    }
}