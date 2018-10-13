package pemwa.com.peterretrofit.network;

import java.util.List;

import pemwa.com.peterretrofit.model.RetroPhoto;
import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {

    @GET("/photos")
    Call<List<RetroPhoto>> getAllPhotos();
}
