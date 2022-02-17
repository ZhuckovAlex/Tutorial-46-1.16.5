package net.project.project.paintings;

import net.minecraft.entity.item.PaintingType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.project.project.Project;

public class ModPaintings {
    public static final DeferredRegister<PaintingType> PAINTING_TYPES =
            DeferredRegister.create(ForgeRegistries.PAINTING_TYPES, Project.MOD_ID);

    public static final RegistryObject<PaintingType> VOLCANO =
            PAINTING_TYPES.register("volcano", () -> new PaintingType(32, 32));
    public static final RegistryObject<PaintingType> DRAGON =
            PAINTING_TYPES.register("dragon", () -> new PaintingType(32, 16));
    public static final RegistryObject<PaintingType> STARS =
            PAINTING_TYPES.register("stars", () -> new PaintingType(64, 64));
    public static final RegistryObject<PaintingType> SERVAL =
            PAINTING_TYPES.register("serval", () -> new PaintingType(16, 16));



    public static void register(IEventBus eventBus) {
        PAINTING_TYPES.register(eventBus);
    }
}
