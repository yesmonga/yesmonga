package androidx.compose.foundation.layout;

import androidx.compose.p004ui.platform.C15983v0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo22516d2 = {"Landroidx/compose/ui/platform/v0;", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/platform/v0;)V", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n*L\n1#1,170:1\n102#2,3:171\n*E\n"})
/* renamed from: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsTopHeight$$inlined$debugInspectorInfo$1 */
public final class C2336x4005a8ba extends Lambda implements C11300l<C15983v0, C11079d2> {
    final /* synthetic */ C2354e1 $insets$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2336x4005a8ba(C2354e1 e1Var) {
        super(1);
        this.$insets$inlined = e1Var;
    }

    /* renamed from: a */
    public final void mo7976a(@C12579k C15983v0 v0Var) {
        Intrinsics.checkNotNullParameter(v0Var, "$this$null");
        v0Var.mo45973d("insetsTopHeight");
        v0Var.mo45971b().mo45707c("insets", this.$insets$inlined);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo7976a((C15983v0) obj);
        return C11079d2.f28267a;
    }
}