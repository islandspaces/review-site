package com.cookingReviews.reviews;


//import java.sql.Date;

public class Review {
	private long id;
	private String reviewTitle;
	private String imageUrl;
	private String reviewCategory;
	private String reviewContent;
	private String reviewDescription;

	public Review(long id, String reviewTitle, String imageUrl, String reviewCategory, String reviewContent, String reviewDescription) {
		this.id = id;
		this.reviewTitle = reviewTitle;
		this.imageUrl = imageUrl;
		this.reviewCategory = reviewCategory;
		this.reviewContent = reviewContent;
		this.reviewDescription = reviewDescription;
	}

	public String getReviewTitle() {
		return reviewTitle;
	}

	public void setReviewTitle(String reviewTitle) {
		this.reviewTitle = reviewTitle;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getReviewCategory() {
		return reviewCategory;
	}

	public void setReviewCategory(String reviewCategory) {
		this.reviewCategory = reviewCategory;
	}

	public String getReviewContent() {
		return reviewContent;
	}

	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}

	public String getReviewDescription() {
		return reviewDescription;
	}

	public void setReviewDescription(String reviewDescription) {
		this.reviewDescription = reviewDescription;
	}

	public Long getId() {
		return id;
	}

}
