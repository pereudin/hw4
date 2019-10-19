package ru.pereudin.hw4.retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {
    @Expose
    @SerializedName("login")
    public String login;

    @Expose
    @SerializedName("company")
    public String company;

    @Expose
    @SerializedName("avatar_url")
    public String avatar;
}
