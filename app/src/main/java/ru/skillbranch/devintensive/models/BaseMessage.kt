package ru.skillbranch.devintensive.models

import java.util.*

abstract class BaseMessage(
    val id: String,
    val from: User?,
    val chat: Chat,
    val isComing: Boolean = false,
    val date: Date = Date())
{
    abstract fun formatMessage() : String

    companion object AbstractFactory {
        var lastid = -1
        fun makeMessage(from: User?, chat: Chat, date: Date = Date(), type: String, payload: Any?) :BaseMessage {
            lastid += 1
            return when(type) {
                "image" -> ImageMessage("$lastid", from, chat, date = date, image = payload as String)
                else -> TextMessage("$lastid", from, chat, date = date, text = payload as String)
            }
        }
    }
}