package com.cookingReviews.reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	private Map<Long, Review> reviewsList = new HashMap<>();
	
	public ReviewRepository() {
		Review salad = new Review(1L, "Salad", "/images/salad.jpg", "Salad", "A cool recipe", "This is a review of my salad recipe");
		Review stew = new Review(2L,"Rice and Stew", "/images/stew.jpg", "Rice and Stew", "A tasty recipe", "This is a review of my entree recipe" );
		Review jollof = new Review(3L, "Jollof Rice", "/images/jollof.jpg", "Jollof Rice", "A cool recipe", "This is a review of my salad recipe");
		Review afang = new Review(4L,"Afang Soup", "/images/afang.jpg", "Afang soup", "A tasty recipe", " Afang Soup (Spinach and Okazi leaves) – slimy-textured soup loaded with chunks of protein and spices and seasonings. "
				+ "A healthy way of adding more greens to your table. Best paired with your favorite starchy side." );
		Review moimoi = new Review(5L,"Moimoi", "/images/moimoi.jpg", "Moimoi", "A tasty recipe", "This is a review of my entree recipe" );
		Review friedRice = new Review(7L,"Fried Rice", "/images/friedRice.jpg", "Fried Rice", "A tasty recipe", "This is a review of my entree recipe" );
		reviewsList.put(salad.getId(), salad);
		reviewsList.put(stew.getId(), stew);
		reviewsList.put(jollof.getId(), jollof);
		reviewsList.put(afang.getId(), afang);
		reviewsList.put(moimoi.getId(), moimoi);
		reviewsList.put(friedRice.getId(), friedRice);
		
	}

	public ReviewRepository(Review... reviews) {
		for (Review review : reviews) {
		reviewsList.put(review.getId(), review);
	  }
	}

	public Review findOne(long id) {
		return reviewsList.get(id);
	}

	public Collection<Review> findAll() {
		return reviewsList.values();
	}

}

