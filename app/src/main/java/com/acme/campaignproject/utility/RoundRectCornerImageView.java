package com.acme.campaignproject.utility;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Path.Direction;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 7, 0},
        k = 1,
        d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0014R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"},
        d2 = {"Lcom/acme/campaignproject/utility/RoundRectCornerImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "path", "Landroid/graphics/Path;", "radius", "", "rect", "Landroid/graphics/RectF;", "init", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "app_debug"}
)
public final class RoundRectCornerImageView extends AppCompatImageView {
    private final float radius;
    private Path path;
    private RectF rect;

    private final void init() {
        this.path = new Path();
    }

    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.rect = new RectF(0.0F, 0.0F, (float)this.getWidth(), (float)this.getHeight());
        Path var10000 = this.path;
        Intrinsics.checkNotNull(var10000);
        RectF var10001 = this.rect;
        Intrinsics.checkNotNull(var10001);
        var10000.addRoundRect(var10001, this.radius, this.radius, Direction.CW);
        Path var2 = this.path;
        Intrinsics.checkNotNull(var2);
        canvas.clipPath(var2);
        super.onDraw(canvas);
    }

    public RoundRectCornerImageView(@Nullable Context context) {
        super(context);

        Intrinsics.checkNotNull(context);
        this.radius = 10.0F;
        this.init();
    }

    public RoundRectCornerImageView(@Nullable Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        Intrinsics.checkNotNull(context);
        this.radius = 10.0F;
        this.init();
    }

    public RoundRectCornerImageView(@Nullable Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        Intrinsics.checkNotNull(context);
        this.radius = 10.0F;
        this.init();
    }
}
