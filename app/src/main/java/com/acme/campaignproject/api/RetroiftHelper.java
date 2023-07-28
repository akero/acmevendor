package com.acme.campaignproject.api;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Metadata(
        mv = {1, 7, 0},
        k = 1,
        d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0007"},
        d2 = {"Lcom/acme/campaignproject/api/RetroiftHelper;", "", "()V", "BASE_URL", "", "getInstance", "Lretrofit2/Retrofit;", "app_debug"}
)
public final class RetroiftHelper {
    private static final String BASE_URL;
    @NotNull
    public static final RetroiftHelper INSTANCE;

    @NotNull
    public final Retrofit getInstance() {
        Retrofit var10000 = (new Retrofit.Builder()).baseUrl(BASE_URL).addConverterFactory((Converter.Factory)GsonConverterFactory.create()).build();
        Intrinsics.checkNotNullExpressionValue(var10000, "Retrofit.Builder()\n     …e())\n            .build()");
        return var10000;
    }

    private RetroiftHelper() {
    }

    static {
        RetroiftHelper var0 = new RetroiftHelper();
        INSTANCE = var0;
        BASE_URL = "https://leavecasa.com/api/";
    }
}
