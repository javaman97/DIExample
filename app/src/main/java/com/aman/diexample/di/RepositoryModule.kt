package com.aman.diexample.di

import com.aman.diexample.repository.QuoteRepoImpl
import com.aman.diexample.repository.QuoteRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindQuoteRepository(
        impl: QuoteRepoImpl
    ): QuoteRepository
}