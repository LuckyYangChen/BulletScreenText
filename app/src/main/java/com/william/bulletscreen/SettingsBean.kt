package com.william.bulletscreen

import android.os.Parcelable
import androidx.annotation.ColorInt
import kotlinx.android.parcel.Parcelize


/**
 * @author William
 * @date 11/17/20 5:44 PM
 * Class Comment：
 */
@Parcelize
data class SettingsBean(var duration: Int, var size: Int, @ColorInt var color: Int) : Parcelable