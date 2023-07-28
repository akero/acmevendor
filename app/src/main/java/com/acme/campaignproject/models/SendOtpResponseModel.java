package com.acme.campaignproject.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 7, 0},
        k = 1,
        d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"},
        d2 = {"Lcom/acme/campaignproject/models/SendOtpResponseModel;", "", "message", "", "status", "", "(Ljava/lang/String;I)V", "getMessage", "()Ljava/lang/String;", "getStatus", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}
)
public final class SendOtpResponseModel {
    @NotNull
    private final String message;
    private final int status;

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final int getStatus() {
        return this.status;
    }

    public SendOtpResponseModel(@NotNull String message, int status) {
        Intrinsics.checkNotNullParameter(message, "message");
        super();
        this.message = message;
        this.status = status;
    }

    @NotNull
    public final String component1() {
        return this.message;
    }

    public final int component2() {
        return this.status;
    }

    @NotNull
    public final SendOtpResponseModel copy(@NotNull String message, int status) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new SendOtpResponseModel(message, status);
    }

    // $FF: synthetic method
    public static SendOtpResponseModel copy$default(SendOtpResponseModel var0, String var1, int var2, int var3, Object var4) {
        if ((var3 & 1) != 0) {
            var1 = var0.message;
        }

        if ((var3 & 2) != 0) {
            var2 = var0.status;
        }

        return var0.copy(var1, var2);
    }

    @NotNull
    public String toString() {
        return "SendOtpResponseModel(message=" + this.message + ", status=" + this.status + ")";
    }

    public int hashCode() {
        String var10000 = this.message;
        return (var10000 != null ? var10000.hashCode() : 0) * 31 + Integer.hashCode(this.status);
    }

    public boolean equals(@Nullable Object var1) {
        if (this != var1) {
            if (var1 instanceof SendOtpResponseModel) {
                SendOtpResponseModel var2 = (SendOtpResponseModel)var1;
                if (Intrinsics.areEqual(this.message, var2.message) && this.status == var2.status) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}
