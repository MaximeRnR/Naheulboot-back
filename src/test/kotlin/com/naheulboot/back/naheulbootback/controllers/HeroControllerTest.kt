package com.naheulboot.back.naheulbootback.controllers

import org.hamcrest.Matchers.equalTo
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

/**
 * Created by MaximeRnR on 05/10/17.
 */


@RunWith(SpringRunner::class)
@WebMvcTest
class HeroControllerTest {
    @Autowired lateinit var mockMvc: MockMvc


    @Test fun `list all heroes`() {
        mockMvc.perform(get("/api/heroes"))
                .andExpect(status().isOk)
                .andExpect(jsonPath(
                        "$[*].id",
                        equalTo(listOf(0, 1, 2)))
                )
                .andExpect(jsonPath(
                        "$[*].name",
                        equalTo(listOf("Roger Hugue", "Lina d'Elrey", "Billy La Castagne")))
                )
                .andExpect(jsonPath(
                        "$[*].race",
                        equalTo(listOf("Humain", "Elfe", "Orc")))
                )
    }
}