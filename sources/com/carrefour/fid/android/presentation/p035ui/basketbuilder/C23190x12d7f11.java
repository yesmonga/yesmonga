package com.carrefour.fid.android.presentation.p035ui.basketbuilder;

import com.carrefour.fid.android.presentation.models.OfferProductModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.basketbuilder.BasketBuilderFrequentPurchasesFragment$handleDepartmentList$1$1$1$1 */
public final class C23190x12d7f11 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ int $groupIndex;
    final /* synthetic */ int $index;
    final /* synthetic */ OfferProductModel $offer;
    final /* synthetic */ BasketBuilderFrequentPurchasesFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23190x12d7f11(BasketBuilderFrequentPurchasesFragment basketBuilderFrequentPurchasesFragment, OfferProductModel offerProductModel, int i, int i2) {
        super(0);
        this.this$0 = basketBuilderFrequentPurchasesFragment;
        this.$offer = offerProductModel;
        this.$groupIndex = i;
        this.$index = i2;
    }

    public final void invoke() {
        this.this$0.mo67993o0(this.$offer, (this.$groupIndex * 5) + this.$index + 1);
    }
}