package net.project.project.integration.jei;

import com.mojang.blaze3d.matrix.MatrixStack;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.drawable.IDrawableStatic;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.project.project.Project;
import net.project.project.block.ModBlocks;
import net.project.project.data.recipes.VerstakRecipe;

public class VerstakRecipeCategory implements IRecipeCategory<VerstakRecipe> {
    public final static ResourceLocation UID = new ResourceLocation(Project.MOD_ID, "verstak");
    public final static ResourceLocation TEXTURE =
            new ResourceLocation(Project.MOD_ID, "textures/gui/verstak_gui.png");

    private final IDrawable background;
    private final IDrawable icon;
    private final IDrawableStatic lightningBolt;

    public VerstakRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(new ItemStack(ModBlocks.VERSTAK.get()));
        this.lightningBolt = helper.createDrawable(TEXTURE, 176, 0, 13, 17);
    }

    @Override
    public ResourceLocation getUid() {
        return UID;
    }

    @Override
    public Class<? extends VerstakRecipe> getRecipeClass() {
        return VerstakRecipe.class;
    }

    @Override
    public String getTitle() {
        return ModBlocks.VERSTAK.get().getTranslatedName().getString();
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setIngredients(VerstakRecipe recipe, IIngredients ingredients) {
        ingredients.setInputIngredients(recipe.getIngredients());
        ingredients.setOutput(VanillaTypes.ITEM, recipe.getRecipeOutput());
    }

    @Override
    public void setRecipe(IRecipeLayout recipeLayout, VerstakRecipe recipe, IIngredients ingredients) {
        recipeLayout.getItemStacks().init(0, true, 79, 30);
        recipeLayout.getItemStacks().init(1, true, 79, 52);

        recipeLayout.getItemStacks().init(2, false, 102, 42);
        recipeLayout.getItemStacks().set(ingredients);
    }

    @Override
    public void draw(VerstakRecipe recipe, MatrixStack matrixStack, double mouseX, double mouseY) {
        if(recipe.getWeather() == VerstakRecipe.Weather.THUNDERING) {
            this.lightningBolt.draw(matrixStack, 82, 9);
        }
    }
}