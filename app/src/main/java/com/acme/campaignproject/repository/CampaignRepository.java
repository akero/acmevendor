package com.acme.campaignproject.repository;

import androidx.lifecycle.MutableLiveData;
import com.acme.campaignproject.api.CampaignService;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Metadata(
        mv = {1, 7, 0},
        k = 1,
        d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J!\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"},
        d2 = {"Lcom/acme/campaignproject/repository/CampaignRepository;", "", "campaignService", "Lcom/acme/campaignproject/api/CampaignService;", "(Lcom/acme/campaignproject/api/CampaignService;)V", "sendotpLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/acme/campaignproject/models/SendOtpResponseModel;", "sendOtp", "", "countrycode", "", "mobile", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"}
)
public final class CampaignRepository {
    private final MutableLiveData sendotpLiveData;
    private final CampaignService campaignService;

    @Nullable
    public final Object sendOtp(@NotNull String countrycode, @NotNull String mobile, @NotNull Continuation $completion) {
        this.campaignService.sendOtp(countrycode, mobile).enqueue((Callback)(new Callback() {
            public void onResponse(@NotNull Call call, @NotNull Response response) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                String var3 = "Not yet implemented";
                throw new NotImplementedError("An operation is not implemented: " + var3);
            }

            public void onFailure(@NotNull Call call, @NotNull Throwable t) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(t, "t");
                String var3 = "Not yet implemented";
                throw new NotImplementedError("An operation is not implemented: " + var3);
            }
        }));
        Unit result = Unit.INSTANCE;
        return result;
    }

    public CampaignRepository(@NotNull CampaignService campaignService) {
        super();
        Intrinsics.checkNotNullParameter(campaignService, "campaignService");

        this.campaignService = campaignService;
        this.sendotpLiveData = new MutableLiveData();
    }
}
