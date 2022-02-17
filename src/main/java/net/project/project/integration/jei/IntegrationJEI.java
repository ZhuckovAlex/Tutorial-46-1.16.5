package net.project.project.integration.jei;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.item.crafting.RecipeManager;
import net.minecraft.util.ResourceLocation;
import net.project.project.Project;
import net.project.project.data.recipes.ModRecipeTypes;
import net.project.project.data.recipes.VerstakRecipe;

import java.util.Objects;
import java.util.stream.Collectors;

@JeiPlugin
public class IntegrationJEI implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(Project.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(
                new VerstakRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().world).getRecipeManager();
        registration.addRecipes(rm.getRecipesForType(ModRecipeTypes.VERSTAK_RECIPE).stream()
                        .filter(r -> r instanceof VerstakRecipe).collect(Collectors.toList()),
                VerstakRecipeCategory.UID);
    }
}