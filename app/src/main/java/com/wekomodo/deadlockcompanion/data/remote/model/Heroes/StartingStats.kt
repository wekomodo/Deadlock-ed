package com.wekomodo.deadlockcompanion.data.remote.model.Heroes

data class StartingStats(
    val ability_resource_max: AbilityResourceMax,
    val ability_resource_regen_per_second: AbilityResourceRegenPerSecond,
    val base_health_regen: BaseHealthRegen,
    val bullet_armor_damage_reduction: BulletArmorDamageReduction,
    val crit_damage_received_scale: CritDamageReceivedScale,
    val crouch_speed: CrouchSpeed,
    val heavy_melee_damage: HeavyMeleeDamage,
    val light_melee_damage: LightMeleeDamage,
    val max_health: MaxHealth,
    val max_move_speed: MaxMoveSpeed,
    val move_acceleration: MoveAcceleration,
    val proc_build_up_rate_scale: ProcBuildUpRateScale,
    val reload_speed: ReloadSpeed,
    val sprint_speed: SprintSpeed,
    val stamina: Stamina,
    val stamina_regen_per_second: StaminaRegenPerSecond,
    val tech_armor_damage_reduction: TechArmorDamageReduction,
    val tech_duration: TechDuration,
    val tech_range: TechRange,
    val weapon_power: WeaponPower,
    val weapon_power_scale: WeaponPowerScale
)