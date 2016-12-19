package com.example.practicaltest.Model;

/**
 * Created by C4Q on 12/19/16.
 */
public class Records {
    int liked;
    String username;

    public Records(int liked, String username) {
        this.liked = liked;
        this.username = username;
    }

    public int getLiked() {
        return liked;
    }

    public void setLiked(int liked) {
        this.liked = liked;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
