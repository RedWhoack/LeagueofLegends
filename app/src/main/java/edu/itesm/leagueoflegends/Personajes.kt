package edu.itesm.leagueoflegends

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class personajes(val imagen:Int,
                 val nombre:String,
                 val informacion:String,
                 val secreto:String) : Parcelable