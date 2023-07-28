package com.acme.campaignproject.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 7, 0},
        k = 1,
        d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\fHÆ\u0003J_\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\nHÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006'"},
        d2 = {"Lcom/acme/campaignproject/models/Result;", "", "_id", "", "author", "authorSlug", "content", "dateAdded", "dateModified", "length", "", "tags", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "get_id", "()Ljava/lang/String;", "getAuthor", "getAuthorSlug", "getContent", "getDateAdded", "getDateModified", "getLength", "()I", "getTags", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}
)
public final class Result {
    @NotNull
    private final String _id;
    @NotNull
    private final String author;
    @NotNull
    private final String authorSlug;
    @NotNull
    private final String content;
    @NotNull
    private final String dateAdded;
    @NotNull
    private final String dateModified;
    private final int length;
    @NotNull
    private final List tags;

    @NotNull
    public final String get_id() {
        return this._id;
    }

    @NotNull
    public final String getAuthor() {
        return this.author;
    }

    @NotNull
    public final String getAuthorSlug() {
        return this.authorSlug;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final String getDateAdded() {
        return this.dateAdded;
    }

    @NotNull
    public final String getDateModified() {
        return this.dateModified;
    }

    public final int getLength() {
        return this.length;
    }

    @NotNull
    public final List getTags() {
        return this.tags;
    }

    public Result(@NotNull String _id, @NotNull String author, @NotNull String authorSlug, @NotNull String content, @NotNull String dateAdded, @NotNull String dateModified, int length, @NotNull List tags) {
        Intrinsics.checkNotNullParameter(_id, "_id");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(authorSlug, "authorSlug");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(dateAdded, "dateAdded");
        Intrinsics.checkNotNullParameter(dateModified, "dateModified");
        Intrinsics.checkNotNullParameter(tags, "tags");
        super();
        this._id = _id;
        this.author = author;
        this.authorSlug = authorSlug;
        this.content = content;
        this.dateAdded = dateAdded;
        this.dateModified = dateModified;
        this.length = length;
        this.tags = tags;
    }

    @NotNull
    public final String component1() {
        return this._id;
    }

    @NotNull
    public final String component2() {
        return this.author;
    }

    @NotNull
    public final String component3() {
        return this.authorSlug;
    }

    @NotNull
    public final String component4() {
        return this.content;
    }

    @NotNull
    public final String component5() {
        return this.dateAdded;
    }

    @NotNull
    public final String component6() {
        return this.dateModified;
    }

    public final int component7() {
        return this.length;
    }

    @NotNull
    public final List component8() {
        return this.tags;
    }

    @NotNull
    public final Result copy(@NotNull String _id, @NotNull String author, @NotNull String authorSlug, @NotNull String content, @NotNull String dateAdded, @NotNull String dateModified, int length, @NotNull List tags) {
        Intrinsics.checkNotNullParameter(_id, "_id");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(authorSlug, "authorSlug");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(dateAdded, "dateAdded");
        Intrinsics.checkNotNullParameter(dateModified, "dateModified");
        Intrinsics.checkNotNullParameter(tags, "tags");
        return new Result(_id, author, authorSlug, content, dateAdded, dateModified, length, tags);
    }

    // $FF: synthetic method
    public static Result copy$default(Result var0, String var1, String var2, String var3, String var4, String var5, String var6, int var7, List var8, int var9, Object var10) {
        if ((var9 & 1) != 0) {
            var1 = var0._id;
        }

        if ((var9 & 2) != 0) {
            var2 = var0.author;
        }

        if ((var9 & 4) != 0) {
            var3 = var0.authorSlug;
        }

        if ((var9 & 8) != 0) {
            var4 = var0.content;
        }

        if ((var9 & 16) != 0) {
            var5 = var0.dateAdded;
        }

        if ((var9 & 32) != 0) {
            var6 = var0.dateModified;
        }

        if ((var9 & 64) != 0) {
            var7 = var0.length;
        }

        if ((var9 & 128) != 0) {
            var8 = var0.tags;
        }

        return var0.copy(var1, var2, var3, var4, var5, var6, var7, var8);
    }

    @NotNull
    public String toString() {
        return "Result(_id=" + this._id + ", author=" + this.author + ", authorSlug=" + this.authorSlug + ", content=" + this.content + ", dateAdded=" + this.dateAdded + ", dateModified=" + this.dateModified + ", length=" + this.length + ", tags=" + this.tags + ")";
    }

    public int hashCode() {
        String var10000 = this._id;
        int var1 = (var10000 != null ? var10000.hashCode() : 0) * 31;
        String var10001 = this.author;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.authorSlug;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.content;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.dateAdded;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.dateModified;
        var1 = ((var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31 + Integer.hashCode(this.length)) * 31;
        List var2 = this.tags;
        return var1 + (var2 != null ? var2.hashCode() : 0);
    }

    public boolean equals(@Nullable Object var1) {
        if (this != var1) {
            if (var1 instanceof Result) {
                Result var2 = (Result)var1;
                if (Intrinsics.areEqual(this._id, var2._id) && Intrinsics.areEqual(this.author, var2.author) && Intrinsics.areEqual(this.authorSlug, var2.authorSlug) && Intrinsics.areEqual(this.content, var2.content) && Intrinsics.areEqual(this.dateAdded, var2.dateAdded) && Intrinsics.areEqual(this.dateModified, var2.dateModified) && this.length == var2.length && Intrinsics.areEqual(this.tags, var2.tags)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}
