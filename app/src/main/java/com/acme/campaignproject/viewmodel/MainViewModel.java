package com.acme.campaignproject.viewmodel;

import androidx.lifecycle.ViewModel;
import com.acme.campaignproject.repository.CampaignRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
        mv = {1, 7, 0},
        k = 1,
        d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"},
        d2 = {"Lcom/acme/campaignproject/viewmodel/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/acme/campaignproject/repository/CampaignRepository;", "(Lcom/acme/campaignproject/repository/CampaignRepository;)V", "app_debug"}
)
public final class MainViewModel extends ViewModel {
    private final CampaignRepository repository;

    public MainViewModel(@NotNull CampaignRepository repository) {
        super();
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
    }
}
