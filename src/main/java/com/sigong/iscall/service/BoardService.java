package com.sigong.iscall.service;

import com.sigong.iscall.dto.BoardDTO;
import com.sigong.iscall.dto.CreateBoardDTO;
import com.sigong.iscall.vo.BoardVO;

import java.util.List;

public interface BoardService {
    List<BoardDTO> getBoardList();
    void write(CreateBoardDTO createBoardDTO);

}
