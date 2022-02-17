package net.project.project.block;

import net.minecraft.block.WoodType;
import net.minecraft.util.ResourceLocation;
import net.project.project.Project;

public class ModWoodTypes {

    public static final WoodType FIREWOOD =
            WoodType.create(new ResourceLocation(Project.MOD_ID, "firewood").toString());
}
