package com.climbplayground.climbplaygroundback.service

import com.climbplayground.climbplaygroundback.Entity.Board
import org.springframework.stereotype.Service

@Service
interface BoardService {
    fun getBoardList(): List<Board>?
    fun insertBoard(): Any?

}
