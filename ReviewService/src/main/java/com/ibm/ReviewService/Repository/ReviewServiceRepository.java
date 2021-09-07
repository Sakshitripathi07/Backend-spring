package com.ibm.ReviewService.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.ibm.ReviewService.Entity.Review;

public interface ReviewServiceRepository extends JpaRepository<Review, Integer> {

	   @Query("FROM review r where r.userdetails.username = :username")
	    List<Review> findByUserName(@Param("username") String username);

	   	List<Review> findByModel(String model);
}
