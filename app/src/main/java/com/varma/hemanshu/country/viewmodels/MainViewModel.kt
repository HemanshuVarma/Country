package com.varma.hemanshu.country.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.varma.hemanshu.country.models.CountryResponse
import com.varma.hemanshu.country.repository.CountryRepo
import com.varma.hemanshu.country.utils.UiState
import kotlinx.coroutines.launch

class MainViewModel(private val repo: CountryRepo) : ViewModel() {

    private val _countryData: MutableLiveData<UiState<List<CountryResponse>>> = MutableLiveData()
    val countryData: LiveData<UiState<List<CountryResponse>>> get() = _countryData

    fun getCountryData() {
        viewModelScope.launch {
            _countryData.value = UiState.Loading

            _countryData.value = repo.getCountries()
        }
    }
}