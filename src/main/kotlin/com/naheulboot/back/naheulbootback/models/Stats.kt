package com.naheulboot.back.naheulbootback.models

/**
 * Created by mreynier on 07/10/2017.
 */
data class Stats(val id: Long,
                 val health: Int,
                 val mana: Int,
                 val armor: Int,

                 val bravery: Int,
                 val intelligence: Int,
                 val charisma: Int,
                 val dexterity: Int,
                 val strength: Int,

                 val attack: Int,
                 val parry: Int)