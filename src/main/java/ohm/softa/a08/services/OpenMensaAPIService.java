package ohm.softa.a08.services;

import ohm.softa.a08.api.OpenMensaAPI;
import ohm.softa.a08.model.Meal;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;

public class OpenMensaAPIService {
    private static OpenMensaAPIService ourInstance;
    private final OpenMensaAPI mensaApiInstance;

    public static OpenMensaAPIService getInstance() {
		if(ourInstance == null)
			ourInstance = new OpenMensaAPIService();
		return ourInstance;
    }

    private OpenMensaAPIService() {
		Retrofit retrofit = new Retrofit.Builder()
			.addConverterFactory(GsonConverterFactory.create())
			.baseUrl("http://openmensa.org/api/v2/")
			.build();


		mensaApiInstance = retrofit.create(OpenMensaAPI.class);
    }

    public OpenMensaAPI getApi() {
    	return mensaApiInstance;
	}
}
