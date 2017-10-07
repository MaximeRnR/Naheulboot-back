package com.naheulboot.back.naheulbootback.controllers

import com.naheulboot.back.naheulbootback.models.Hero
import com.naheulboot.back.naheulbootback.models.Skill
import com.naheulboot.back.naheulbootback.models.Stats
import org.springframework.web.bind.annotation.*


/**
 * Created by MaximeRnR on 05/10/17.
 */
@RestController
@CrossOrigin(origins = arrayOf("http://localhost:4200"))
@RequestMapping("/api")
class HeroController {

    fun getAllHeroes() = listOf(
            Hero(id = 0,
                    name = "Simmons",
                    sexe = "Masculin",
                    job = "Mage",
                    race = "Humain",
                    level = 1,
                    experience = 258,
                    destiny_point = 0,
                    gold = 583,
                    stats = Stats(
                            id = 0,
                            bravery = 13,
                            intelligence = 10,
                            charisma = 11,
                            dexterity = 11,
                            strength = 11,
                            health = 25,
                            mana = 0,
                            armor = 0,
                            attack = 10,
                            parry = 10
                    ),
                    skills = Array(2, { i -> Skill(id = i.toLong(), name = "Test", effect = "test") }),
                    protections = null,
                    weapons = null,
                    description = "description"))

    @GetMapping("/heroes")
    fun heroes() =
            getAllHeroes()

    @GetMapping(value = "/heroes/{id}")
    fun getHeroById(@PathVariable("id") id: Long) = getAllHeroes().filter { it.id == id }.get(index = 0)


    @GetMapping("/hero")
    fun getHeroByName(@RequestParam(value = "name") name: String) =
            getAllHeroes().filter { it.name.equals("$name") }


}