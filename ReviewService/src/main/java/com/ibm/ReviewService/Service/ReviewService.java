package com.ibm.ReviewService.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.ReviewService.Entity.Review;
import com.ibm.ReviewService.Repository.ReviewServiceRepository;

@Service
public class ReviewService {
	@Autowired
	private ReviewServiceRepository repo;

	public void addReview(Review review) {
		repo.save(review);

	}

	public Review getReviewByreviewId(int reviewId) {
		Optional<Review> r = repo.findById(reviewId);
		if (r.isPresent()) {
			return r.get();
		}
		return null;
	}

	public List<Review> getReviewByUsername(String userName) {
		return repo.findByUserName(userName);
	}
	
	public List<Review> getReviewByModel(String model) {
		return repo.findByModel(model);
		 
	}

}
