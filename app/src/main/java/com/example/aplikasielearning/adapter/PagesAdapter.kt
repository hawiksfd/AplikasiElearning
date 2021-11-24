package com.example.aplikasielearning.adapter

import android.content.Context
import android.view.LayoutInflater

import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.example.aplikasielearning.databinding.ItemPageBinding
import com.example.aplikasielearning.model.Page

class PagesAdapter (private val context: Context) : PagerAdapter() {

    var pages = mutableListOf<Page>()
    set(value) {
        field = value

    }
    override fun getCount(): Int = pages.size


    override fun isViewFromObject(view: View, `object`: Any): Boolean = view == `object`

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val pageBinding = ItemPageBinding.inflate(LayoutInflater.from(context), container, false)

        bindItem(pageBinding, pages[position])
        container.addView(pageBinding.root)
        return pageBinding.root
    }

    private fun bindItem(pageBinding: ItemPageBinding, page: Page) {
        pageBinding.rvPage.setHasFixedSize(true)
        pageBinding.rvPage.adapter

    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) =
        container.removeView("object" as View)

}
