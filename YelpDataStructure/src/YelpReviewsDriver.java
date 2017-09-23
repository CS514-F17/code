import java.util.ArrayList;

public class YelpReviewsDriver {

	public static void main(String[] args) {

		YelpReview yr1 = new YelpReview("rev1", "user1", "bus1", 4, "2017-09-22", "Great service", 2, 1, 1);
		YelpReview yr2 = new YelpReview("rev2", "user2", "bus1", 2, "2017-08-12", "Bad food", 4, 0, 0);
		YelpReview yr3 = new YelpReview("rev3", "user1", "bus2", 3, "2017-09-01", "Fun atmosphere", 9, 2, 4);
		YelpReview yr4 = new YelpReview("rev4", "user3", "bus3", 5, "2017-06-28", "Hard to get a reservation", 2, 0, 3);
		
		YelpReviews reviews = new YelpReviews();
		reviews.addReview(yr1);
		reviews.addReview(yr2);
		reviews.addReview(yr3);
		reviews.addReview(yr4);
		
		System.out.println("Review with id rev4: " + reviews.getByReviewId("rev4"));
		ArrayList<YelpReview> result = reviews.getByBusinessId("bus1");
		System.out.println("Reviews for bus1:");
		for(YelpReview yr: result) {
			System.out.println(yr);
		}
		
	}

}
