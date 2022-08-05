package com.dev.core.data.remote.source

import com.dev.core.data.remote.service.ApiService
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RemoteDataSource @Inject constructor(
    private val apiService: ApiService
) {
}