package com.naheulboot.back.naheulbootback.models

/**
 * Created by MaximeRnR on 05/10/17.
 */

data class Hero(val id: Long,
                val name: String,
                val sexe: String,
                val job: String,
                val race: String,
                val level: Int,
                val experience: Int,
                val destiny_point: Int,
                val gold: Int,
                val stats: Stats,
                val skills: Array<Skill>?,
                val weapons: Array<Weapon>?,
                val protections: Array<Protection>?,
                val description: String)