package com.example.practicaltest.Network;

/**
 * Created by C4Q on 12/19/16.
 */

public interface Api {

    @GET("/repos/{owner}/{repo}/contributors")
    Call<ResponseBody> getContributors(@Path("owner") String owner, @Path("repo") String repo);
}
