package com.carrefour.fid.android.presentation.viewmodels.home;

import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.models.service.models.C38162k;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$trackScreen$1$1", mo22502f = "HomePageViewModel.kt", mo22503i = {}, mo22504l = {684, 685}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class HomePageViewModel$trackScreen$1$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ HomeAnalyticsViewModel $this_apply;
    int label;
    final /* synthetic */ HomePageViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomePageViewModel$trackScreen$1$1(HomePageViewModel homePageViewModel, HomeAnalyticsViewModel homeAnalyticsViewModel, C11045c<? super HomePageViewModel$trackScreen$1$1> cVar) {
        super(2, cVar);
        this.this$0 = homePageViewModel;
        this.$this_apply = homeAnalyticsViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new HomePageViewModel$trackScreen$1$1(this.this$0, this.$this_apply, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C37823k C0 = this.this$0.f64427N;
            this.label = 1;
            obj2 = C0.m172965invokeIoAF18A(this);
            if (obj2 == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
            obj2 = ((Result) obj).mo21858l();
        } else if (i == 2) {
            C11661u0.m45747n(obj);
            return C11079d2.f28267a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (Result.m38709i(obj2)) {
            obj2 = null;
        }
        HomeAnalyticsViewModel homeAnalyticsViewModel = this.$this_apply;
        this.label = 2;
        if (homeAnalyticsViewModel.mo76695c((C38162k) obj2, this) == h) {
            return h;
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((HomePageViewModel$trackScreen$1$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}