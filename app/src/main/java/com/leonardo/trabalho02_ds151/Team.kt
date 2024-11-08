package com.leonardo.trabalho02_ds151

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Team(
    val image: Int,
    val name: String,
    val conference: String,
    val titles: Int,
    val about: String

): Parcelable
