package com.leonardo.trabalho02_ds151

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    val userName: String,
    val n1Peso: Int,
    val n1: Double
): Parcelable
