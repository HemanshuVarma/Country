package com.varma.hemanshu.country.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.varma.hemanshu.country.databinding.ItemCountryLayoutBinding
import com.varma.hemanshu.country.models.CountryResponse

const val TAG = "CountryAdapter"

class CountryAdapter :
    ListAdapter<CountryResponse, CountryAdapter.CountryViewHolder>(CountryDiffUtil()), Filterable {

    private var countryList: List<CountryResponse> = listOf()
    private var filteredList: List<CountryResponse> = listOf()

    init {
        filteredList = countryList
    }

    inner class CountryViewHolder(private val binding: ItemCountryLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: CountryResponse) {
            binding.tvCountryName.text = item.countryName?.common
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val binding = ItemCountryLayoutBinding.inflate(LayoutInflater.from(parent.context))
        return CountryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

    override fun getFilter() = searchFilter


    private val searchFilter: Filter = object : Filter() {
        override fun performFiltering(constraint: CharSequence?): FilterResults {
            val filteredResult = FilterResults()
            if (constraint.isNullOrEmpty()) {
                filteredResult.values = countryList
            } else {
                val query = constraint.toString().trim()
                filteredResult.values = countryList.filter {
                    it.countryName?.common?.startsWith(query, ignoreCase = true) == true
                }
            }
            Log.d(TAG, "Filtered list: ${filteredResult}")
            return filteredResult
        }

        override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
            return
        }
    }
}

class CountryDiffUtil : DiffUtil.ItemCallback<CountryResponse>() {
    override fun areItemsTheSame(oldItem: CountryResponse, newItem: CountryResponse): Boolean {
        return oldItem.countryName == newItem.countryName
    }

    override fun areContentsTheSame(oldItem: CountryResponse, newItem: CountryResponse): Boolean {
        return oldItem == newItem
    }
}