package ru.pereudin.hw4.gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Calendar {
    @Expose
    @SerializedName("time_of_year")
    public String timeOfYear;

    @Expose
    @SerializedName("year")
    public String year;
}
