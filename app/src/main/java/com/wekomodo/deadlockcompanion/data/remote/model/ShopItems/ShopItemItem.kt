package com.wekomodo.deadlockcompanion.data.remote.model.ShopItems

data class ShopItemItem(
    val ability_type: String,
    val behaviours: List<String>,
    val boss_damage_scale: Int,
    val class_name: String,
    val dependant_abilities: List<String>,
    val description: Description,
    val hero: Int,
    val heroes: List<Int>,
    val id: Int,
    val image: String,
    val image_webp: String,
    val name: String,
    val properties: Properties,
    val start_trained: Boolean,
    val tooltip_details: TooltipDetails,
    val type: String,
    val update_time: Int,
    val upgrades: List<Upgrade>,
    val videos: Videos,
    val weapon_info: WeaponInfo
)