package com.ibm.ReviewService.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.ReviewService.Entity.Review;
import com.ibm.ReviewService.Service.ReviewService;
@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
public class ReviewServiceController {
	@Autowired
	private ReviewService service;

	@PostMapping(value="/addReview",consumes="application/json")
	public void addReview(@RequestBody Review review) {
		service.addReview(review);
	}

	@GetMapping(value="/getReview/reviewId/{reviewId}",consumes="application/json")
	public ResponseEntity<Review> getReviewByreviewId(@PathVariable int reviewId) {
		return new ResponseEntity<Review>(service.getReviewByreviewId(reviewId),HttpStatus.OK);

	}
	
	@GetMapping(value="/getReview/username/{userName}",produces="application/json")
	public ResponseEntity<List<Review>> getReviewByUser(@PathVariable String userName) {
		return new ResponseEntity<List<Review>>(service.getReviewByUsername(userName),HttpStatus.OK);
	}
	
	@GetMapping(value="/getReview/{model}",produces="application/json")
	public ResponseEntity<List<Review>> getReviewByModel(@PathVariable String model){
		System.out.println(model);
		return new ResponseEntity<List<Review>>(service.getReviewByModel(model),HttpStatus.OK);
	}
	
	
}
