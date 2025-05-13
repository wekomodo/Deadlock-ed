package com.wekomodo.deadlockcompanion.data.remote.model.ShopItems

data class BulletSpeedCurve(
    val domain_maxs: List<Int>,
    val domain_mins: List<Int>,
    val spline: List<Spline>
)