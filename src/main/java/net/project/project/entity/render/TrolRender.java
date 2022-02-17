package net.project.project.entity.render;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.project.project.Project;
import net.project.project.entity.custom.TrolEntity;
import net.project.project.entity.model.TrolModel;

public class TrolRender extends MobRenderer<TrolEntity, TrolModel<TrolEntity>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(Project.MOD_ID, "textures/entity/trol.png");

    public TrolRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new TrolModel<>(), 1F);
    }

    @Override
    public ResourceLocation getEntityTexture(TrolEntity entity) {
        return TEXTURE;
    }
}