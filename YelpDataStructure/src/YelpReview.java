
public class YelpReview {

	/*
	   {  
	  		"review_id":"zdSx_SD6obEhz9VrW9uAWA", 
		  	"user_id":"Ha3iJu77CxlrFm-vQRs_8g", 
		  	"business_id":"tnhfDv5Il8EaGSXZGiuQGg", 
		  	"stars":4,
			"date":"2016-03-09", 
			"text":"Great place to hang out after work: the prices are decent, and the ambience is fun. It's a bit loud, but very lively. The staff is friendly, and the food is good. They have a good selection of drinks.", 
			"useful":0, 
			"funny":0, 
			"cool":0 
		}
	 */
	
	private String reviewId;
	private String userId;
	private String businessId;
	private int stars;
	private String date;
	private String text;
	private int useful;
	private int funny;
	private int cool;
	
	public YelpReview(String reviewId, String userId, String businessId, int stars, String date, String text,
			int useful, int funny, int cool) {
		this.reviewId = reviewId;
		this.userId = userId;
		this.businessId = businessId;
		this.stars = stars;
		this.date = date;
		this.text = text;
		this.useful = useful;
		this.funny = funny;
		this.cool = cool;
	}

	public String getReviewId() {
		return reviewId;
	}

	public String getUserId() {
		return userId;
	}

	public String getBusinessId() {
		return businessId;
	}

	public int getStars() {
		return stars;
	}

	public String getDate() {
		return date;
	}

	public String getText() {
		return text;
	}

	public int getUseful() {
		return useful;
	}

	public int getFunny() {
		return funny;
	}

	public int getCool() {
		return cool;
	}

	@Override
	public String toString() {
		return "YelpReview [reviewId=" + reviewId + ", userId=" + userId + ", businessId=" + businessId + ", stars="
				+ stars + ", date=" + date + ", text=" + text + ", useful=" + useful + ", funny=" + funny + ", cool="
				+ cool + "]";
	}
	
}
