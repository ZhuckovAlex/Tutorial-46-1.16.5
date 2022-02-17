package net.project.project.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.project.project.entity.custom.TrolEntity;

public class TrolModel <T extends TrolEntity> extends EntityModel<T>

    {
    private final ModelRenderer body;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer head;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer cube_r33;
    private final ModelRenderer cube_r34;
    private final ModelRenderer cube_r35;
    private final ModelRenderer rightArm;
    private final ModelRenderer cube_r36;
    private final ModelRenderer cube_r37;
    private final ModelRenderer cube_r38;
    private final ModelRenderer cube_r39;
    private final ModelRenderer cube_r40;
    private final ModelRenderer cube_r41;
    private final ModelRenderer cube_r42;
    private final ModelRenderer cube_r43;
    private final ModelRenderer cube_r44;
    private final ModelRenderer cube_r45;
    private final ModelRenderer cube_r46;
    private final ModelRenderer leftArm;
    private final ModelRenderer cube_r47;
    private final ModelRenderer cube_r48;
    private final ModelRenderer cube_r49;
    private final ModelRenderer cube_r50;
    private final ModelRenderer cube_r51;
    private final ModelRenderer cube_r52;
    private final ModelRenderer cube_r53;
    private final ModelRenderer cube_r54;
    private final ModelRenderer cube_r55;
    private final ModelRenderer cube_r56;
    private final ModelRenderer rightLeg;
    private final ModelRenderer cube_r57;
    private final ModelRenderer cube_r58;
    private final ModelRenderer cube_r59;
    private final ModelRenderer cube_r60;
    private final ModelRenderer leftLeg;
    private final ModelRenderer cube_r61;
    private final ModelRenderer cube_r62;
    private final ModelRenderer cube_r63;
    private final ModelRenderer cube_r64;

	public TrolModel() {
        textureWidth  = 64;
        textureHeight = 64;

        body = new ModelRenderer(this);
        body.setRotationPoint(0.9403F, 12.2031F, -0.2289F);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(3.5597F, 0.2969F, 0.2289F);
        body.addChild(cube_r1);
        setRotationAngle(cube_r1, -0.1704F, -0.0042F, 0.0382F);
        cube_r1.setTextureOffset(21, 4).addBox(-3.5F, -1.5F, -3.0F, 5.0F, 3.0F, 5.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(-5.4403F, 0.2969F, 0.2289F);
        body.addChild(cube_r2);
        setRotationAngle(cube_r2, -0.1704F, 0.0042F, -0.0382F);
        cube_r2.setTextureOffset(0, 22).addBox(-1.5F, -1.5F, -3.0F, 5.0F, 3.0F, 5.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(-3.9403F, -2.2031F, -2.2711F);
        body.addChild(cube_r3);
        setRotationAngle(cube_r3, -0.0679F, 0.0671F, -0.4703F);
        cube_r3.setTextureOffset(51, 53).addBox(-2.0F, -1.0F, -0.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(-3.9403F, -2.2031F, -2.2711F);
        body.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.2502F, 0.0779F, -0.2956F);
        cube_r4.setTextureOffset(44, 52).addBox(-2.0F, -1.0F, -1.5F, 3.0F, 2.0F, 2.0F, 0.0F, false);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(-0.9403F, -3.2031F, -0.7711F);
        body.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.1739F, -0.0151F, 0.0859F);
        cube_r5.setTextureOffset(48, 26).addBox(-2.0F, -1.0F, -3.0F, 5.0F, 3.0F, 1.0F, 0.0F, false);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setRotationPoint(-0.9403F, -3.2031F, -0.7711F);
        body.addChild(cube_r6);
        setRotationAngle(cube_r6, -0.2616F, -0.0113F, -0.0421F);
        cube_r6.setTextureOffset(18, 30).addBox(-3.0F, -1.0F, -2.0F, 5.0F, 2.0F, 4.0F, 0.0F, false);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setRotationPoint(-0.4403F, -1.7031F, 0.2289F);
        body.addChild(cube_r7);
        setRotationAngle(cube_r7, -1.0018F, 0.0736F, 0.047F);
        cube_r7.setTextureOffset(0, 30).addBox(-0.5F, -2.5F, 0.0F, 5.0F, 3.0F, 4.0F, 0.0F, false);

        cube_r8 = new ModelRenderer(this);
        cube_r8.setRotationPoint(-0.4403F, -1.7031F, 0.2289F);
        body.addChild(cube_r8);
        setRotationAngle(cube_r8, -0.3043F, -0.0262F, -0.0832F);
        cube_r8.setTextureOffset(0, 9).addBox(-4.5F, -1.5F, -3.0F, 8.0F, 3.0F, 4.0F, 0.0F, false);

        cube_r9 = new ModelRenderer(this);
        cube_r9.setRotationPoint(-3.9403F, -1.2031F, 1.2289F);
        body.addChild(cube_r9);
        setRotationAngle(cube_r9, -0.2608F, -0.0226F, -0.3461F);
        cube_r9.setTextureOffset(0, 16).addBox(-4.0F, -1.0F, -2.0F, 8.0F, 2.0F, 4.0F, 0.0F, false);

        cube_r10 = new ModelRenderer(this);
        cube_r10.setRotationPoint(1.0597F, 6.7553F, 0.1834F);
        body.addChild(cube_r10);
        setRotationAngle(cube_r10, 0.047F, 0.0736F, -1.0018F);
        cube_r10.setTextureOffset(21, 0).addBox(-3.0F, -4.0F, -1.0F, 11.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r11 = new ModelRenderer(this);
        cube_r11.setRotationPoint(-0.9403F, 7.2969F, -0.2711F);
        body.addChild(cube_r11);
        setRotationAngle(cube_r11, 0.0873F, 0.0F, 0.0F);
        cube_r11.setTextureOffset(19, 17).addBox(-3.0F, -1.5F, -0.5F, 6.0F, 2.0F, 5.0F, 0.0F, false);

        cube_r12 = new ModelRenderer(this);
        cube_r12.setRotationPoint(5.0714F, -1.9659F, 0.9206F);
        body.addChild(cube_r12);
        setRotationAngle(cube_r12, -0.3017F, -0.1619F, 0.3115F);
        cube_r12.setTextureOffset(41, 9).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r13 = new ModelRenderer(this);
        cube_r13.setRotationPoint(4.6758F, -2.1543F, -1.094F);
        body.addChild(cube_r13);
        setRotationAngle(cube_r13, 0.1373F, 0.1003F, 0.2256F);
        cube_r13.setTextureOffset(52, 7).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r14 = new ModelRenderer(this);
        cube_r14.setRotationPoint(4.3356F, -1.672F, -3.0439F);
        body.addChild(cube_r14);
        setRotationAngle(cube_r14, 0.1969F, 0.4759F, 0.3146F);
        cube_r14.setTextureOffset(52, 5).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r15 = new ModelRenderer(this);
        cube_r15.setRotationPoint(4.6254F, -1.7591F, -2.0908F);
        body.addChild(cube_r15);
        setRotationAngle(cube_r15, 0.1389F, 0.2751F, 0.1835F);
        cube_r15.setTextureOffset(52, 30).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r16 = new ModelRenderer(this);
        cube_r16.setRotationPoint(4.6313F, -2.1268F, -0.0944F);
        body.addChild(cube_r16);
        setRotationAngle(cube_r16, 0.0064F, -0.0306F, 0.2247F);
        cube_r16.setTextureOffset(34, 52).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r17 = new ModelRenderer(this);
        cube_r17.setRotationPoint(-0.91F, 2.8348F, -0.8941F);
        body.addChild(cube_r17);
        setRotationAngle(cube_r17, -0.3397F, -0.3092F, -3.0263F);
        cube_r17.setTextureOffset(22, 46).addBox(-0.0905F, -1.5F, -2.013F, 3.0F, 3.0F, 3.0F, 0.0F, false);

        cube_r18 = new ModelRenderer(this);
        cube_r18.setRotationPoint(-0.91F, 2.8348F, -0.8941F);
        body.addChild(cube_r18);
        setRotationAngle(cube_r18, -0.3572F, 0.4333F, 2.9943F);
        cube_r18.setTextureOffset(0, 44).addBox(-2.8595F, -1.5F, -2.1339F, 3.0F, 3.0F, 3.0F, 0.0F, false);

        cube_r19 = new ModelRenderer(this);
        cube_r19.setRotationPoint(-0.9403F, 6.1436F, 1.7419F);
        body.addChild(cube_r19);
        setRotationAngle(cube_r19, 0.0873F, 0.0F, 0.0F);
        cube_r19.setTextureOffset(36, 12).addBox(-2.0F, -3.5F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

        cube_r20 = new ModelRenderer(this);
        cube_r20.setRotationPoint(2.0597F, 1.1332F, 3.2215F);
        body.addChild(cube_r20);
        setRotationAngle(cube_r20, -1.6144F, 0.0F, 0.0F);
        cube_r20.setTextureOffset(32, 32).addBox(-6.0F, -1.5F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);

        cube_r21 = new ModelRenderer(this);
        cube_r21.setRotationPoint(2.0597F, 1.1332F, 3.2215F);
        body.addChild(cube_r21);
        setRotationAngle(cube_r21, -3.0522F, -0.2173F, -0.0193F);
        cube_r21.setTextureOffset(20, 24).addBox(-6.0F, 0.5F, -3.0F, 6.0F, 2.0F, 4.0F, 0.0F, false);

        cube_r22 = new ModelRenderer(this);
        cube_r22.setRotationPoint(2.0597F, 1.1332F, 3.2215F);
        body.addChild(cube_r22);
        setRotationAngle(cube_r22, -1.4822F, 0.1739F, 0.0154F);
        cube_r22.setTextureOffset(27, 39).addBox(-3.0F, -1.5F, -3.0F, 3.0F, 3.0F, 4.0F, 0.0F, false);

        cube_r23 = new ModelRenderer(this);
        cube_r23.setRotationPoint(-0.9403F, 3.0675F, 0.8822F);
        body.addChild(cube_r23);
        setRotationAngle(cube_r23, 0.3927F, 0.0F, 0.0F);
        cube_r23.setTextureOffset(0, 0).addBox(-4.0F, -3.5F, -1.5F, 8.0F, 4.0F, 5.0F, 0.0F, false);
        cube_r23.setTextureOffset(0, 37).addBox(-2.0F, -5.5F, -2.5F, 4.0F, 4.0F, 3.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(0.005F, 12.2528F, -3.0087F);
        head.setTextureOffset(41, 39).addBox(-2.005F, -1.2528F, -2.9913F, 4.0F, 4.0F, 3.0F, 0.0F, false);

        cube_r24 = new ModelRenderer(this);
        cube_r24.setRotationPoint(-0.005F, 3.2472F, -3.4913F);
        head.addChild(cube_r24);
        setRotationAngle(cube_r24, 0.3491F, 0.0F, 0.0F);
        cube_r24.setTextureOffset(11, 37).addBox(-1.0F, -0.5F, 0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r25 = new ModelRenderer(this);
        cube_r25.setRotationPoint(-0.005F, 0.7472F, -3.9913F);
        head.addChild(cube_r25);
        setRotationAngle(cube_r25, -0.3927F, 0.0F, 0.0F);
        cube_r25.setTextureOffset(27, 52).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);

        cube_r26 = new ModelRenderer(this);
        cube_r26.setRotationPoint(-0.005F, 0.7472F, -3.9913F);
        head.addChild(cube_r26);
        setRotationAngle(cube_r26, 0.1309F, 0.0F, 0.0F);
        cube_r26.setTextureOffset(52, 36).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);

        cube_r27 = new ModelRenderer(this);
        cube_r27.setRotationPoint(3.495F, -0.7528F, -1.4913F);
        head.addChild(cube_r27);
        setRotationAngle(cube_r27, 0.0542F, -0.4222F, 0.0631F);
        cube_r27.setTextureOffset(15, 22).addBox(-0.5F, -0.5F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r28 = new ModelRenderer(this);
        cube_r28.setRotationPoint(2.495F, 0.2472F, -1.4913F);
        head.addChild(cube_r28);
        setRotationAngle(cube_r28, 0.006F, -0.2482F, 0.0845F);
        cube_r28.setTextureOffset(0, 0).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        cube_r29 = new ModelRenderer(this);
        cube_r29.setRotationPoint(-3.505F, -0.7528F, -1.4913F);
        head.addChild(cube_r29);
        setRotationAngle(cube_r29, 0.0F, 0.48F, -0.0873F);
        cube_r29.setTextureOffset(21, 3).addBox(-0.5F, -0.5F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r30 = new ModelRenderer(this);
        cube_r30.setRotationPoint(-2.505F, 0.2472F, -1.4913F);
        head.addChild(cube_r30);
        setRotationAngle(cube_r30, 0.0F, 0.3054F, -0.0873F);
        cube_r30.setTextureOffset(0, 9).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        cube_r31 = new ModelRenderer(this);
        cube_r31.setRotationPoint(-0.005F, -1.4783F, -1.0989F);
        head.addChild(cube_r31);
        setRotationAngle(cube_r31, -0.9599F, 0.0F, 0.0F);
        cube_r31.setTextureOffset(11, 42).addBox(-2.0F, -1.0F, -1.5F, 4.0F, 2.0F, 3.0F, 0.0F, false);

        cube_r32 = new ModelRenderer(this);
        cube_r32.setRotationPoint(-0.005F, -0.7528F, -3.4913F);
        head.addChild(cube_r32);
        setRotationAngle(cube_r32, -0.6545F, 0.0F, 0.0F);
        cube_r32.setTextureOffset(36, 26).addBox(-2.0F, -2.5F, -0.5F, 4.0F, 2.0F, 4.0F, 0.0F, false);

        cube_r33 = new ModelRenderer(this);
        cube_r33.setRotationPoint(-0.005F, -0.2698F, -4.1622F);
        head.addChild(cube_r33);
        setRotationAngle(cube_r33, 0.5578F, -0.2324F, -0.1484F);
        cube_r33.setTextureOffset(54, 59).addBox(0.2056F, -0.4939F, -0.8401F, 2.0F, 1.0F, 2.0F, 0.0F, true);

        cube_r34 = new ModelRenderer(this);
        cube_r34.setRotationPoint(-1.122F, -0.5171F, -3.7494F);
        head.addChild(cube_r34);
        setRotationAngle(cube_r34, 0.5578F, 0.2324F, 0.1484F);
        cube_r34.setTextureOffset(54, 59).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

        cube_r35 = new ModelRenderer(this);
        cube_r35.setRotationPoint(-0.005F, -0.7528F, -3.4913F);
        head.addChild(cube_r35);
        setRotationAngle(cube_r35, -0.3491F, 0.0F, 0.0F);
        cube_r35.setTextureOffset(37, 20).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 2.0F, 4.0F, 0.0F, false);

        rightArm = new ModelRenderer(this);
        rightArm.setRotationPoint(-5.7669F, 12.1849F, -0.5165F);


        cube_r36 = new ModelRenderer(this);
        cube_r36.setRotationPoint(-0.3F, 5.9661F, -1.3391F);
        rightArm.addChild(cube_r36);
        setRotationAngle(cube_r36, 0.01F, -0.0536F, -1.6019F);
        cube_r36.setTextureOffset(32, 30).addBox(-5.5F, 0.0F, -1.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r36.setTextureOffset(55, 47).addBox(-5.5F, 1.0F, -1.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r37 = new ModelRenderer(this);
        cube_r37.setRotationPoint(-0.3F, 5.9661F, -1.3391F);
        rightArm.addChild(cube_r37);
        setRotationAngle(cube_r37, 0.01F, -0.1408F, -1.6028F);
        cube_r37.setTextureOffset(22, 42).addBox(-5.5F, -1.0F, -1.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r37.setTextureOffset(56, 32).addBox(-5.5F, -1.0F, -1.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r38 = new ModelRenderer(this);
        cube_r38.setRotationPoint(-0.3F, 5.9661F, -1.3391F);
        rightArm.addChild(cube_r38);
        setRotationAngle(cube_r38, 0.01F, -0.0972F, -1.6024F);
        cube_r38.setTextureOffset(28, 36).addBox(-5.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r38.setTextureOffset(42, 56).addBox(-5.5F, -1.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r39 = new ModelRenderer(this);
        cube_r39.setRotationPoint(-0.3F, 5.9661F, -1.3391F);
        rightArm.addChild(cube_r39);
        setRotationAngle(cube_r39, 0.01F, -0.0536F, -1.6019F);
        cube_r39.setTextureOffset(36, 19).addBox(-5.5F, -1.0F, 0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r40 = new ModelRenderer(this);
        cube_r40.setRotationPoint(-0.6837F, 10.0275F, -0.5597F);
        rightArm.addChild(cube_r40);
        setRotationAngle(cube_r40, -0.0337F, -0.0536F, -1.6019F);
        cube_r40.setTextureOffset(56, 52).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r41 = new ModelRenderer(this);
        cube_r41.setRotationPoint(-0.3F, 5.9661F, -1.3391F);
        rightArm.addChild(cube_r41);
        setRotationAngle(cube_r41, -0.1578F, -0.104F, -1.2185F);
        cube_r41.setTextureOffset(52, 14).addBox(-2.5F, -1.0F, -1.5F, 2.0F, 2.0F, 3.0F, 0.0F, false);

        cube_r42 = new ModelRenderer(this);
        cube_r42.setRotationPoint(-0.3F, 5.9661F, -1.3391F);
        rightArm.addChild(cube_r42);
        setRotationAngle(cube_r42, -0.1375F, -0.1298F, -1.3924F);
        cube_r42.setTextureOffset(17, 52).addBox(-3.5F, -1.0F, -1.5F, 2.0F, 2.0F, 3.0F, 0.0F, false);

        cube_r43 = new ModelRenderer(this);
        cube_r43.setRotationPoint(-0.3F, 5.9661F, -1.3391F);
        rightArm.addChild(cube_r43);
        setRotationAngle(cube_r43, -0.0618F, -0.1785F, -1.8757F);
        cube_r43.setTextureOffset(48, 9).addBox(-3.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);

        cube_r44 = new ModelRenderer(this);
        cube_r44.setRotationPoint(-0.3502F, 4.6189F, -0.5129F);
        rightArm.addChild(cube_r44);
        setRotationAngle(cube_r44, 0.0114F, 0.5136F, -1.5963F);
        cube_r44.setTextureOffset(55, 41).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        cube_r45 = new ModelRenderer(this);
        cube_r45.setRotationPoint(-0.3F, 5.9661F, -1.3391F);
        rightArm.addChild(cube_r45);
        setRotationAngle(cube_r45, 0.0102F, -0.2281F, -1.6042F);
        cube_r45.setTextureOffset(44, 32).addBox(-2.5F, -1.0F, -0.5F, 5.0F, 2.0F, 2.0F, 0.0F, false);

        cube_r46 = new ModelRenderer(this);
        cube_r46.setRotationPoint(-0.7331F, 0.3151F, 0.5165F);
        rightArm.addChild(cube_r46);
        setRotationAngle(cube_r46, -0.0313F, -0.2651F, -1.3922F);
        cube_r46.setTextureOffset(15, 36).addBox(-4.5F, -0.5F, -2.0F, 5.0F, 3.0F, 3.0F, 0.0F, false);

        leftArm = new ModelRenderer(this);
        leftArm.setRotationPoint(5.7669F, 12.1849F, -0.2665F);


        cube_r47 = new ModelRenderer(this);
        cube_r47.setRotationPoint(0.7331F, 0.3151F, 0.2665F);
        leftArm.addChild(cube_r47);
        setRotationAngle(cube_r47, -0.0313F, 0.2651F, 1.3922F);
        cube_r47.setTextureOffset(36, 3).addBox(-0.5F, -0.5F, -2.0F, 5.0F, 3.0F, 3.0F, 0.0F, false);

        cube_r48 = new ModelRenderer(this);
        cube_r48.setRotationPoint(0.3F, 5.9661F, -1.5891F);
        leftArm.addChild(cube_r48);
        setRotationAngle(cube_r48, 0.0102F, 0.2281F, 1.6042F);
        cube_r48.setTextureOffset(24, 12).addBox(-2.5F, -1.0F, -0.5F, 5.0F, 2.0F, 2.0F, 0.0F, false);

        cube_r49 = new ModelRenderer(this);
        cube_r49.setRotationPoint(0.3502F, 4.6189F, -0.7629F);
        leftArm.addChild(cube_r49);
        setRotationAngle(cube_r49, 0.0114F, -0.5136F, 1.5963F);
        cube_r49.setTextureOffset(0, 55).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        cube_r50 = new ModelRenderer(this);
        cube_r50.setRotationPoint(0.3F, 5.9661F, -1.5891F);
        leftArm.addChild(cube_r50);
        setRotationAngle(cube_r50, -0.0618F, 0.1785F, 1.8757F);
        cube_r50.setTextureOffset(9, 47).addBox(0.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);

        cube_r51 = new ModelRenderer(this);
        cube_r51.setRotationPoint(0.3F, 5.9661F, -1.5891F);
        leftArm.addChild(cube_r51);
        setRotationAngle(cube_r51, -0.1375F, 0.1298F, 1.3924F);
        cube_r51.setTextureOffset(7, 52).addBox(1.5F, -1.0F, -1.5F, 2.0F, 2.0F, 3.0F, 0.0F, false);

        cube_r52 = new ModelRenderer(this);
        cube_r52.setRotationPoint(0.3F, 5.9661F, -1.5891F);
        leftArm.addChild(cube_r52);
        setRotationAngle(cube_r52, -0.1578F, 0.104F, 1.2185F);
        cube_r52.setTextureOffset(0, 50).addBox(0.5F, -1.0F, -1.5F, 2.0F, 2.0F, 3.0F, 0.0F, false);

        cube_r53 = new ModelRenderer(this);
        cube_r53.setRotationPoint(0.6837F, 10.0275F, -0.8097F);
        leftArm.addChild(cube_r53);
        setRotationAngle(cube_r53, -0.0337F, 0.0536F, 1.6019F);
        cube_r53.setTextureOffset(55, 45).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r54 = new ModelRenderer(this);
        cube_r54.setRotationPoint(0.3F, 5.9661F, -1.5891F);
        leftArm.addChild(cube_r54);
        setRotationAngle(cube_r54, 0.01F, 0.0536F, 1.6019F);
        cube_r54.setTextureOffset(0, 30).addBox(4.5F, -1.0F, 0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r54.setTextureOffset(15, 24).addBox(2.5F, 1.0F, -1.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r54.setTextureOffset(0, 16).addBox(4.5F, 0.0F, -1.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r55 = new ModelRenderer(this);
        cube_r55.setRotationPoint(0.3F, 5.9661F, -1.5891F);
        leftArm.addChild(cube_r55);
        setRotationAngle(cube_r55, 0.01F, 0.0972F, 1.6024F);
        cube_r55.setTextureOffset(53, 24).addBox(2.5F, -1.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r55.setTextureOffset(0, 22).addBox(4.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r56 = new ModelRenderer(this);
        cube_r56.setRotationPoint(0.3F, 5.9661F, -1.5891F);
        leftArm.addChild(cube_r56);
        setRotationAngle(cube_r56, 0.01F, 0.1408F, 1.6028F);
        cube_r56.setTextureOffset(43, 0).addBox(2.5F, -1.0F, -1.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r56.setTextureOffset(20, 16).addBox(4.5F, -1.0F, -1.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        rightLeg = new ModelRenderer(this);
        rightLeg.setRotationPoint(-2.4796F, 18.7027F, 1.4355F);
        setRotationAngle(rightLeg, 0.0F, 0.1309F, 0.0F);


        cube_r57 = new ModelRenderer(this);
        cube_r57.setRotationPoint(-1.0181F, 4.8059F, -0.4046F);
        rightLeg.addChild(cube_r57);
        setRotationAngle(cube_r57, 0.0159F, 0.3061F, 0.0035F);
        cube_r57.setTextureOffset(48, 36).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        cube_r58 = new ModelRenderer(this);
        cube_r58.setRotationPoint(0.9819F, 4.8033F, -0.4059F);
        rightLeg.addChild(cube_r58);
        setRotationAngle(cube_r58, 0.0157F, -0.2611F, -0.0054F);
        cube_r58.setTextureOffset(43, 46).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        cube_r59 = new ModelRenderer(this);
        cube_r59.setRotationPoint(-0.0204F, 2.7973F, 0.0645F);
        rightLeg.addChild(cube_r59);
        setRotationAngle(cube_r59, 0.0151F, 0.0007F, -0.0013F);
        cube_r59.setTextureOffset(34, 54).addBox(-0.5F, 1.5F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
        cube_r59.setTextureOffset(49, 19).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 3.0F, 2.0F, 0.0F, false);

        cube_r60 = new ModelRenderer(this);
        cube_r60.setRotationPoint(-0.0204F, 2.7973F, 0.0645F);
        rightLeg.addChild(cube_r60);
        setRotationAngle(cube_r60, -0.0718F, -0.0004F, 0.0935F);
        cube_r60.setTextureOffset(46, 46).addBox(-1.5F, -2.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

        leftLeg = new ModelRenderer(this);
        leftLeg.setRotationPoint(2.4796F, 18.7027F, 1.4355F);


        cube_r61 = new ModelRenderer(this);
        cube_r61.setRotationPoint(1.0181F, 4.8059F, -0.4046F);
        leftLeg.addChild(cube_r61);
        setRotationAngle(cube_r61, 0.0159F, -0.3061F, -0.0035F);
        cube_r61.setTextureOffset(37, 39).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        cube_r62 = new ModelRenderer(this);
        cube_r62.setRotationPoint(-0.9819F, 4.8033F, -0.4059F);
        leftLeg.addChild(cube_r62);
        setRotationAngle(cube_r62, 0.0157F, 0.2611F, 0.0054F);
        cube_r62.setTextureOffset(31, 46).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        cube_r63 = new ModelRenderer(this);
        cube_r63.setRotationPoint(0.0204F, 2.7973F, 0.0645F);
        leftLeg.addChild(cube_r63);
        setRotationAngle(cube_r63, 0.0151F, -0.0007F, 0.0013F);
        cube_r63.setTextureOffset(14, 30).addBox(-0.5F, 1.5F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
        cube_r63.setTextureOffset(49, 0).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 3.0F, 2.0F, 0.0F, false);

        cube_r64 = new ModelRenderer(this);
        cube_r64.setRotationPoint(0.0204F, 2.7973F, 0.0645F);
        leftLeg.addChild(cube_r64);
        setRotationAngle(cube_r64, -0.0718F, 0.0004F, -0.0935F);
        cube_r64.setTextureOffset(34, 46).addBox(-1.5F, -2.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
    }

        public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
            //previously the render function, render code was moved to a method below
        }

        public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
            body.render(matrixStack, buffer, packedLight, packedOverlay);
            head.render(matrixStack, buffer, packedLight, packedOverlay);
            rightArm.render(matrixStack, buffer, packedLight, packedOverlay);
            leftArm.render(matrixStack, buffer, packedLight, packedOverlay);
            rightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
            leftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
        }

        @Override
        public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount,
                                      float ageInTicks, float netheadYaw, float headPitch) {
            this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
            this.head.rotateAngleY = netheadYaw * ((float)Math.PI / 180F);
            this.rightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
            this.leftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        }

        @Override
        public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight,
                           int packedOverlay, float red, float green, float blue, float alpha) {
            head.render(matrixStack, buffer, packedLight, packedOverlay);
            body.render(matrixStack, buffer, packedLight, packedOverlay);
            rightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
            rightArm.render(matrixStack, buffer, packedLight, packedOverlay);
            leftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
            leftArm.render(matrixStack, buffer, packedLight, packedOverlay);
        }

        public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
            modelRenderer.rotateAngleX = x;
            modelRenderer.rotateAngleY = y;
            modelRenderer.rotateAngleZ = z;
        }
    }