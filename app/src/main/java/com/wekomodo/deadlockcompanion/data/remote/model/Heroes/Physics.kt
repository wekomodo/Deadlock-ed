package com.wekomodo.deadlockcompanion.data.remote.model.Heroes

data class Physics(
    val collision_height: Int,
    val collision_radius: Int,
    val footstep_sound_travel_distance_meters: Int,
    val stealth_speed_meters_per_second: Int,
    val step_height: Int,
    val step_sound_time: Int,
    val step_sound_time_sprinting: Int
)