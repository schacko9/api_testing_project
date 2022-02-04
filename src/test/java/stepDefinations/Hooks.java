package stepDefinations;

import java.io.IOException;
import io.cucumber.java.Before;

public class Hooks {

	@Before("@DeletePlace")
	public void beforeScenario() throws IOException
	{	// execute this code only when place id is null if @AddPlace hasn't been run yet
		
		StepDefination m = new StepDefination();
		if(StepDefination.place_id==null)
		{
		m.add_Place_Payload_with("Slomo Chacko", "English", "United States");
		m.user_calls_with_http_request("AddPlaceAPI", "POST");
		m.verify_place_Id_created_maps_to_using("Slomo Chacko", "getPlaceAPI");
		}

	}
}
