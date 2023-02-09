package com.sigong.iscall.service;

import com.sigong.iscall.dto.BoardDTO;
import com.sigong.iscall.dto.CreateBoardDTO;
import com.sigong.iscall.mapper.BoardMapper;
import com.sigong.iscall.vo.BoardVO;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@RequiredArgsConstructor
@Service
public class BoardServiceImpl implements BoardService{

    private final BoardMapper boardMapper;

    @Override
    public List<BoardDTO> getBoardList() {
        return boardMapper.getBoardList();
    }

    @Transactional
    @Override
    public void write(CreateBoardDTO createBoardDTO) {
        boardMapper.write(createBoardDTO);

    }
}
