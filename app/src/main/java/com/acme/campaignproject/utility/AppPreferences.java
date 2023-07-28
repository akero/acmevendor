// AppPreferences.java
package com.acme.campaignproject.utility;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
        mv = {1, 7, 0},
        k = 1,
        d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"},
        d2 = {"Lcom/acme/campaignproject/utility/AppPreferences;", "", "()V", "user_data", "", "getUser_data", "()Ljava/lang/String;", "clearAll", "", "removeUserData", "saveUserData", "userDataStr", "Companion", "app_debug"}
)
public final class AppPreferences {
    private static final AppPreferences sharePref = new AppPreferences();
    private static SharedPreferences sharedPreferences;
    private static final String PLACE_OBJ = "place_obj";
    private static final String user_data = "user_data";
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker)null);

    @NotNull
    public final String getUser_data() {
        SharedPreferences var10000 = sharedPreferences;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
        }

        return String.valueOf(var10000.getString(this.getUser_data(), ""));
    }

    public final void saveUserData(@NotNull String userDataStr) {
        Intrinsics.checkNotNullParameter(userDataStr, "userDataStr");
        SharedPreferences var10000 = sharedPreferences;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
        }

        var10000.edit().putString(this.getUser_data(), userDataStr).apply();
    }

    public final void removeUserData() {
        SharedPreferences var10000 = sharedPreferences;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
        }

        var10000.edit().remove(this.getUser_data()).apply();
    }

    public final void clearAll() {
        SharedPreferences var10000 = sharedPreferences;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
        }

        var10000.edit().clear().apply();
    }

    private AppPreferences() {
    }

    @Metadata(
            mv = {1, 7, 0},
            k = 1,
            d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\r"},
            d2 = {"Lcom/acme/campaignproject/utility/AppPreferences$Companion;", "", "()V", "PLACE_OBJ", "", "sharePref", "Lcom/acme/campaignproject/utility/AppPreferences;", "sharedPreferences", "Landroid/content/SharedPreferences;", "user_data", "getInstance", "context", "Landroid/content/Context;", "app_debug"}
    )
    public static final class Companion {
        @NotNull
        public final AppPreferences getInstance(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (access$getSharedPreferences$li((Companion)this) == null) {
                Class var2 = AppPreferences.class;
                synchronized(var2) {
                    int var4 = false;
                    if (access$getSharedPreferences$li(AppPreferences.Companion) == null) {
                        SharedPreferences var10000 = context.getSharedPreferences(context.getPackageName(), 0);
                        Intrinsics.checkNotNullExpressionValue(var10000, "context.getSharedPrefere…e, Activity.MODE_PRIVATE)");
                        AppPreferences.sharedPreferences = var10000;
                    }

                    Unit var6 = Unit.INSTANCE;
                }
            }

            return AppPreferences.sharePref;
        }

        private Companion() {
        }

        // $FF: synthetic method
        public static final SharedPreferences access$getSharedPreferences$li(Companion $this) {
            return AppPreferences.sharedPreferences;
        }

        // $FF: synthetic method
        public static final void access$setSharedPreferences$li(Companion $this, SharedPreferences var1) {
            AppPreferences.sharedPreferences = var1;
        }

        // $FF: synthetic method
        public Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
// AppPreferences$Companion$getInstance$1.java
package com.acme.campaignproject.utility;

        import android.content.SharedPreferences;
        import kotlin.Metadata;
        import kotlin.jvm.internal.Intrinsics;
        import kotlin.jvm.internal.MutablePropertyReference0Impl;
        import org.jetbrains.annotations.Nullable;

// $FF: synthetic class
@Metadata(
        mv = {1, 7, 0},
        k = 3
)
final class AppPreferences$Companion$getInstance$1 extends MutablePropertyReference0Impl {
    AppPreferences$Companion$getInstance$1(AppPreferences.Companion var1) {
        super(var1, AppPreferences.Companion.class, "sharedPreferences", "getSharedPreferences()Landroid/content/SharedPreferences;", 0);
    }

    @Nullable
    public Object get() {
        AppPreferences.Companion var10000 = (AppPreferences.Companion)this.receiver;
        SharedPreferences var10001 = AppPreferences.access$getSharedPreferences$cp();
        if (var10001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
        }

        return var10001;
    }

    public void set(@Nullable Object value) {
        AppPreferences.Companion var10000 = (AppPreferences.Companion)this.receiver;
        AppPreferences.access$setSharedPreferences$cp((SharedPreferences)value);
    }
}
// AppPreferences$Companion$getInstance$2$1.java
package com.acme.campaignproject.utility;

        import android.content.SharedPreferences;
        import kotlin.Metadata;
        import kotlin.jvm.internal.Intrinsics;
        import kotlin.jvm.internal.MutablePropertyReference0Impl;
        import org.jetbrains.annotations.Nullable;

// $FF: synthetic class
@Metadata(
        mv = {1, 7, 0},
        k = 3
)
final class AppPreferences$Companion$getInstance$2$1 extends MutablePropertyReference0Impl {
    AppPreferences$Companion$getInstance$2$1(AppPreferences.Companion var1) {
        super(var1, AppPreferences.Companion.class, "sharedPreferences", "getSharedPreferences()Landroid/content/SharedPreferences;", 0);
    }

    @Nullable
    public Object get() {
        AppPreferences.Companion var10000 = (AppPreferences.Companion)this.receiver;
        SharedPreferences var10001 = AppPreferences.access$getSharedPreferences$cp();
        if (var10001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
        }

        return var10001;
    }

    public void set(@Nullable Object value) {
        AppPreferences.Companion var10000 = (AppPreferences.Companion)this.receiver;
        AppPreferences.access$setSharedPreferences$cp((SharedPreferences)value);
    }
}
