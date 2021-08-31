package com.example.reativeflux.api.config;

import com.example.reativeflux.api.constants.ConstantsCore;
import com.jakewharton.retrofit2.adapter.reactor.ReactorCallAdapterFactory;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

public class RetrofitInitializer<T> {
    private static Retrofit retrofitInstance;

    public static Retrofit getRetrofit(){
        if(retrofitInstance == null ) {
            retrofitInstance = new Retrofit.Builder().baseUrl(ConstantsCore.Retrofit.BASE_URL).
                    addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(ReactorCallAdapterFactory.create()).build();
        }
        return retrofitInstance;
    }

    // TODO deprecated;
    public T bindService(Class<T> service) {
        return getRetrofit().create(service);
    }
}
