package ru.skillbranch.devintensive.extensions

import ru.skillbranch.devintensive.models.User
import ru.skillbranch.devintensive.models.UserView

fun User.toUserView() : UserView {
    val nickname = ""
    val initials = ""
    val status = if(lastVisit == null) "Еще ниразу не біл онлайн" else if (isOnline) "online" else "Последний раз біл ${lastVisit.humanizeDiff()}"
    return UserView(
        id,
        fullName = "$firstName $lastName",
        nickname = nickname,
        initials = initials,
        avatar = avatar,
        status = status

    )
}