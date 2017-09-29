import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class YelpReviews {

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

	//TODO: define data structure(s) to store data
	private HashMap<String, YelpReview> byReviewId;

	private HashMap<String,  ArrayList<YelpReview>> byBusinessId;

	public YelpReviews() {
		byReviewId = new HashMap<String, YelpReview>();
	}

	public void addReview(YelpReview review) {
		//TODO: check to see if the key already exists?
		byReviewId.put(review.getReviewId(), review);

		//TODO: add to byBusinessId map

		String busId = review.getBusinessId();
		if(this.byBusinessId.containsKey(busId)) {
			
			//get existing array list
			//add review
			//put it back?
			ArrayList<YelpReview> list = this.byBusinessId.get(busId);
			list.add(review);
			
			
		} else {
			ArrayList<YelpReview> list = new ArrayList<YelpReview>();
			list.add(review);
			byBusinessId.put(busId, list);
		}



	}

	public YelpReview getByReviewId(String reviewId) {
		//TODO: what happens if review does not exist?
		return byReviewId.get(reviewId);
	}

	public ArrayList<YelpReview> getByBusinessId(String businessId) {

		//Algorithm if I only have byReviewId data structure.
		//for each value (review)
		// if review has target businessId
		//    add to a result list
		//return result


		//TODO: what happens if business does not exist?
//		ArrayList<YelpReview> list = this.byBusinessId.get(businessId);
//		Collections.sort(list);
//		return list;
		return this.byBusinessId.get(businessId);

	}
}

