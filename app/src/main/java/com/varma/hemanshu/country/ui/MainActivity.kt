package com.varma.hemanshu.country.ui

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.varma.hemanshu.country.R
import com.varma.hemanshu.country.adapter.CountryAdapter
import com.varma.hemanshu.country.api.CountryApiService
import com.varma.hemanshu.country.databinding.ActivityMainBinding
import com.varma.hemanshu.country.repository.CountryRepo
import com.varma.hemanshu.country.repository.CountryRepoImpl
import com.varma.hemanshu.country.utils.UiState
import com.varma.hemanshu.country.viewmodels.CountryViewModelFactory
import com.varma.hemanshu.country.viewmodels.MainViewModel

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    private val repo: CountryRepo by lazy {
        CountryRepoImpl(CountryApiService.apiService)
    }

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel
    private val countryAdapter: CountryAdapter by lazy { CountryAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val viewModelFactory = CountryViewModelFactory(repository = repo)
        viewModel = ViewModelProvider(this, viewModelFactory)[MainViewModel::class]
        binding.lifecycleOwner = this

        setupAdapter()
        setupObservers()

    }


    override fun onResume() {
        super.onResume()
        viewModel.getCountryData()
    }

    private fun setupAdapter() {
        binding.rvCountry.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = countryAdapter
        }

        binding.svSearch.setOnQueryTextListener( object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                TODO("Not yet implemented")
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                TODO("Not yet implemented")
            }

        }
        )
    }

    private fun setupObservers() {
        viewModel.countryData.observe(this) { response ->
            when (response) {
                is UiState.Loading -> {
                    Log.d(TAG, "Loading")
                    binding.apply {
                        pbProgress.visibility = View.VISIBLE
                        tvError.visibility = View.GONE
                        rvCountry.visibility = View.GONE
                    }
                }

                is UiState.Error -> {
                    binding.apply {
                        pbProgress.visibility = View.GONE
                        tvError.visibility = View.VISIBLE
                        rvCountry.visibility = View.GONE

                        tvError.text = response.message
                    }
                    Log.d(TAG, "Error getting data: ${response.message}")
                }

                is UiState.Success -> {
                    binding.apply {
                        pbProgress.visibility = View.GONE
                        tvError.visibility = View.GONE
                        rvCountry.visibility = View.VISIBLE
                    }
                    Log.d(TAG, "Success: ${response.data.get(0).countryName}")
                    countryAdapter.submitList(response.data)
                }
            }
        }
    }



}