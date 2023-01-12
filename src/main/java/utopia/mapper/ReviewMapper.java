package utopia.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.multipart.MultipartFile;

import utopia.dto.ReviewDto;

@Mapper
public interface ReviewMapper {

	// 리뷰 목록 조회
	public List<ReviewDto> selectReviewList() throws Exception;
	
	// 리뷰 작성
	// // 리뷰 사진 저장
	public void insertReview(ReviewDto reviewDto, MultipartFile file) throws Exception;
	String saveFile(MultipartFile file) throws Exception;
	
	// 리뷰 상세 조회
	public ReviewDto selectReviewDetail(int ReviewId) throws Exception;
	
	// 리뷰 수정
	public void updateReview(ReviewDto reviewDto) throws Exception;
	
	// 리뷰 삭제
	public void deleteReview(int ReviewId) throws Exception;

}