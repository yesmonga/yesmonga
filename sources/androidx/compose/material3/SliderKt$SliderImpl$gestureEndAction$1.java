package androidx.compose.material3;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SliderKt$SliderImpl$gestureEndAction$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ SliderDraggableState $draggableState;
    final /* synthetic */ C11289a<C11079d2> $onValueChangeFinished;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$SliderImpl$gestureEndAction$1(SliderDraggableState sliderDraggableState, C11289a<C11079d2> aVar) {
        super(0);
        this.$draggableState = sliderDraggableState;
        this.$onValueChangeFinished = aVar;
    }

    public final void invoke() {
        C11289a<C11079d2> aVar;
        if (!this.$draggableState.mo11885h() && (aVar = this.$onValueChangeFinished) != null) {
            aVar.invoke();
        }
    }
}