package com.wekomodo.deadlockcompanion.data.remote.model.ShopItems

data class Property(
    val important_property: String,
    val important_property_icon: String,
    val requires_ability_upgrade: Boolean,
    val show_property_value: Boolean,
    val status_effect_value: String
)