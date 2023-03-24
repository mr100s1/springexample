package com.edu.board.dao;

import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.edu.board.dto.BoardDTO;
import com.edu.board.service.BoardServiceImpl;
import com.edu.common.util.Criteria;
import com.edu.common.util.SearchCriteria;

//-----------------------------------------------------------------------------------------------------------
// 게시글 Data Access Object
//-----------------------------------------------------------------------------------------------------------
public interface BoardDAO {

	//-----------------------------------------------------------------------------------------------------------
	// 제일 큰 게시글 번호 가져오기
	//-----------------------------------------------------------------------------------------------------------
	public Integer getMaxBno();
	
	//-----------------------------------------------------------------------------------------------------------
	// 게시글 등록 처리하기
	//-----------------------------------------------------------------------------------------------------------
	public int boardRegister(BoardDTO boardDTO);

	//-----------------------------------------------------------------------------------------------------------
	// 게시글 목록 보기
	//-----------------------------------------------------------------------------------------------------------
	public List<BoardDTO> boardList() throws Exception;

	//-----------------------------------------------------------------------------------------------------------
	// 게시글 번호에 해당하는 게시글의 조회수를 증가시키기
	//-----------------------------------------------------------------------------------------------------------
	public void updateReadCount(int bno);
	
	//-----------------------------------------------------------------------------------------------------------
	// 게시글 번호에 해당하는 게시글 정보를 가져오기
	//-----------------------------------------------------------------------------------------------------------
	public BoardDTO boardDetail(int bno);

	//-----------------------------------------------------------------------------------------------------------
	// 게시글 번호에 해당하는 게시글 삭제하기
	//-----------------------------------------------------------------------------------------------------------
	public int boardDelete(int bno);

	//-----------------------------------------------------------------------------------------------------------
	// 게시글 번호에 해당하는 게시글 내용(제목, 글쓴이, 내용) 수정하기
	//-----------------------------------------------------------------------------------------------------------
	public int boardUpdate(BoardDTO boardDTO);

	//-----------------------------------------------------------------------------------------------------------
	// 전체 게시글 수 가져오기 (Paging 1 처리)
	//-----------------------------------------------------------------------------------------------------------
	public int boardListTotalCount1() throws Exception;

	//-----------------------------------------------------------------------------------------------------------
	// 게시글 목록 보기 1 (Paging 1 처리)
	// 요청된 페이지에 해당하는 게시글 가져오기 (Paging 1 처리)
	//-----------------------------------------------------------------------------------------------------------
	public List<BoardDTO> boardListPaging1(HashMap<String, Integer> pageList) throws Exception;

	//-----------------------------------------------------------------------------------------------------------
	// 전체 게시글 수 가져오기 (Paging 2 처리)
	//-----------------------------------------------------------------------------------------------------------
	public int boardListTotalCount2(Criteria cri) throws Exception;

	//-----------------------------------------------------------------------------------------------------------
	// 요청된 페이지에 해당하는 게시글 목록을 가져온다. (Paging 2 처리)
	//-----------------------------------------------------------------------------------------------------------
	public List<BoardDTO> boardListPaging2(Criteria cri) throws Exception;

	//-----------------------------------------------------------------------------------------------------------
	// 전체 게시글 수 가져오기 (Paging 3 처리 + 검색 조건)
	//-----------------------------------------------------------------------------------------------------------
	public int boardListTotalCount3(SearchCriteria sCri) throws Exception;

	//-----------------------------------------------------------------------------------------------------------
	// 검색 조건에 맞는 게시글 가져오기 (Paging 3 처리 + 검색 조건) 
	//-----------------------------------------------------------------------------------------------------------
	public List<BoardDTO> boardListPaging3(SearchCriteria sCri) throws Exception;
	
} // End - public interface BoardDAO
