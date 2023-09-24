package com.climbplayground.climbplaygroundback.repository

import com.climbplayground.climbplaygroundback.Entity.Board
import org.springframework.data.repository.CrudRepository

interface BoardRepository: CrudRepository<Board, Long> {

    fun findAllBy(): List<Board>?
}
