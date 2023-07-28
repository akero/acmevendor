package com.acme.campaignproject.utility;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 7, 0},
        k = 1,
        d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"},
        d2 = {"Lcom/acme/campaignproject/utility/NetworkUtils;", "", "()V", "Companion", "app_debug"}
)
public final class NetworkUtils {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker)null);

    @Metadata(
            mv = {1, 7, 0},
            k = 1,
            d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"},
            d2 = {"Lcom/acme/campaignproject/utility/NetworkUtils$Companion;", "", "()V", "isNetworkAvailable", "", "context", "Landroid/content/Context;", "app_debug"}
    )
    public static final class Companion {
        public final boolean isNetworkAvailable(@Nullable Context context) {
            if (context == null) {
                return false;
            } else {
                Object var10000 = context.getSystemService("connectivity");
                if (var10000 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
                } else {
                    ConnectivityManager connectivityManager = (ConnectivityManager)var10000;
                    if (VERSION.SDK_INT >= 29) {
                        NetworkCapabilities capabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                        if (capabilities != null) {
                            if (capabilities.hasTransport(0)) {
                                return true;
                            }

                            if (capabilities.hasTransport(1)) {
                                return true;
                            }

                            if (capabilities.hasTransport(3)) {
                                return true;
                            }
                        }
                    } else {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            return true;
                        }
                    }

                    return false;
                }
            }
        }

        private Companion() {
        }

        // $FF: synthetic method
        public Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
