package com.sigong.iscall.mapper;

import com.sigong.iscall.dto.BoardDTO;
import com.sigong.iscall.dto.CreateBoardDTO;
import com.sigong.iscall.vo.BoardVO;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    List<BoardDTO> getBoardList();
    void write(CreateBoardDTO createBoardDTO);
}
