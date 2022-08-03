package com.dharma.email


import com.dharma.email.service.EmailService
import com.dharma.email.service.ServiceNews
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@CrossOrigin
@RestController
class ControllerEmail {

    @Autowired
    lateinit var emailService: EmailService
    @Autowired
    lateinit var serviceNews: ServiceNews


    @GetMapping("/hello")
    fun hello(){
        println("------hello------------> ")

    }

//    @GetMapping("/email/{to}/{subject}/{message}")
//    fun sendMsg(@PathVariable to: String,@PathVariable  subject: String , @PathVariable  message: String){
//        println("------sendmsg------------> ${to}  : ${subject}")
//        emailService.sendMail(to,subject,message)
//    }

    @PostMapping("/postbody")
    fun  postBody(@RequestBody fullName : String):String {
        return "Hello +${fullName}"
    }

    @PostMapping("/email/{to}/{subject}")
    fun sendMail(@PathVariable to: String,@PathVariable  subject: String ,@RequestBody  message: String):String {
        println("------sendmsg------------> ${to}  : ${subject}")
        println("------data------------> ${message} ")
        emailService.sendMail(to,subject,message)
        return "OK"
    }

//
//    @GetMapping("/email/newa")
//    fun sendNewa(){
//        serviceNews.sendNews()
//    }




}