package com.dharma.email

import com.dharma.email.service.EmailService
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

}
