package com.acme.campaignproject.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.acme.campaignproject.repository.CampaignRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
        mv = {1, 7, 0},
        k = 1,
        d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J'\u0010\u0005\u001a\u0002H\u0006\"\n\b\u0000\u0010\u0006*\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\tH\u0016¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"},
        d2 = {"Lcom/acme/campaignproject/viewmodel/MainViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "repository", "Lcom/acme/campaignproject/repository/CampaignRepository;", "(Lcom/acme/campaignproject/repository/CampaignRepository;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"}
)
public final class MainViewModelFactory implements ViewModelProvider.Factory {
    private final CampaignRepository repository;

    public ViewModel create(@NotNull Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(MainViewModel.class)) {
            return (ViewModel)(new MainViewModel(this.repository));
        } else {
            throw new IllegalArgumentException("ViewModel Not Found");
        }
    }

    public MainViewModelFactory(@NotNull CampaignRepository repository) {
        super();

        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
    }
}
