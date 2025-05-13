package com.wekomodo.deadlockcompanion.data.remote.model.Heroes

data class StatsDisplay(
    val health_header_stats: List<String>,
    val health_stats: List<String>,
    val magic_header_stats: List<String>,
    val magic_stats: List<String>,
    val weapon_header_stats: List<String>,
    val weapon_stats: List<String>
)