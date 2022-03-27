package ru.netology

import java.util.*
import kotlin.collections.ArrayList

val posts:MutableList<Post> = mutableListOf()

object WallService {

    fun add(post: Post): Post {

        post.Id = if (posts.isEmpty()) 1 else posts.last().Id + 1

        posts += post

        return posts.last()
    }

    fun print(post: Post) {

        println(posts.last().toString())

    }

    fun update(post: Post): Boolean {
        for ((index, item) in posts.withIndex()) {
            if (item.Id == post.Id) {
                posts[index] = post.copy(Id = item.Id, date = item.date)
                return true
            }
        }
        return false
    }

}

fun main () {

    val service = WallService
    val elements = ArrayList<Attachment>()
    val video = VideoAttachment()
    val audio = AudioAttachment()


    val myPost = Post(
        0,
        0,
        0,
        0,
        0,
        "Текст поста 1",
        0,
        0,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        0,
        null,
        null,
        null,
        null,
        null,
        null,
        0

    )

    val myPost2 = Post(
        0,
        0,
        0,
        0,
        0,
        "Текст поста 2",
        0,
        0,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        0,
        null,
        null,
        null,
        null,
        null,
        null,
        0
    )

    val myPost3 = Post(
        0,
        0,
        0,
        0,
        0,
        "Текст поста 3",
        0,
        0,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        0,
        null,
        null,
        null,
        null,
        null,
        null,
        0

    )
    val myPost4 = Post(
        0,
        0,
        0,
        0,
        0,
        "Текст поста 4",
        0,
        0,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        0,
        null,
        null,
        null,
        null,
        null,
        null,
        0
    )

    val myPost5 = Post(
        0,
        0,
        0,
        0,
        0,
        "Текст поста 5",
        0,
        0,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        0,
        null,
        null,
        null,
        null,
        null,
        null,
        0

    )
    service.add(myPost)
    service.add(myPost2)
    service.add(myPost3)
    service.add(myPost4)
    service.add(myPost5)

    elements.add(video)
    elements.add(audio)




}