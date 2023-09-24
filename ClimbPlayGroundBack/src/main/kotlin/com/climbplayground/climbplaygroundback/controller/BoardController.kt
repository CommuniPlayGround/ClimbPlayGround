package com.climbplayground.climbplaygroundback.controller

import com.climbplayground.climbplaygroundback.service.BoardService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/board")
class BoardController {

    @Autowired
    lateinit var boardService: BoardService

    @GetMapping("/list")
    private fun getBoardList(): ResponseEntity<Any> {
        return ResponseEntity
            .ok()
            .body(boardService.getBoardList())
    }

    @GetMapping("/insertTest")
    private fun insertBoard():ResponseEntity<Any> {
        return ResponseEntity
            .ok()
            .body(boardService.insertBoard())
    }
}