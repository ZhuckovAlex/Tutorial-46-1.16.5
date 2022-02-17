package net.project.project.procedure;

import net.minecraft.block.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.network.play.NetworkPlayerInfo;
import net.minecraft.entity.*;
import net.minecraft.entity.passive.MooshroomEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.GameType;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.project.project.Project;

import java.util.HashMap;
import java.util.Map;

public class SpawnCowMuchroom {

    @Mod.EventBusSubscriber
    private static class GlobalTrigger {
        @SubscribeEvent
        public static void onBlockBreak(BlockEvent.BreakEvent event) {
            Entity entity = event.getPlayer();
            IWorld world = event.getWorld();
            Map<String, Object> dependencies = new HashMap<>();
            dependencies.put("xpAmount", event.getExpToDrop());
            dependencies.put("x", event.getPos().getX());
            dependencies.put("y", event.getPos().getY());
            dependencies.put("z", event.getPos().getZ());
            dependencies.put("px", entity.getPosX());
            dependencies.put("py", entity.getPosY());
            dependencies.put("pz", entity.getPosZ());
            dependencies.put("world", world);
            dependencies.put("entity", entity);
            dependencies.put("blockstate", event.getState());
            dependencies.put("event", event);
            executeProcedure(dependencies);
        }
    }
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            if (!dependencies.containsKey("entity"))
                Project.LOGGER.warn("Failed to load dependency entity for procedure Cow!");
            return;
        }
        if (dependencies.get("x") == null) {
            if (!dependencies.containsKey("x"))
                Project.LOGGER.warn("Failed to load dependency x for procedure Cow!");
            return;
        }
        if (dependencies.get("y") == null) {
            if (!dependencies.containsKey("y"))
                Project.LOGGER.warn("Failed to load dependency y for procedure Cow!");
            return;
        }
        if (dependencies.get("z") == null) {
            if (!dependencies.containsKey("z"))
                Project.LOGGER.warn("Failed to load dependency z for procedure Cow!");
            return;
        }
        if (dependencies.get("world") == null) {
            if (!dependencies.containsKey("world"))
                Project.LOGGER.warn("Failed to load dependency world for procedure Cow!");
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
        double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
        double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
        IWorld world = (IWorld) dependencies.get("world");
        double randomChance = 0;
        if ((!(world.isRemote()))) {
            if ((!(new Object() {
                public boolean checkGamemode(Entity _ent) {
                    if (_ent instanceof ServerPlayerEntity) {
                        return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.CREATIVE;
                    } else if (_ent instanceof PlayerEntity && _ent.world.isRemote()) {
                        NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
                                .getPlayerInfo(((AbstractClientPlayerEntity) _ent).getGameProfile().getId());
                        return _npi != null && _npi.getGameType() == GameType.CREATIVE;
                    }
                    return false;
                }
            }.checkGamemode(entity)))) {
                if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.BROWN_MUSHROOM_BLOCK)
                        || (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.RED_MUSHROOM_BLOCK)
                        || ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.MUSHROOM_STEM)))) {
                    randomChance = (double) Math.random();
                    if ((randomChance <= 0.15)) {
                        if (world instanceof ServerWorld) {
                            ((ServerWorld) world).spawnParticle(ParticleTypes.ANGRY_VILLAGER, x, y, z, (int) 10, 1, 1, 1, 5);
                        }
                        if (world instanceof ServerWorld) {
                            Entity entityToSpawn = new MooshroomEntity(EntityType.MOOSHROOM, (World) world);
                            entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
                            if (entityToSpawn instanceof MobEntity)
                                ((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
                                        world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
                                        (ILivingEntityData) null, (CompoundNBT) null);
                            world.addEntity(entityToSpawn);
                        }
                    }
                }
            }
        }
    }


}
