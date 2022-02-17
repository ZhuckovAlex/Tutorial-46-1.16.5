package net.project.project.data.recipes;

import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.project.project.Project;

public class ModRecipeTypes {

    public static final DeferredRegister<IRecipeSerializer<?>> RECIPE_SERIALIZER =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Project.MOD_ID);

    public static final RegistryObject<VerstakRecipe.Serializer> VERSTAK_SERIALIZER
            = RECIPE_SERIALIZER.register("verstak", VerstakRecipe.Serializer::new);

    public static IRecipeType<VerstakRecipe> VERSTAK_RECIPE
            = new VerstakRecipe.VerstakRecipeType();


    public static void register(IEventBus eventBus) {
        RECIPE_SERIALIZER.register(eventBus);

        Registry.register(Registry.RECIPE_TYPE, VerstakRecipe.TYPE_ID, VERSTAK_RECIPE);
    }

}
