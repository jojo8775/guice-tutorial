package guice.guice_tutorial.flight.factory;

import java.util.Date;

import com.google.inject.assistedinject.Assisted;

public interface SearchRequestFactory
{
	SearchRequest create(@Assisted("depLoc") String depLoc, @Assisted("arrivLoc") String arrivLoc, Date flightDate);
}
