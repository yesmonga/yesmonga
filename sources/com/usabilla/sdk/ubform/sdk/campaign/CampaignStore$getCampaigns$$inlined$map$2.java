package com.usabilla.sdk.ubform.sdk.campaign;

import com.usabilla.sdk.ubform.eventengine.C9831a;
import java.util.List;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class CampaignStore$getCampaigns$$inlined$map$2 implements C11907e<Integer> {

    /* renamed from: a */
    public final /* synthetic */ C11907e f27396a;

    /* renamed from: b */
    public final /* synthetic */ CampaignStore f27397b;

    public CampaignStore$getCampaigns$$inlined$map$2(C11907e eVar, CampaignStore campaignStore) {
        this.f27396a = eVar;
        this.f27397b = campaignStore;
    }

    @C12580l
    public Object collect(@C12579k final C11908f fVar, @C12579k C11045c cVar) {
        Object collect = this.f27396a.collect(new C11908f<List<? extends C9831a>>() {
            /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x0064 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            @org.jetbrains.annotations.C12580l
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.usabilla.sdk.ubform.sdk.campaign.CampaignStore$getCampaigns$$inlined$map$2.C99402.C99411
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignStore$getCampaigns$$inlined$map$2$2$1 r0 = (com.usabilla.sdk.ubform.sdk.campaign.CampaignStore$getCampaigns$$inlined$map$2.C99402.C99411) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignStore$getCampaigns$$inlined$map$2$2$1 r0 = new com.usabilla.sdk.ubform.sdk.campaign.CampaignStore$getCampaigns$$inlined$map$2$2$1
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                    int r2 = r0.label
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x003c
                    if (r2 == r4) goto L_0x0034
                    if (r2 != r3) goto L_0x002c
                    kotlin.C11661u0.m45747n(r8)
                    goto L_0x0065
                L_0x002c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0034:
                    java.lang.Object r7 = r0.L$0
                    kotlinx.coroutines.flow.f r7 = (kotlinx.coroutines.flow.C11908f) r7
                    kotlin.C11661u0.m45747n(r8)
                    goto L_0x0059
                L_0x003c:
                    kotlin.C11661u0.m45747n(r8)
                    kotlinx.coroutines.flow.f r8 = r3
                    java.util.List r7 = (java.util.List) r7
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignStore$getCampaigns$$inlined$map$2 r2 = r2
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignStore r2 = r2.f27397b
                    kotlinx.coroutines.flow.e r7 = r2.mo20779o(r7)
                    r0.L$0 = r8
                    r0.label = r4
                    java.lang.Object r7 = kotlinx.coroutines.flow.C11909g.m47374I1(r7, r0)
                    if (r7 != r1) goto L_0x0056
                    return r1
                L_0x0056:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L_0x0059:
                    r2 = 0
                    r0.L$0 = r2
                    r0.label = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L_0x0065
                    return r1
                L_0x0065:
                    kotlin.d2 r7 = kotlin.C11079d2.f28267a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.sdk.campaign.CampaignStore$getCampaigns$$inlined$map$2.C99402.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }, cVar);
        if (collect == C11063b.m42612h()) {
            return collect;
        }
        return C11079d2.f28267a;
    }
}