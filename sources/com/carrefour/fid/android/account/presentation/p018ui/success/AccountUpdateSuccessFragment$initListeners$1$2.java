package com.carrefour.fid.android.account.presentation.p018ui.success;

import com.carrefour.fid.android.account.presentation.analytics.C13294h;
import com.carrefour.fid.android.account.presentation.models.NameLastView;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.account.presentation.ui.success.AccountUpdateSuccessFragment$initListeners$1$2", mo22502f = "AccountUpdateSuccessFragment.kt", mo22503i = {}, mo22504l = {81}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"Lkotlin/d2;", "it", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.account.presentation.ui.success.AccountUpdateSuccessFragment$initListeners$1$2 */
public final class AccountUpdateSuccessFragment$initListeners$1$2 extends SuspendLambda implements C11304p<C11079d2, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ AccountUpdateSuccessFragment this$0;

    /* renamed from: com.carrefour.fid.android.account.presentation.ui.success.AccountUpdateSuccessFragment$initListeners$1$2$a */
    public /* synthetic */ class C13554a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NameLastView.values().length];
            try {
                iArr[NameLastView.UPDATEEMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountUpdateSuccessFragment$initListeners$1$2(AccountUpdateSuccessFragment accountUpdateSuccessFragment, C11045c<? super AccountUpdateSuccessFragment$initListeners$1$2> cVar) {
        super(2, cVar);
        this.this$0 = accountUpdateSuccessFragment;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new AccountUpdateSuccessFragment$initListeners$1$2(this.this$0, cVar);
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11079d2 d2Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((AccountUpdateSuccessFragment$initListeners$1$2) create(d2Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C13294h W0 = this.this$0.mo32155W0();
            NameLastView g = this.this$0.mo32154V0().mo32176g();
            this.label = 1;
            if (W0.mo31595a(g, this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (C13554a.$EnumSwitchMapping$0[this.this$0.mo32154V0().mo32176g().ordinal()] == 1) {
            FragmentKt.m118823k(this.this$0, C13557b.f33049a.mo32185a());
        } else {
            this.this$0.mo32153U0();
        }
        return C11079d2.f28267a;
    }
}