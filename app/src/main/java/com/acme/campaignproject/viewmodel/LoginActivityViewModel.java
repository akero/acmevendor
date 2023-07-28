package com.acme.campaignproject.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.acme.campaignproject.api.CampaignService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Metadata(
        mv = {1, 7, 0},
        k = 1,
        d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007¨\u0006\u000f"},
        d2 = {"Lcom/acme/campaignproject/viewmodel/LoginActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "errorMessage", "Landroidx/lifecycle/MutableLiveData;", "", "getErrorMessage", "()Landroidx/lifecycle/MutableLiveData;", "successresponse", "Lcom/acme/campaignproject/models/SendOtpResponseModel;", "getSuccessresponse", "callLogin", "", "countrycode", "mobile", "app_debug"}
)
public final class LoginActivityViewModel extends ViewModel {
    @NotNull
    private final MutableLiveData successresponse = new MutableLiveData();
    @NotNull
    private final MutableLiveData errorMessage = new MutableLiveData();

    @NotNull
    public final MutableLiveData getSuccessresponse() {
        return this.successresponse;
    }

    @NotNull
    public final MutableLiveData getErrorMessage() {
        return this.errorMessage;
    }

    public final void callLogin(@NotNull String countrycode, @NotNull String mobile) {
        Intrinsics.checkNotNullParameter(countrycode, "countrycode");
        Intrinsics.checkNotNullParameter(mobile, "mobile");
        CampaignService.Companion.getInstance().loginUser(countrycode, mobile).enqueue((Callback)(new Callback() {
            public void onResponse(@NotNull Call call, @NotNull Response response) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                if (response.isSuccessful()) {
                    LoginActivityViewModel.this.getSuccessresponse().setValue(response.body());
                } else {
                    LoginActivityViewModel.this.getErrorMessage().setValue(response.message());
                }

            }

            public void onFailure(@NotNull Call call, @NotNull Throwable t) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(t, "t");
                LoginActivityViewModel.this.getErrorMessage().setValue(t.toString());
            }
        }));
    }
}
