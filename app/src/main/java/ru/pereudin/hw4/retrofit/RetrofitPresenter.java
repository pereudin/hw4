package ru.pereudin.hw4.retrofit;

import android.util.Log;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;

public class RetrofitPresenter {

    private static final String TAG = "RetrofitPresenter";

    private String imageURL;

    private RetrofitApi retrofitApi;

    public RetrofitPresenter() {
        retrofitApi = new RetrofitApi();
    }

    public void getString() {
        Observable<User> single = retrofitApi.requestServer();

        Disposable disposable = single.observeOn(AndroidSchedulers.mainThread()).subscribe(user -> {
            Log.d(TAG, "onNext: " + user.login);
            Log.d(TAG, "onNext: " + user.company);
            Log.d(TAG, "onNext: " + user.avatar);
            imageURL = user.avatar;
        }, throwable -> {
            Log.e(TAG, "onError: ", throwable);
        });
    }

    public String getImageURL() {
        return imageURL;
    }
}
