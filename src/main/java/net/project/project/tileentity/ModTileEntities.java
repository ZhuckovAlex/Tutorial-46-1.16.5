package net.project.project.tileentity;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.project.project.Project;
import net.project.project.block.ModBlocks;

public class ModTileEntities {

    public static DeferredRegister<TileEntityType<?>> TILE_ENTITIES =
            DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, Project.MOD_ID);

    public static RegistryObject<TileEntityType<VerstakTile>> VERSTAK_TILE =
            TILE_ENTITIES.register("verstak_tile", () -> TileEntityType.Builder.create(
                    VerstakTile::new, ModBlocks.VERSTAK.get()).build(null));

    public static final RegistryObject<TileEntityType<ModSignTileEntity>> SIGN_TILE_ENTITIES =
            TILE_ENTITIES.register("sign", () -> TileEntityType.Builder.create(ModSignTileEntity::new,
                    ModBlocks.FIREWOOD_SIGN.get(),
                    ModBlocks.FIREWOOD_WALL_SIGN.get()
            ).build(null));

    public static void register(IEventBus eventBus) {
        TILE_ENTITIES.register(eventBus);
    }
}