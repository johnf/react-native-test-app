package com.sample.component

data class ComponentViewModel(
    val name: String,
    val displayName: String,
    val initialProperties: Map<String, String?>?
)
