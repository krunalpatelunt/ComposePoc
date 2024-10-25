package com.krunal.composepoc

import retrofit2.Response

open class ProductRepository(private val apiService: ApiService) {
    open suspend fun getProducts(): Response<ProductModel> {
        return apiService.getProducts()
    }
}