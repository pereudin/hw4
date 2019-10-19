package ru.pereudin.hw4.gson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import ru.pereudin.hw4.R;

public class GsonActivity extends AppCompatActivity {

    private static final String TAG = "GsonActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gson);

        String json = "{\n" +
                " \"time_of_year\": \"summer\",\n" +
                " \"year\": 2019\n" +
                "}";

        Gson gson = new GsonBuilder().create();
        Calendar calendar = gson.fromJson(json, Calendar.class);

        Log.d(TAG, "onCreate: " + calendar.timeOfYear);
        Log.d(TAG, "onCreate: " + calendar.year);
    }
}
