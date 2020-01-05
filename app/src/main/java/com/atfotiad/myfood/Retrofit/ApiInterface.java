package com.atfotiad.myfood.Retrofit;

import com.atfotiad.myfood.Model.InstructionResponse;
import com.atfotiad.myfood.Model.RecipiesResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("search")
    Call<RecipiesResponse> getResults(@Query("apiKey") String apiKey
            , @Query("query") String sample);
    @GET("{id}/analyzedInstructions")
    Call<List<InstructionResponse>> getInstructions(@Path("id") int id, @Query("apiKey") String apiKey);


}
