package ru.skillbranch.devintensive.models

import android.provider.ContactsContract

class UserView (
    val id: String?,
    val fullName : String,
    val nickname : String,
    var avatar : String? = null,
    var initials :String?,
    var status :String? = "offline"

) {}