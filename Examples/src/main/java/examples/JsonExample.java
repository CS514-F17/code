package examples;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JsonExample {

	public static void main(String[] args) {

		//from: https://www.yelp.com/dataset/documentation/json
		String review = "{  \n" + 
				"   \"review_id\":\"zdSx_SD6obEhz9VrW9uAWA\",\n" + 
				"   \"user_id\":\"Ha3iJu77CxlrFm-vQRs_8g\",\n" + 
				"   \"business_id\":\"tnhfDv5Il8EaGSXZGiuQGg\",\n" + 
				"   \"stars\":4,\n" + 
				"   \"date\":\"2016-03-09\",\n" + 
				"   \"text\":\"Great place to hang out after work: the prices are decent, and the ambience is fun. It's a bit loud, but very lively. The staff is friendly, and the food is good. They have a good selection of drinks.\",\n" + 
				"   \"useful\":0,\n" + 
				"   \"funny\":0,\n" + 
				"   \"cool\":0\n" + 
				"}";
		
		JsonParser parser = new JsonParser();
		JsonElement elt = parser.parse(review);
		if(elt.isJsonObject()) {
			JsonObject obj = (JsonObject)elt;
			
			String text = obj.get("text").getAsString();
			int cool = obj.get("cool").getAsInt();
					
		}
		
	}

}
