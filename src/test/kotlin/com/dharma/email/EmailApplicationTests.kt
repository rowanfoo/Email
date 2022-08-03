package com.dharma.email

import com.dharma.email.service.EmailService
import com.mashape.unirest.http.JsonNode
import com.mashape.unirest.http.Unirest
import com.sun.deploy.net.HttpResponse
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest


@SpringBootTest
class EmailApplicationTests {

    @Autowired
    lateinit var emailService: EmailService

    @Test
    fun contextLoads() {
        emailService.sendMail("rowanfoo@gmail.com","Hello World" , "Good fortune to me and family")
    }
    @Test
    fun sendHtml() {

        emailService.sendMail("rowanfoo@gmail.com","Hello World" , "<html><h1>some text !</h1></html>")
//        emailService.sendMail("rowanfoo@gmail.com","Hello World" , html)

    }
    @Test
    fun sendPost() {

        var jsonResponse = Unirest.post("http://localhost:8080")
            .body("{\"name\":\"Sam Baeldung\", \"city\":\"viena\"}")
            .asString()
        println(jsonResponse)

    }



}
