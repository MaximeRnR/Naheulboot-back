package com.naheulboot.back.naheulbootback.controllers

import com.naheulboot.back.naheulbootback.models.Hero
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


/**
 * Created by MaximeRnR on 05/10/17.
 */
@RestController
@RequestMapping("/api")
class HeroController {

    fun getAllHeroes() = listOf(
            Hero(id = 0, name = "Roger Hugue", race = "Humain"),
            Hero(id = 1, name = "Lina d'Elrey", race = "Elfe"),
            Hero(id = 2, name = "Billy La Castagne", race = "Orc"))

    @GetMapping("/heroes")
    fun heroes() =
            getAllHeroes()

    @GetMapping("/hero")
    fun heroByName(@RequestParam(value = "name") name: String) =
            getAllHeroes().filter { it.name.equals("$name") }

}