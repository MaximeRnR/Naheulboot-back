package com.naheulboot.back.naheulbootback.models

/**
 * Created by mreynier on 07/10/2017.
 */
data class Protection(val id: Long,
                      val name: String,
                      val rupture: String,
                      val effect: String,
                      val cost: Int,
                      val armor: Int)