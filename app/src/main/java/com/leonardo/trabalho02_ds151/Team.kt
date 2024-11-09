package com.leonardo.trabalho02_ds151

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Team(
    val name: String,
    val city: String,
    val stadium: String,
    val championships: Int,
    val logoResId: Int
) : Parcelable
