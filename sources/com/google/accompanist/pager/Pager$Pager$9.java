package com.google.accompanist.pager;

import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class Pager$Pager$9 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ C11306r<C15029c, Integer, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ C2366i0 $contentPadding;
    final /* synthetic */ int $count;
    final /* synthetic */ C2195g $flingBehavior;
    final /* synthetic */ C8734c.C8736b $horizontalAlignment;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ float $itemSpacing;
    final /* synthetic */ C11300l<Integer, Object> $key;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ PagerState $state;
    final /* synthetic */ boolean $userScrollEnabled;
    final /* synthetic */ C8734c.C8737c $verticalAlignment;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Pager$Pager$9(int i, C8767m mVar, PagerState pagerState, boolean z, float f, boolean z2, C2195g gVar, C11300l<? super Integer, ? extends Object> lVar, C2366i0 i0Var, boolean z3, C8734c.C8737c cVar, C8734c.C8736b bVar, C11306r<? super C15029c, ? super Integer, ? super C8592o, ? super Integer, C11079d2> rVar, int i2, int i3, int i4) {
        super(2);
        this.$count = i;
        this.$modifier = mVar;
        this.$state = pagerState;
        this.$reverseLayout = z;
        this.$itemSpacing = f;
        this.$isVertical = z2;
        this.$flingBehavior = gVar;
        this.$key = lVar;
        this.$contentPadding = i0Var;
        this.$userScrollEnabled = z3;
        this.$verticalAlignment = cVar;
        this.$horizontalAlignment = bVar;
        this.$content = rVar;
        this.$$changed = i2;
        this.$$changed1 = i3;
        this.$$default = i4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        int i2 = this.$count;
        C8767m mVar = this.$modifier;
        PagerState pagerState = this.$state;
        boolean z = this.$reverseLayout;
        float f = this.$itemSpacing;
        boolean z2 = this.$isVertical;
        C2195g gVar = this.$flingBehavior;
        C11300l<Integer, Object> lVar = this.$key;
        C2366i0 i0Var = this.$contentPadding;
        boolean z3 = this.$userScrollEnabled;
        C8734c.C8737c cVar = this.$verticalAlignment;
        C8734c.C8736b bVar = this.$horizontalAlignment;
        C11306r<C15029c, Integer, C8592o, Integer, C11079d2> rVar = this.$content;
        int i3 = i2;
        Pager.m64355b(i3, mVar, pagerState, z, f, z2, gVar, lVar, i0Var, z3, cVar, bVar, rVar, oVar, C8590n1.m31123a(this.$$changed | 1), C8590n1.m31123a(this.$$changed1), this.$$default);
    }
}