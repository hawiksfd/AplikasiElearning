package com.example.aplikasielearning.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.aplikasielearning.databinding.ItemMaterialBinding
import com.example.aplikasielearning.model.Material

class MaterialsAdapter : RecyclerView.Adapter<MaterialsAdapter.ViewHolder>(), Filterable {

    private var listener: ((Material, Int) -> Unit)? = null
    var materials = mutableListOf<Material>()
        set(value){
            field = value
            materialsFilter = value
            notifyDataSetChanged()
        }

    private var materialsFilter = mutableListOf<Material>()

    private var filters = object : Filter(){
        override fun performFiltering(constraint: CharSequence?): FilterResults {
            var filterList = mutableListOf<Material>()
            val filterPattern = constraint.toString().trim().lowercase()

            if (filterPattern.isEmpty()){
                filterList = materials
            }else{
                for (material in materials){
                    val title = material.titleMateril?.trim()?.lowercase()

                    if (title?.contains(filterPattern) == true){
                        filterList.add(material)
                    }
                }
            }

            val result = FilterResults()
            result.values = filterList
            return result
        }

        override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
            materialsFilter = results?.values as MutableList<Material>
            notifyDataSetChanged()
        }
    }

    class ViewHolder(private val materialBinding: ItemMaterialBinding) :
        RecyclerView.ViewHolder(materialBinding.root){
        fun bindItem(material: Material, listener: ((Material, Int) -> Unit)?) {
            Glide.with(itemView)
                .load(material.thumbnailMaterial)
                .into(materialBinding.ivMaterial)

            materialBinding.tvTitleMaterial.text = material.titleMateril

            listener?.let{
                it(material, adapterPosition)
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemMaterialBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(materialsFilter[position], listener)
    }

    override fun getItemCount(): Int = materialsFilter.size
    override fun getFilter(): Filter = filters



}