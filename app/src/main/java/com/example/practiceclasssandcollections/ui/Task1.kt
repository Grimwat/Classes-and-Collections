package com.example.practiceclasssandcollections.ui

import com.example.practiceclasssandcollections.ui.theme.Daypart

data class Event
    (
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val durationInMinutes: Int,
)

