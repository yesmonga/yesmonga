package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.builtins.C12197a;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.encoding.C12244g;
import kotlinx.serialization.internal.C12276h0;
import kotlinx.serialization.internal.C12310s1;
import kotlinx.serialization.internal.C12327y;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.C12579k;

@C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffLimit.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffLimit;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffLimit$$serializer implements C12327y<BffLimit> {
    @C12579k
    public static final BffLimit$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffLimit$$serializer bffLimit$$serializer = new BffLimit$$serializer();
        INSTANCE = bffLimit$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLimit", bffLimit$$serializer, 4);
        pluginGeneratedSerialDescriptor.mo24966k("max_triggered", true);
        pluginGeneratedSerialDescriptor.mo24966k("scope", true);
        pluginGeneratedSerialDescriptor.mo24966k("consumer_type", true);
        pluginGeneratedSerialDescriptor.mo24966k("period", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffLimit$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        C12310s1 s1Var = C12310s1.f30117a;
        return new C12248g[]{C12197a.m48817q(C12276h0.f30067a), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLimit deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r15) {
        /*
            r14 = this;
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            kotlinx.serialization.descriptors.f r0 = r14.getDescriptor()
            kotlinx.serialization.encoding.c r15 = r15.mo24875b(r0)
            boolean r1 = r15.mo24886p()
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            if (r1 == 0) goto L_0x0030
            kotlinx.serialization.internal.h0 r1 = kotlinx.serialization.internal.C12276h0.f30067a
            java.lang.Object r1 = r15.mo24885n(r0, r5, r1, r6)
            kotlinx.serialization.internal.s1 r5 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r4 = r15.mo24885n(r0, r4, r5, r6)
            java.lang.Object r3 = r15.mo24885n(r0, r3, r5, r6)
            java.lang.Object r2 = r15.mo24885n(r0, r2, r5, r6)
            r5 = 15
            r6 = r5
            goto L_0x0078
        L_0x0030:
            r10 = r4
            r1 = r5
            r7 = r6
            r8 = r7
            r9 = r8
        L_0x0035:
            if (r10 == 0) goto L_0x0072
            int r11 = r15.mo24931o(r0)
            r12 = -1
            if (r11 == r12) goto L_0x0070
            if (r11 == 0) goto L_0x0067
            if (r11 == r4) goto L_0x005e
            if (r11 == r3) goto L_0x0055
            if (r11 != r2) goto L_0x004f
            kotlinx.serialization.internal.s1 r11 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r9 = r15.mo24885n(r0, r2, r11, r9)
            r1 = r1 | 8
            goto L_0x0035
        L_0x004f:
            kotlinx.serialization.UnknownFieldException r15 = new kotlinx.serialization.UnknownFieldException
            r15.<init>((int) r11)
            throw r15
        L_0x0055:
            kotlinx.serialization.internal.s1 r11 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r8 = r15.mo24885n(r0, r3, r11, r8)
            r1 = r1 | 4
            goto L_0x0035
        L_0x005e:
            kotlinx.serialization.internal.s1 r11 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r7 = r15.mo24885n(r0, r4, r11, r7)
            r1 = r1 | 2
            goto L_0x0035
        L_0x0067:
            kotlinx.serialization.internal.h0 r11 = kotlinx.serialization.internal.C12276h0.f30067a
            java.lang.Object r6 = r15.mo24885n(r0, r5, r11, r6)
            r1 = r1 | 1
            goto L_0x0035
        L_0x0070:
            r10 = r5
            goto L_0x0035
        L_0x0072:
            r4 = r7
            r3 = r8
            r2 = r9
            r13 = r6
            r6 = r1
            r1 = r13
        L_0x0078:
            r15.mo24876c(r0)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLimit r15 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLimit
            r7 = r1
            java.lang.Integer r7 = (java.lang.Integer) r7
            r8 = r4
            java.lang.String r8 = (java.lang.String) r8
            r9 = r3
            java.lang.String r9 = (java.lang.String) r9
            r10 = r2
            java.lang.String r10 = (java.lang.String) r10
            r11 = 0
            r5 = r15
            r5.<init>((int) r6, (java.lang.Integer) r7, (java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r10, (kotlinx.serialization.internal.C12295n1) r11)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLimit$$serializer.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLimit");
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffLimit bffLimit) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffLimit, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffLimit.write$Self(bffLimit, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}