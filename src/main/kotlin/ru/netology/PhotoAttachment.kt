package ru.netology

class PhotoAttachment : Attachment {
    override val type: String = "photo"
    val photo: Photo = Photo()
}