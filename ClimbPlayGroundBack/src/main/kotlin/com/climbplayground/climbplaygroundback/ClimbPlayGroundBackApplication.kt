package com.climbplayground.climbplaygroundback

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import org.springframework.data.repository.CrudRepository
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.query
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.*
import java.util.*
import kotlin.jvm.optionals.toList

@SpringBootApplication
class ClimbPlayGroundBackApplication

fun main(args: Array<String>) {
    runApplication<ClimbPlayGroundBackApplication>(*args)
    //first Commit
}

