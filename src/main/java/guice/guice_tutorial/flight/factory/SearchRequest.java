package guice.guice_tutorial.flight.factory;

import java.util.Date;

import com.google.inject.assistedinject.Assisted;
import com.google.inject.assistedinject.AssistedInject;

public class SearchRequest {
	private String departureLocation;
	private String arrivalLocation;
	private Date flightDate;
//	private Set<OutputPreference> preferences = new HashSet<OutputPreference>();
	
	@AssistedInject
	public SearchRequest(@Assisted("depLoc") String departureLocation,@Assisted("arrivLoc") String arrivalLocation,@Assisted Date flightDate){
		this.departureLocation = departureLocation;
		this.arrivalLocation = arrivalLocation;
		this.flightDate = flightDate;
	}
}
