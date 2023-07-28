package com.acme.campaignproject.activity.dashboard;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.acme.campaignproject.databinding.ActivityAddSiteDetailBinding;
import com.acme.campaignproject.utility.NetworkUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 7, 0},
        k = 1,
        d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 M2\u00020\u00012\u00020\u0002:\u0001MB\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+J\u000e\u0010,\u001a\u00020)2\u0006\u0010*\u001a\u00020+J\u000e\u0010-\u001a\u00020)2\u0006\u0010*\u001a\u00020+J\u000e\u0010.\u001a\u00020)2\u0006\u0010*\u001a\u00020+J\b\u0010/\u001a\u000200H\u0002J\b\u00101\u001a\u00020)H\u0002J\b\u00102\u001a\u00020)H\u0002J\b\u00103\u001a\u00020)H\u0002J\"\u00104\u001a\u00020)2\u0006\u00105\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u00052\b\u00107\u001a\u0004\u0018\u000108H\u0014J\u0012\u00109\u001a\u00020)2\b\u0010:\u001a\u0004\u0018\u00010;H\u0014J\u0010\u0010<\u001a\u00020)2\u0006\u0010=\u001a\u00020>H\u0016J+\u0010?\u001a\u00020)2\u0006\u00105\u001a\u00020\u00052\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001b0A2\u0006\u0010B\u001a\u00020CH\u0016¢\u0006\u0002\u0010DJ\b\u0010E\u001a\u00020)H\u0002J\u000e\u0010F\u001a\u00020)2\u0006\u0010*\u001a\u00020+J \u0010G\u001a\u00020)2\u0006\u0010H\u001a\u00020\u001b2\u0006\u0010I\u001a\u00020\u001b2\u0006\u0010J\u001a\u00020KH\u0002J\u0006\u0010L\u001a\u00020)R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\n \u0012*\u0004\u0018\u00010\u00110\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\tR\u001a\u0010%\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0007\"\u0004\b'\u0010\t¨\u0006N"},
        d2 = {"Lcom/acme/campaignproject/activity/dashboard/AddSiteDetailActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/location/LocationListener;", "()V", "REQUEST_IMAGE_CAPTURE", "", "getREQUEST_IMAGE_CAPTURE", "()I", "setREQUEST_IMAGE_CAPTURE", "(I)V", "binding", "Lcom/acme/campaignproject/databinding/ActivityAddSiteDetailBinding;", "getBinding", "()Lcom/acme/campaignproject/databinding/ActivityAddSiteDetailBinding;", "setBinding", "(Lcom/acme/campaignproject/databinding/ActivityAddSiteDetailBinding;)V", "cal", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "dd", "getDd", "setDd", "imageUrl", "", "getImageUrl", "()Ljava/lang/String;", "setImageUrl", "(Ljava/lang/String;)V", "locationManager", "Landroid/location/LocationManager;", "mm", "getMm", "setMm", "yy", "getYy", "setYy", "addImage", "", "view", "Landroid/view/View;", "addMoreSiteClick", "btnCloseClick", "btnSaveClick", "checkPermissions", "", "dispatchTakePictureIntent", "getLastLocation", "getlatlong", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onLocationChanged", "location", "Landroid/location/Location;", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "requestPermissions", "showCalendar", "showSnackbar", "mainTextStringId", "actionStringId", "listener", "Landroid/view/View$OnClickListener;", "showSuccessMessage", "Companion", "app_debug"}
)
public final class AddSiteDetailActivity extends AppCompatActivity implements LocationListener {
    public ActivityAddSiteDetailBinding binding;
    private Calendar cal = Calendar.getInstance();
    private int yy;
    private int mm;
    private int dd;
    @NotNull
    private String imageUrl = "";
    private int REQUEST_IMAGE_CAPTURE = 101;
    private LocationManager locationManager;
    private static final String TAG = "LocationProvider";
    private static final int REQUEST_PERMISSIONS_REQUEST_CODE = 34;
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker)null);

    @NotNull
    public final ActivityAddSiteDetailBinding getBinding() {
        ActivityAddSiteDetailBinding var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        return var10000;
    }

    public final void setBinding(@NotNull ActivityAddSiteDetailBinding var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.binding = var1;
    }

    public final Calendar getCal() {
        return this.cal;
    }

    public final void setCal(Calendar var1) {
        this.cal = var1;
    }

    public final int getYy() {
        return this.yy;
    }

    public final void setYy(int var1) {
        this.yy = var1;
    }

    public final int getMm() {
        return this.mm;
    }

    public final void setMm(int var1) {
        this.mm = var1;
    }

    public final int getDd() {
        return this.dd;
    }

    public final void setDd(int var1) {
        this.dd = var1;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final void setImageUrl(@NotNull String var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.imageUrl = var1;
    }

    public final int getREQUEST_IMAGE_CAPTURE() {
        return this.REQUEST_IMAGE_CAPTURE;
    }

    public final void setREQUEST_IMAGE_CAPTURE(int var1) {
        this.REQUEST_IMAGE_CAPTURE = var1;
    }

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewDataBinding var10001 = DataBindingUtil.setContentView((Activity)this, 1300012);
        Intrinsics.checkNotNullExpressionValue(var10001, "DataBindingUtil.setConte…activity_add_site_detail)");
        this.binding = (ActivityAddSiteDetailBinding)var10001;
    }

    public final void btnCloseClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.finish();
    }

    public final void btnSaveClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ActivityAddSiteDetailBinding var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        EditText var3 = var10000.etUnitId;
        Intrinsics.checkNotNullExpressionValue(var3, "binding.etUnitId");
        CharSequence var2 = (CharSequence)var3.getText();
        if (var2 != null && var2.length() != 0) {
            var10000 = this.binding;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }

            var3 = var10000.etSiteNo;
            Intrinsics.checkNotNullExpressionValue(var3, "binding.etSiteNo");
            var2 = (CharSequence)var3.getText();
            if (var2 != null && var2.length() != 0) {
                var10000 = this.binding;
                if (var10000 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                }

                var3 = var10000.etStartDate;
                Intrinsics.checkNotNullExpressionValue(var3, "binding.etStartDate");
                var2 = (CharSequence)var3.getText();
                if (var2 != null && var2.length() != 0) {
                    var10000 = this.binding;
                    if (var10000 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    }

                    var3 = var10000.etLocation;
                    Intrinsics.checkNotNullExpressionValue(var3, "binding.etLocation");
                    var2 = (CharSequence)var3.getText();
                    if (var2 != null && var2.length() != 0) {
                        var10000 = this.binding;
                        if (var10000 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                        }

                        var3 = var10000.etLatitude;
                        Intrinsics.checkNotNullExpressionValue(var3, "binding.etLatitude");
                        var2 = (CharSequence)var3.getText();
                        if (var2 != null && var2.length() != 0) {
                            var10000 = this.binding;
                            if (var10000 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                            }

                            var3 = var10000.etLongitude;
                            Intrinsics.checkNotNullExpressionValue(var3, "binding.etLongitude");
                            var2 = (CharSequence)var3.getText();
                            if (var2 != null && var2.length() != 0) {
                                var10000 = this.binding;
                                if (var10000 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                }

                                var3 = var10000.etHeight;
                                Intrinsics.checkNotNullExpressionValue(var3, "binding.etHeight");
                                var2 = (CharSequence)var3.getText();
                                if (var2 != null && var2.length() != 0) {
                                    var10000 = this.binding;
                                    if (var10000 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                                    }

                                    var3 = var10000.etWidth;
                                    Intrinsics.checkNotNullExpressionValue(var3, "binding.etWidth");
                                    var2 = (CharSequence)var3.getText();
                                    if (var2 != null && var2.length() != 0) {
                                        var10000 = this.binding;
                                        if (var10000 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                                        }

                                        var3 = var10000.etTotalArea;
                                        Intrinsics.checkNotNullExpressionValue(var3, "binding.etTotalArea");
                                        var2 = (CharSequence)var3.getText();
                                        if (var2 != null && var2.length() != 0) {
                                            this.showSuccessMessage();
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        Toast.makeText((Context)this, (CharSequence)"Fill all the fields", 1).show();
    }

    public final void addImage(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (!NetworkUtils.Companion.isNetworkAvailable((Context)this)) {
            Toast.makeText((Context)this, (CharSequence)"Check your Internet Connection and Try Again", 1).show();
        } else if (!this.checkPermissions()) {
            this.requestPermissions();
        } else {
            this.dispatchTakePictureIntent();
        }

    }

    private final void dispatchTakePictureIntent() {
        Intent takePictureIntent = new Intent("android.media.action.IMAGE_CAPTURE");

        try {
            this.startActivityForResult(takePictureIntent, this.REQUEST_IMAGE_CAPTURE);
        } catch (ActivityNotFoundException var3) {
        }

    }

    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == this.REQUEST_IMAGE_CAPTURE && resultCode == -1) {
            Object var5;
            label23: {
                if (data != null) {
                    Bundle var10000 = data.getExtras();
                    if (var10000 != null) {
                        var5 = var10000.get("data");
                        break label23;
                    }
                }

                var5 = null;
            }

            if (var5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.graphics.Bitmap");
            }

            Bitmap imageBitmap = (Bitmap)var5;
            ActivityAddSiteDetailBinding var6 = this.binding;
            if (var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }

            var6.ivCampaignImage.setImageBitmap(imageBitmap);
            this.getlatlong();
        }

    }

    private final void getlatlong() {
        if (!this.checkPermissions()) {
            if (VERSION.SDK_INT >= 23) {
                this.requestPermissions();
            }
        } else {
            this.getLastLocation();
        }

    }

    private final void getLastLocation() {
        Object var10001 = this.getSystemService("location");
        if (var10001 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.location.LocationManager");
        } else {
            this.locationManager = (LocationManager)var10001;
            if (ActivityCompat.checkSelfPermission((Context)this, "android.permission.ACCESS_FINE_LOCATION") == 0 || ActivityCompat.checkSelfPermission((Context)this, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                LocationManager var10000 = this.locationManager;
                if (var10000 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("locationManager");
                }

                var10000.requestLocationUpdates("gps", 5000L, 5.0F, (LocationListener)this);
            }
        }
    }

    public void onLocationChanged(@NotNull Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        Log.d("lastlocation", "Latitude: " + location.getLatitude() + " , Longitude: " + location.getLongitude());
        ActivityAddSiteDetailBinding var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.etLatitude.setText((CharSequence)("" + location.getLatitude()));
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.etLongitude.setText((CharSequence)("" + location.getLongitude()));
    }

    private final void showSnackbar(String mainTextStringId, String actionStringId, View.OnClickListener listener) {
        Toast.makeText((Context)this, (CharSequence)mainTextStringId, 1).show();
    }

    private final boolean checkPermissions() {
        return ActivityCompat.checkSelfPermission((Context)this, "android.permission.ACCESS_COARSE_LOCATION") == 0 && ActivityCompat.checkSelfPermission((Context)this, "android.permission.ACCESS_FINE_LOCATION") == 0 && ActivityCompat.checkSelfPermission((Context)this, "android.permission.CAMERA") == 0;
    }

    private final void requestPermissions() {
        ActivityCompat.requestPermissions((Activity)this, new String[]{"android.permission.CAMERA", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, REQUEST_PERMISSIONS_REQUEST_CODE);
    }

    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        Log.i(TAG, "onRequestPermissionResult");
        if (requestCode == REQUEST_PERMISSIONS_REQUEST_CODE) {
            if (grantResults.length == 0) {
                Log.i(TAG, "User interaction was cancelled.");
            } else if (grantResults[0] == 0 && grantResults[1] == 0 && grantResults[2] == 0) {
                this.dispatchTakePictureIntent();
            } else {
                this.showSnackbar("Permission was denied", "Settings", (View.OnClickListener)(new View.OnClickListener() {
                    public final void onClick(View it) {
                        Intent intent = new Intent();
                        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                        Uri uri = Uri.fromParts("package", Build.DISPLAY, (String)null);
                        intent.setData(uri);
                        intent.setFlags(268435456);
                        AddSiteDetailActivity.this.startActivity(intent);
                    }
                }));
            }
        }

    }

    public final void addMoreSiteClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public final void showSuccessMessage() {
        AlertDialog.Builder builder = new AlertDialog.Builder((Context)this);
        builder.setCancelable(false);
        LayoutInflater inflater = LayoutInflater.from((Context)this);
        View var10000 = inflater.inflate(1300011, (ViewGroup)null);
        Intrinsics.checkNotNullExpressionValue(var10000, "inflater.inflate(R.layout.custom_emailsent, null)");
        View view = var10000;
        TextView tvMsg = (TextView)view.findViewById(1000003);
        TextView tvResubmit = (TextView)view.findViewById(1000006);
        Intrinsics.checkNotNullExpressionValue(tvResubmit, "tvResubmit");
        tvResubmit.setVisibility(4);
        Intrinsics.checkNotNullExpressionValue(tvMsg, "tvMsg");
        tvMsg.setText((CharSequence)"Campaign Added Successfully");
        Button btnClose = (Button)view.findViewById(1000101);
        builder.setView(view);
        AlertDialog var8 = builder.create();
        Intrinsics.checkNotNullExpressionValue(var8, "builder.create()");
        final AlertDialog dialog = var8;
        if (dialog != null) {
            Window var9 = dialog.getWindow();
            Intrinsics.checkNotNull(var9);
            Intrinsics.checkNotNullExpressionValue(var9, "dialog.window!!");
            var9.getDecorView().setBackgroundResource(17170445);
        }

        btnClose.setOnClickListener((View.OnClickListener)(new View.OnClickListener() {
            public final void onClick(View it) {
                if (dialog != null) {
                    dialog.dismiss();
                }

            }
        }));
        if (dialog != null) {
            dialog.show();
        }

    }

    public final void showCalendar(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.yy = this.cal.get(1);
        this.mm = this.cal.get(2);
        this.dd = this.cal.get(5);
        DatePickerDialog dialog = new DatePickerDialog((Context)this, (DatePickerDialog.OnDateSetListener)(new DatePickerDialog.OnDateSetListener() {
            public final void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                AddSiteDetailActivity.this.setYy(year);
                AddSiteDetailActivity.this.setMm(month);
                AddSiteDetailActivity.this.setDd(dayOfMonth);
                StringCompanionObject var6 = StringCompanionObject.INSTANCE;
                Locale var7 = Locale.getDefault();
                String var8 = "%02d-%02d-%02d";
                Object[] var9 = new Object[]{AddSiteDetailActivity.this.getDd(), AddSiteDetailActivity.this.getMm() + 1, AddSiteDetailActivity.this.getYy()};
                String var10000 = String.format(var7, var8, Arrays.copyOf(var9, var9.length));
                Intrinsics.checkNotNullExpressionValue(var10000, "format(locale, format, *args)");
                String dateStr = var10000;
                AddSiteDetailActivity.this.getBinding().etStartDate.setText((CharSequence)dateStr);
            }
        }), this.yy, this.mm, this.dd);
        DatePicker var10000 = dialog.getDatePicker();
        Intrinsics.checkNotNullExpressionValue(var10000, "dialog.datePicker");
        var10000.setMinDate(System.currentTimeMillis());
        dialog.show();
    }

    @Metadata(
            mv = {1, 7, 0},
            k = 1,
            d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0007"},
            d2 = {"Lcom/acme/campaignproject/activity/dashboard/AddSiteDetailActivity$Companion;", "", "()V", "REQUEST_PERMISSIONS_REQUEST_CODE", "", "TAG", "", "app_debug"}
    )
    public static final class Companion {
        private Companion() {
        }

        // $FF: synthetic method
        public Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
