package com.wekomodo.deadlockcompanion.data.remote.model.ShopItems

data class InfoSection(
    val basic_properties: List<String>,
    val loc_string: String,
    val properties_block: List<PropertiesBlock>,
    val property_upgrade_required: String
)