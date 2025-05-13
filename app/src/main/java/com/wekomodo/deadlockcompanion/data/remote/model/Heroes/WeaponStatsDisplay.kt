package com.wekomodo.deadlockcompanion.data.remote.model.Heroes

data class WeaponStatsDisplay(
    val display_stats: List<String>,
    val other_display_stats: List<String>,
    val weapon_attributes: List<String>,
    val weapon_image: String,
    val weapon_image_webp: String
)