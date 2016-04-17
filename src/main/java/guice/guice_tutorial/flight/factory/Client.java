package guice.guice_tutorial.flight.factory;

import java.util.Date;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class Client
{
	public static void main(String[] args)
	{

		Injector injector = Guice.createInjector(new MainModule());
		Client client = injector.getInstance(Client.class);
		client.makeRequest();
	}

	public Client()
	{
	}

	@Inject
	SearchRequestFactory searchRequestFactory;

	public void makeRequest()
	{

		Date flightDate = new Date();

		SearchRequest searchRequest = searchRequestFactory.create("FRA", "LHR", null);
	}
}
