package net.project.project.world.dimension;

import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.project.project.Project;

public class ModDimensions {
    public static RegistryKey<World> RDim = RegistryKey.getOrCreateKey(Registry.WORLD_KEY,
            new ResourceLocation(Project.MOD_ID, "rdim"));
}