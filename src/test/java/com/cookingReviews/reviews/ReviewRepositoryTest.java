package com.cookingReviews.reviews;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import java.util.Collection;
import org.junit.Test;

public class ReviewRepositoryTest {
	
	ReviewRepository underTest;
	private long firstReviewId = 1L;
	private Review firstReview = new Review(firstReviewId, "review title", "image url", "review category", "review content", "review description");
	
	private long secondReviewId = 2L;
	private Review secondReview = new Review(secondReviewId, "review title", "image url", "review category", "review content", "review description");
	
	@Test
	public void shouldFindAllReviews() {
		 underTest = new ReviewRepository(firstReview, secondReview);
		Collection<Review> result = underTest.findAll();
	   assertThat(result, containsInAnyOrder(firstReview, secondReview));
		
	}
	
	
	@Test
	public void shouldFindFirstReviewById() {
		underTest = new ReviewRepository(firstReview);
		Review result = underTest.findOne(firstReviewId);
		assertThat(result, is(firstReview));
	}

	@Test
	public void shouldFindSecondReviewById() {
		underTest = new ReviewRepository(secondReview);
		Review result = underTest.findOne(secondReviewId);
		assertThat(result, is(secondReview));
	}
}
