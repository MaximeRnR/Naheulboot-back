package com.naheulboot.back.naheulbootback.controller

import com.naheulboot.back.naheulbootback.model.Hero
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import java.util.concurrent.atomic.AtomicLong
import org.springframework.web.bind.annotation.RestController


/**
 * Created by MaximeRnR on 05/10/17.
 */
@RestController
class HeroController {

    val counter = AtomicLong()

    @GetMapping("/hero")
    fun hero(@RequestParam(value = "name") name: String) =
            Hero(counter.incrementAndGet(), "$name")

}