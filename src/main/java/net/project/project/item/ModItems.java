package net.project.project.item;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.project.project.Project;
import net.project.project.block.ModBlocks;
import net.project.project.entity.ModEntityTypes;
import net.project.project.fluid.ModFluids;
import net.project.project.item.custom.MagicSword;
import net.project.project.item.custom.ModFirewoodBoatItem;
import net.project.project.item.custom.ModSpawnEggItem;
import net.project.project.util.ModSoundEvents;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Project.MOD_ID);

    public static final RegistryObject<Item> TUTORIAL_ITEM = ITEMS.register("tutorial_item",
            () -> new Item(new Item.Properties().food(new Food.Builder().hunger(20).saturation(20).build()).group(ModItemGroup.CARROT)));
    public static final RegistryObject<Item> FIREWOOD_SAPLING = ITEMS.register("firewood_sapling",
            () -> new BlockItem(ModBlocks.FIREWOOD_SAPLING.get(), new Item.Properties()
                    .group(ModItemGroup.IRON_BLOCK)));
    public static final RegistryObject<Item> FIREWOOD_LEAVES = ITEMS.register("firewood_leaves",
            () -> new BlockItem(ModBlocks.FIREWOOD_LEAVES.get(), new Item.Properties()
                    .group(ModItemGroup.IRON_BLOCK)));
    public static final RegistryObject<Item> TEST_SWORD = ITEMS.register("test_sword",
            () -> new MagicSword(ModItemTier.TEST, 15,1, new Item.Properties().group(ModItemGroup.CARROT)));
    public static final RegistryObject<Item> TEST_AXE = ITEMS.register("test_axe",
            () -> new AxeItem(ModItemTier.TEST, 20,0.5f, new Item.Properties().group(ModItemGroup.CARROT)));
    public static final RegistryObject<Item> TEST_PICKAXE = ITEMS.register("test_pickaxe",
            () -> new PickaxeItem(ModItemTier.TEST, 5,1, new Item.Properties().group(ModItemGroup.CARROT)));
    public static final RegistryObject<Item> TEST_SHOVEL = ITEMS.register("test_shovel",
            () -> new ShovelItem(ModItemTier.TEST, 5,1, new Item.Properties().group(ModItemGroup.CARROT)));
    public static final RegistryObject<Item> ACONITE = ITEMS.register("aconite",
            () -> new BlockItem(ModBlocks.ACONITE.get(), new Item.Properties()
                    .group(ModItemGroup.CARROT)));
    public static final RegistryObject<Item> TEST_HOE = ITEMS.register("test_hoe",
            () -> new HoeItem(ModItemTier.TEST, 0,1, new Item.Properties().group(ModItemGroup.CARROT)));
    public static final RegistryObject<Item> SPIDER_HORSE_SPAWN_EGG = ITEMS.register("spider_horse_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.SPIDER_HORSE,0x464F56,0x1D6336,
        new Item.Properties().group(ModItemGroup.CARROT)));
    public static final RegistryObject<Item> TROL_SPAWN_EGG = ITEMS.register("trol_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.TROL,0x0011ff,0xffffff,
                    new Item.Properties().group(ModItemGroup.CARROT)));
    public static final RegistryObject<Item> FIREWOOD_SIGN = ITEMS.register("firewood_sign",
            () -> new SignItem(new Item.Properties().maxStackSize(16).group(ModItemGroup.CARROT),
                    ModBlocks.FIREWOOD_SIGN.get(), ModBlocks.FIREWOOD_WALL_SIGN.get()));
    public static final RegistryObject<Item> TUTORIAL_BOOTS = ITEMS.register("tutorial_boots",
            () -> new ArmorItem(ModArmorMaterial.TUTORIAL, EquipmentSlotType.FEET,
                    new Item.Properties().group(ModItemGroup.CARROT)));
    public static final RegistryObject<Item> TUTORIAL_LEGGINGS = ITEMS.register("tutorial_leggings",
            () -> new ArmorItem(ModArmorMaterial.TUTORIAL, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ModItemGroup.CARROT)));
    public static final RegistryObject<Item> TUTORIAL_CHESTPLATE = ITEMS.register("tutorial_chestplate",
            () -> new ArmorItem(ModArmorMaterial.TUTORIAL, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ModItemGroup.CARROT)));
    public static final RegistryObject<Item> TUTORIAL_HELMET = ITEMS.register("tutorial_helmet",
            () -> new ArmorItem(ModArmorMaterial.TUTORIAL, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ModItemGroup.CARROT)));
    public static final RegistryObject<Item> FIREWOOD_BOAT = ITEMS.register("firewood_boat",
            () -> new ModFirewoodBoatItem(new Item.Properties().maxStackSize(1).group(ModItemGroup.CARROT),"firewood"));
    public static final RegistryObject<Item> FIREDROP = ITEMS.register("firedrop",
            () -> new BlockItem(ModBlocks.FIREDROP.get(), new Item.Properties()
                    .group(ModItemGroup.CARROT)));
    public static final RegistryObject<Item> SKY_BOW = ITEMS.register("sky_bow",
            () -> new BowItem(new Item.Properties().group(ModItemGroup.CARROT).maxStackSize(1)));
    public static final RegistryObject<Item> RUBY_HORSE_ARMOR = ITEMS.register("ruby_horse_armor",
            () -> new HorseArmorItem(9, "ruby",
                    new Item.Properties().group(ModItemGroup.CARROT)));


    public static final RegistryObject<Item> ILLUSION_RUBY = ITEMS.register("illusion_ruby",
            () -> new DamageItem(new Item.Properties().maxStackSize(1).maxDamage(3).group(ModItemGroup.CARROT)));


    public static final RegistryObject<Item> WHAT_U_NEED_MUSIC_DISC = ITEMS.register("what_u_need_music_disc",
            () -> new MusicDiscItem(1,() -> ModSoundEvents.WHAT_U_NEED.get(), new Item.Properties().maxStackSize(1).group(ModItemGroup.CARROT)));
    public static final RegistryObject<Item> OIL_BUCKET = ITEMS.register("oil_bucket",
            () -> new BucketItem(() -> ModFluids.OIL_FLUID.get(),
                    new Item.Properties().maxStackSize(1).group(ModItemGroup.CARROT)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
