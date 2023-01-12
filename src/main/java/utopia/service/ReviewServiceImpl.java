package utopia.service;


import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.slf4j.Slf4j;
import utopia.dto.ReviewDto;
import utopia.mapper.ReviewMapper;

@Slf4j
@Service
public class ReviewServiceImpl implements ReviewService {
	@Autowired
	private ReviewMapper reviewMapper;
	
	// 설정 파일에서 업로드 파일이 저장되는 경로를 가져와서 가지고 있는 변수
	@Value("${application.upload-path}")
	private String uploadPath;
		
	// 리뷰 목록 조회
	@Override
	public List<ReviewDto> selectReviewList() throws Exception {
		return reviewMapper.selectReviewList();
	}
	
	// 리뷰 작성
	@Override
	public void insertReview(ReviewDto reviewDto, MultipartFile file) throws Exception{
		String savedFilePath = saveFile(file);
		reviewDto.setReviewImage(savedFilePath);
		reviewMapper.insertReview(reviewDto, file);			
	}

	
	// 파일을 저장하고 저장 경로를 반환하는 메서드
	// 리뷰 사진 저장 
	@Override
	public String saveFile(MultipartFile file) throws Exception {
		String savedFilePath = uploadPath + file.getOriginalFilename();
		log.debug(savedFilePath);
		
		File uploadFile = new File(savedFilePath);
		file.transferTo(uploadFile);
		
		return savedFilePath;
	}
	
	// 리뷰 상세 조회
	@Override
	public ReviewDto selectReviewDetail(int ReviewId) throws Exception {
		return reviewMapper.selectReviewDetail(ReviewId);		// 게시판 상세 내용을 조회
	}
	
	// 리뷰 수정
	@Override
	public void updateReview(ReviewDto reviewDto) throws Exception {
		reviewMapper.updateReview(reviewDto);

	}
	
	
	// 리뷰 삭제 
	@Override
	public void deleteReview(int ReviewId) throws Exception {
		reviewMapper.deleteReview(ReviewId);

	}

}
