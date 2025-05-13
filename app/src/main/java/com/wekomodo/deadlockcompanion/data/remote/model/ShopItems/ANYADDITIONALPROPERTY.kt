package com.wekomodo.deadlockcompanion.data.remote.model.ShopItems

data class ANYADDITIONALPROPERTY(
    val zz: String,
    val can_set_token_override: Boolean,
    val css_class: String,
    val disable_value: String,
    val display_units: String,
    val icon_path: String,
    val loc_token_override: String,
    val negative_attribute: Boolean,
    val provided_property_type: String,
    val usage_flags: List<String>,
    val value: String
)