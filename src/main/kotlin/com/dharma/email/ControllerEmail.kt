package com.dharma.email


import com.dharma.email.service.EmailService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@CrossOrigin
@RestController
class ControllerEmail {

    @Autowired
    lateinit var emailService: EmailService

    @GetMapping("/email/{to}/{subject}/{message}")
    fun sendMsg(@PathVariable to: String, subject: String ,  message: String){
        emailService.sendMail(to,subject,message)
    }

}