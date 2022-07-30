package com.dharma.email.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.mail.SimpleMailMessage
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.stereotype.Component

@Component
class EmailService {
    @Autowired
    lateinit var mailSender:JavaMailSender

    fun sendMail(to: String?, subject: String?, body: String?) {
        val message = SimpleMailMessage()
        message.setTo(to)
        message.setFrom("rowanfoo@outlook.com")
        message.setSubject(subject!!)
        message.setText(body!!)
        mailSender.send(message)
    }

}