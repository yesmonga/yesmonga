package androidx.constraintlayout.compose;

import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 5, 1}, mo22520xi = 48)
public final class Measurer$createDesignElements$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Measurer $tmp0_rcvr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Measurer$createDesignElements$3(Measurer measurer, int i) {
        super(2);
        this.$tmp0_rcvr = measurer;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        this.$tmp0_rcvr.mo48393h(oVar, this.$$changed | 1);
    }
}