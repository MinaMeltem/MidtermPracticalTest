package com.example.practicaltest.Network;

import com.example.practicaltest.Model.Vine;

import retrofit2.Callback;
import retrofit2.http.GET;

/**
 * Created by C4Q on 12/20/16.
 */

public interface GetVineAPI {
    //Send your request to server by using @GET or @POST.

    @GET ("/timelines/users/918753190470619136")
    Callback<Vine> getResponseValues();
}
