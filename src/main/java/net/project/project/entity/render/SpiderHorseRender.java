package net.project.project.entity.render;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.SpiderModel;
import net.minecraft.util.ResourceLocation;
import net.project.project.Project;
import net.project.project.entity.custom.SpiderHorse;
import net.project.project.entity.model.SpiderHorseModel;

public class SpiderHorseRender extends MobRenderer<SpiderHorse, SpiderModel<SpiderHorse>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(Project.MOD_ID, "textures/entity/spider_horse.png");

    public SpiderHorseRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new SpiderHorseModel(), 0.7F);
    }

    @Override
    public ResourceLocation getEntityTexture(SpiderHorse entity) {
        return TEXTURE;
    }
}
