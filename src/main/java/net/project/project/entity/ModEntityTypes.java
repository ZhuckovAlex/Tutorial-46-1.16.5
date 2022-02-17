package net.project.project.entity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.project.project.Project;
import net.project.project.entity.custom.SpiderHorse;
import net.project.project.entity.custom.TrolEntity;

public class ModEntityTypes
{
   public static DeferredRegister<EntityType<?>> ENTITY_TYPES
           = DeferredRegister.create(ForgeRegistries.ENTITIES, Project.MOD_ID);

   public static final RegistryObject<EntityType<SpiderHorse>> SPIDER_HORSE =
           ENTITY_TYPES.register("spider_horse",()-> EntityType.Builder.create(SpiderHorse::new,
                   EntityClassification.AMBIENT).size(3f,3f)
                   .build(new ResourceLocation(Project.MOD_ID, "spider_horse").toString()));

    public static final RegistryObject<EntityType<TrolEntity>> TROL =
            ENTITY_TYPES.register("trol",
                    () -> EntityType.Builder.create(TrolEntity::new,
                                    EntityClassification.MONSTER).size(1f, 1f)
                            .build(new ResourceLocation(Project.MOD_ID, "trol").toString()));




   public static void register(IEventBus eventBus){
       ENTITY_TYPES.register(eventBus);
   }
}
