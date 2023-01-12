package utopia.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import utopia.dto.ReviewDto;

@Service
public class ReviewServiceImpl implements ReviewService {

	@Override
	public List<ReviewDto> selectReviewList() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertReview(ReviewDto reviewDto) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public String saveFile(MultipartFile file) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReviewDto selectReviewDetail(int ReviewId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateReview(ReviewDto reviewDto) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteReview(int ReviewId) throws Exception {
		// TODO Auto-generated method stub

	}

}
