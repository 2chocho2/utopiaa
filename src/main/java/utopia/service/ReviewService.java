package utopia.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import utopia.dto.BrandDto;
import utopia.dto.MemberDto;
import utopia.dto.ReviewDto;

public interface ReviewService {
	// 리뷰 목록 조회
	public List<ReviewDto> selectReviewList() throws Exception;

	public List<MemberDto> openReviewMember() throws Exception;

	public List<BrandDto> openReviewBrand() throws Exception;

	// 페이징
	int selectReviewListCount() throws Exception;

	public List<ReviewDto> selectReviewListPage(int offset) throws Exception;

	// 리뷰 작성
	// // 리뷰 사진 저장
	public void insertReview(ReviewDto reviewDto, MultipartFile file) throws Exception;

	String saveFile(MultipartFile file) throws Exception;

	// 리뷰 상세 조회
	public ReviewDto selectReviewDetail(int reviewId) throws Exception;

	// 리뷰 수정
	public void updateReview(ReviewDto reviewDto) throws Exception;

	// 리뷰 삭제
	public void deleteReview(int reviewId) throws Exception;

	public ReviewDto selectReviewByReviewId(int reviewId) throws Exception;

}
