package com.sigong.iscall.controller;

import com.sigong.iscall.dto.BoardDTO;
import com.sigong.iscall.dto.CreateBoardDTO;
import com.sigong.iscall.dto.CreateBoardRequest;
import com.sigong.iscall.service.BoardService;
import com.sigong.iscall.vo.BoardVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/board")
@Controller
public class BoardController {

    private final BoardService boardService;

    @GetMapping({"","/list"})
    public String list(Model model){
        List<BoardDTO> boarderList = boardService.getBoardList();
        model.addAttribute("boardlist",boarderList);
        return "board/list";
    }

    // 글쓰는 페이지
    @GetMapping("/post")
    public String write() {
        return "board/write";
    }

    @PostMapping(value = "/post",consumes = "application/x-www-form-urlencoded")
    public String write(CreateBoardRequest createBoardRequest){
        CreateBoardDTO createBoardDTO = CreateBoardDTO.builder()
                .title(createBoardRequest.getTitle())
                .content(createBoardRequest.getContent())
                .writerId(createBoardRequest.getWriterId())
                .build();
        boardService.write(createBoardDTO);
        return "redirect:/board/list";
    }

    // 게시물 상세 페이지이며, {no}로 페이지 넘버를 받는다.
    // PathVariable 애노테이션을 통해 no를 받음
    @GetMapping("/post/{no}")
    public String detail(@PathVariable("no") Long no, Model model) {
//        BoardDto boardDTO = boardService.getPost(no);
//
//        model.addAttribute("boardDto", boardDTO);
        return "board/detail";
    }

    // 게시물 수정 페이지이며, {no}로 페이지 넘버를 받는다.
    @PutMapping("/post/{no}")
    public String edit(@PathVariable("no") Long no, Model model) {
//        BoardDto boardDTO = boardService.getPost(no);
//
//        model.addAttribute("boardDto", boardDTO);
        return "board/update";
    }

    @DeleteMapping("/post/{no}")
    public String delete(@PathVariable("no") Long no) {
//        boardService.deletePost(no);

        return "redirect:/board/list";
    }

    // 검색
    // keyword를 view로부터 전달 받고
    // Service로부터 받은 boardDtoList를 model의 attribute로 전달해준다.

    @GetMapping("/board/search")
    public String search(@RequestParam(value="keyword") String keyword, Model model) {
//        List<BoardDto> boardDtoList = boardService.searchPosts(keyword);
//
//        model.addAttribute("boardList", boardDtoList);

        return "board/list";
    }
}
