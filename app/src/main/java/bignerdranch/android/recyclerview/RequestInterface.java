package bignerdranch.android.recyclerview;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestInterface {

    @GET("tmp/unicorn.txt-2.json")
    Call<JSONResponse> getJSON();
}
