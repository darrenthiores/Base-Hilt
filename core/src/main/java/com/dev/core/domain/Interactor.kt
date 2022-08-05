package com.dev.core.domain

import com.dev.core.data.repository.IRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Interactor @Inject constructor(
    private val repository: IRepository
): UseCase {
}