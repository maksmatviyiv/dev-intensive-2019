package ru.skillbranch.devintensive.utils

import java.util.*

object Utils {
    fun parseFullName(fullName : String?):Pair<String?, String?> {
        var fullFullName = fullName
        if(fullFullName == "") {
            fullFullName = null
        }
        else if(fullFullName == " ") {
            fullFullName = null
        }
        val parts : List<String>? = fullFullName?.split(" ")
        val firstName = parts?.getOrNull(0)
        val lastName = parts?.getOrNull(1)
        return Pair(firstName, lastName)
    }
    fun transliteration(firstName: String?, lastName: String?) : Unit
    {

    }
    fun toInitials(firstName: String?, lastName: String?) : Unit {

    }
}