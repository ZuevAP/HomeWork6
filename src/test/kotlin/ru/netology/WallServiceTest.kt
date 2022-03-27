package ru.netology

import org.junit.Assert.*
import org.junit.Test

class WallServiceTest{


@Test
fun addFunction() {
    val service = WallService
    val post = Post(
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

    service.add(post)

    val result: Boolean = posts.last().Id > 0

    assertEquals( true, result)
}

@Test
fun updateExisting_True() {
    val service = WallService
    service.add(Post(
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
    ))
    service.add(Post(
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
    ))
    service.add(Post(
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
    ))

    val update = Post(
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

    val result = service.update(update)

    assertFalse(result)
}

@Test
fun updateExisting_False() {
    val service = WallService
    service.add(Post(
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
    ))
    service.add(Post(
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
    ))
    service.add(Post(
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
    ))

    val update = Post(
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

    val result = service.update(update)

    assertFalse(result)
}
}