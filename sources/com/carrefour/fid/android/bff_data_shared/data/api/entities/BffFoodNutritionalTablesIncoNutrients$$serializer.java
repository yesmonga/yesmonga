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
import kotlinx.serialization.internal.C12310s1;
import kotlinx.serialization.internal.C12311t;
import kotlinx.serialization.internal.C12327y;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.C12579k;

@C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffFoodNutritionalTablesIncoNutrients.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFoodNutritionalTablesIncoNutrients;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffFoodNutritionalTablesIncoNutrients$$serializer implements C12327y<BffFoodNutritionalTablesIncoNutrients> {
    @C12579k
    public static final BffFoodNutritionalTablesIncoNutrients$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffFoodNutritionalTablesIncoNutrients$$serializer bffFoodNutritionalTablesIncoNutrients$$serializer = new BffFoodNutritionalTablesIncoNutrients$$serializer();
        INSTANCE = bffFoodNutritionalTablesIncoNutrients$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFoodNutritionalTablesIncoNutrients", bffFoodNutritionalTablesIncoNutrients$$serializer, 5);
        pluginGeneratedSerialDescriptor.mo24966k("column_id", true);
        pluginGeneratedSerialDescriptor.mo24966k("column_portion_unit", true);
        pluginGeneratedSerialDescriptor.mo24966k("column_portion_value", true);
        pluginGeneratedSerialDescriptor.mo24966k("nutrient", true);
        pluginGeneratedSerialDescriptor.mo24966k("preparation_status", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffFoodNutritionalTablesIncoNutrients$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        C12248g[] access$get$childSerializers$cp = BffFoodNutritionalTablesIncoNutrients.$childSerializers;
        C12310s1 s1Var = C12310s1.f30117a;
        return new C12248g[]{C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(C12311t.f30119a), C12197a.m48817q(access$get$childSerializers$cp[3]), C12197a.m48817q(s1Var)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFoodNutritionalTablesIncoNutrients deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r17) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlinx.serialization.descriptors.f r1 = r16.getDescriptor()
            kotlinx.serialization.encoding.c r0 = r0.mo24875b(r1)
            kotlinx.serialization.g[] r2 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFoodNutritionalTablesIncoNutrients.$childSerializers
            boolean r3 = r0.mo24886p()
            r4 = 4
            r5 = 2
            r6 = 3
            r7 = 1
            r8 = 0
            r9 = 0
            if (r3 == 0) goto L_0x003f
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r8 = r0.mo24885n(r1, r8, r3, r9)
            java.lang.Object r7 = r0.mo24885n(r1, r7, r3, r9)
            kotlinx.serialization.internal.t r10 = kotlinx.serialization.internal.C12311t.f30119a
            java.lang.Object r5 = r0.mo24885n(r1, r5, r10, r9)
            r2 = r2[r6]
            java.lang.Object r2 = r0.mo24885n(r1, r6, r2, r9)
            java.lang.Object r3 = r0.mo24885n(r1, r4, r3, r9)
            r4 = 31
            r11 = r5
            r5 = r4
            goto L_0x0097
        L_0x003f:
            r14 = r7
            r3 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
        L_0x0045:
            if (r14 == 0) goto L_0x0092
            int r15 = r0.mo24931o(r1)
            r8 = -1
            if (r15 == r8) goto L_0x008e
            if (r15 == 0) goto L_0x0083
            if (r15 == r7) goto L_0x0079
            if (r15 == r5) goto L_0x0070
            if (r15 == r6) goto L_0x0067
            if (r15 != r4) goto L_0x0061
            kotlinx.serialization.internal.s1 r8 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r13 = r0.mo24885n(r1, r4, r8, r13)
            r3 = r3 | 16
            goto L_0x0081
        L_0x0061:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r15)
            throw r0
        L_0x0067:
            r8 = r2[r6]
            java.lang.Object r12 = r0.mo24885n(r1, r6, r8, r12)
            r3 = r3 | 8
            goto L_0x0081
        L_0x0070:
            kotlinx.serialization.internal.t r8 = kotlinx.serialization.internal.C12311t.f30119a
            java.lang.Object r11 = r0.mo24885n(r1, r5, r8, r11)
            r3 = r3 | 4
            goto L_0x0081
        L_0x0079:
            kotlinx.serialization.internal.s1 r8 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r10 = r0.mo24885n(r1, r7, r8, r10)
            r3 = r3 | 2
        L_0x0081:
            r8 = 0
            goto L_0x0045
        L_0x0083:
            kotlinx.serialization.internal.s1 r8 = kotlinx.serialization.internal.C12310s1.f30117a
            r15 = 0
            java.lang.Object r9 = r0.mo24885n(r1, r15, r8, r9)
            r3 = r3 | 1
            r8 = r15
            goto L_0x0045
        L_0x008e:
            r15 = 0
            r8 = r15
            r14 = r8
            goto L_0x0045
        L_0x0092:
            r5 = r3
            r8 = r9
            r7 = r10
            r2 = r12
            r3 = r13
        L_0x0097:
            r0.mo24876c(r1)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFoodNutritionalTablesIncoNutrients r0 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFoodNutritionalTablesIncoNutrients
            r6 = r8
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = (java.lang.String) r7
            r8 = r11
            java.lang.Double r8 = (java.lang.Double) r8
            r9 = r2
            java.util.List r9 = (java.util.List) r9
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10
            r11 = 0
            r4 = r0
            r4.<init>((int) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.Double) r8, (java.util.List) r9, (java.lang.String) r10, (kotlinx.serialization.internal.C12295n1) r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFoodNutritionalTablesIncoNutrients$$serializer.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFoodNutritionalTablesIncoNutrients");
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffFoodNutritionalTablesIncoNutrients bffFoodNutritionalTablesIncoNutrients) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffFoodNutritionalTablesIncoNutrients, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffFoodNutritionalTablesIncoNutrients.write$Self(bffFoodNutritionalTablesIncoNutrients, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}