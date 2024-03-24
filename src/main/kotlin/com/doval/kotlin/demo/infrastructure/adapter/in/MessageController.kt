package com.doval.kotlin.demo.infrastructure.adapter.`in`

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/message")
class MessageController {

    @GetMapping("/hello-world")
    fun helloWorld(): ResponseEntity<HelloWorldResponse> =
        ResponseEntity.ok(HelloWorldResponse(message = "Hello World!"))
}
