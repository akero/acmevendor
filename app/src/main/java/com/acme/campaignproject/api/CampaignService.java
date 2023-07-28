package com.acme.campaignproject.api;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Call;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

@Metadata(
        mv = {1, 7, 0},
        k = 1,
        d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ&\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H'J&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H'¨\u0006\n"},
        d2 = {"Lcom/acme/campaignproject/api/CampaignService;", "", "loginUser", "Lretrofit2/Call;", "Lcom/acme/campaignproject/models/SendOtpResponseModel;", "countryCode", "", "mobile", "sendOtp", "Companion", "app_debug"}
)
public interface CampaignService {
    @NotNull
    Companion Companion = CampaignService.Companion.$$INSTANCE;

    @FormUrlEncoded
    @POST("send-otp")
    @NotNull
    Call sendOtp(@Field("county_code") @Nullable String var1, @Field("mobile") @Nullable String var2);

    @FormUrlEncoded
    @POST("login-user")
    @NotNull
    Call loginUser(@Field("loginid") @Nullable String var1, @Field("password") @Nullable String var2);

    @Metadata(
            mv = {1, 7, 0},
            k = 1,
            d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0004R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"},
            d2 = {"Lcom/acme/campaignproject/api/CampaignService$Companion;", "", "()V", "retrofitService", "Lcom/acme/campaignproject/api/CampaignService;", "getRetrofitService", "()Lcom/acme/campaignproject/api/CampaignService;", "setRetrofitService", "(Lcom/acme/campaignproject/api/CampaignService;)V", "getInstance", "app_debug"}
    )
    public static final class Companion {
        @Nullable
        private static CampaignService retrofitService;
        // $FF: synthetic field
        static final Companion $$INSTANCE;

        @Nullable
        public final CampaignService getRetrofitService() {
            return retrofitService;
        }

        public final void setRetrofitService(@Nullable CampaignService var1) {
            retrofitService = var1;
        }

        @NotNull
        public final CampaignService getInstance() {
            if (retrofitService == null) {
                Retrofit retrofit = (new Retrofit.Builder()).baseUrl("https://leavecasa.com/api/").addConverterFactory((Converter.Factory)GsonConverterFactory.create()).build();
                retrofitService = (CampaignService)retrofit.create(CampaignService.class);
            }

            CampaignService var10000 = retrofitService;
            Intrinsics.checkNotNull(var10000);
            return var10000;
        }

        private Companion() {
        }

        static {
            Companion var0 = new Companion();
            $$INSTANCE = var0;
        }
    }
}
