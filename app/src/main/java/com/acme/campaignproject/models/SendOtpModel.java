package com.acme.campaignproject.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 7, 0},
        k = 1,
        d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"},
        d2 = {"Lcom/acme/campaignproject/models/SendOtpModel;", "", "county_code", "", "mobile", "(Ljava/lang/String;Ljava/lang/String;)V", "getCounty_code", "()Ljava/lang/String;", "getMobile", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}
)
public final class SendOtpModel {
    @NotNull
    private final String county_code;
    @NotNull
    private final String mobile;

    @NotNull
    public final String getCounty_code() {
        return this.county_code;
    }

    @NotNull
    public final String getMobile() {
        return this.mobile;
    }

    public SendOtpModel(@NotNull String county_code, @NotNull String mobile) {
        super();

        Intrinsics.checkNotNullParameter(county_code, "county_code");
        Intrinsics.checkNotNullParameter(mobile, "mobile");
        this.county_code = county_code;
        this.mobile = mobile;
    }

    @NotNull
    public final String component1() {
        return this.county_code;
    }

    @NotNull
    public final String component2() {
        return this.mobile;
    }

    @NotNull
    public final SendOtpModel copy(@NotNull String county_code, @NotNull String mobile) {
        Intrinsics.checkNotNullParameter(county_code, "county_code");
        Intrinsics.checkNotNullParameter(mobile, "mobile");
        return new SendOtpModel(county_code, mobile);
    }

    // $FF: synthetic method
    public static SendOtpModel copy$default(SendOtpModel var0, String var1, String var2, int var3, Object var4) {
        if ((var3 & 1) != 0) {
            var1 = var0.county_code;
        }

        if ((var3 & 2) != 0) {
            var2 = var0.mobile;
        }

        return var0.copy(var1, var2);
    }

    @NotNull
    public String toString() {
        return "SendOtpModel(county_code=" + this.county_code + ", mobile=" + this.mobile + ")";
    }

    public int hashCode() {
        String var10000 = this.county_code;
        int var1 = (var10000 != null ? var10000.hashCode() : 0) * 31;
        String var10001 = this.mobile;
        return var1 + (var10001 != null ? var10001.hashCode() : 0);
    }

    public boolean equals(@Nullable Object var1) {
        if (this != var1) {
            if (var1 instanceof SendOtpModel) {
                SendOtpModel var2 = (SendOtpModel)var1;
                if (Intrinsics.areEqual(this.county_code, var2.county_code) && Intrinsics.areEqual(this.mobile, var2.mobile)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}
