package com.aman.diexample

import com.aman.diexample.repository.FakeRepository
import com.aman.diexample.viewmodels.QuoteViewModel
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun getQuote_returnsExpectedQuote(){
        val repo = FakeRepository()

        val viewModel = QuoteViewModel(repo)
        viewModel.updateQuote()

        assertEquals(
            "Fake Repository for Testing",
            viewModel.quote.value
        )
    }
}