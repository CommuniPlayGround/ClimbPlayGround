package com.climbplayground.climbplaygroundback.service

import com.climbplayground.climbplaygroundback.Entity.Board
import com.climbplayground.climbplaygroundback.repository.BoardRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BoardServiceImpl constructor(
    @Autowired
    private val boardRepository: BoardRepository
) : BoardService {

    override fun getBoardList(): List<Board>? = boardRepository.findAllBy()
    override fun insertBoard(): Any? {
        val board = Board(title="title", description = "decription")
        return boardRepository.save(board)
    }
}