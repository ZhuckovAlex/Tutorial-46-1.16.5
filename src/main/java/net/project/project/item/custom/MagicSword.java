package net.project.project.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.SlotTypePreset;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

import java.util.Objects;

public class MagicSword extends SwordItem implements ICurioItem {

    public MagicSword(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builderIn) {
        super(tier, attackDamageIn, attackSpeedIn, builderIn);
    }
    @Override
    public void curioTick(String identifier, int index, LivingEntity livingEntity, ItemStack stack) {
        PlayerEntity player = (PlayerEntity) livingEntity;

        if(!player.world.isRemote()) {
            boolean hasPlayerFireResistance =
                    !Objects.equals(player.getActivePotionEffect(Effects.REGENERATION), null);

            if(!hasPlayerFireResistance) {
                player.addPotionEffect(new EffectInstance(Effects.REGENERATION, 50000));

                if(random.nextFloat() > 0.6f) {
                    stack.damageItem(1, player, p -> CuriosApi.getCuriosHelper().onBrokenCurio(
                            SlotTypePreset.BRACELET.getIdentifier(), index, p));
                }
            }
        }

        ICurioItem.super.curioTick(identifier, index, livingEntity, stack);
    }
    @Override
    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        // Here we can add effects on hit with this weapon to the target
        attacker.addPotionEffect(new EffectInstance(Effects.HERO_OF_THE_VILLAGE, 6000));
        target.addPotionEffect(new EffectInstance(Effects.INVISIBILITY, 2000, 1));
        target.addPotionEffect(new EffectInstance(Effects.POISON, 2000, 2));
        return super.hitEntity(stack, target, attacker);
    }
}