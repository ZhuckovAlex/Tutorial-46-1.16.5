package net.project.project.entity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.project.project.Project;
import net.project.project.entity.custom.ModFirewoodBoatEntity;

public class ModFirewoodEntityTypes {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES
            = DeferredRegister.create(ForgeRegistries.ENTITIES, Project.MOD_ID);

    public static final RegistryObject<EntityType<ModFirewoodBoatEntity>> FIREWOOD_BOAT =
            ENTITY_TYPES.register("firewood_boat",
                    () -> EntityType.Builder.<ModFirewoodBoatEntity>create(ModFirewoodBoatEntity::new,
                                    EntityClassification.MISC).size(0.5f, 0.5f)
                            .build(new ResourceLocation(Project.MOD_ID, "firewood_boat").toString()));
    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
