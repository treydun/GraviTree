package com.buildatnight.utils;

import org.bukkit.Material;

import java.util.EnumSet;

public class Untagged {
    public static final EnumSet<Material> BEDS;
    public static final EnumSet<Material> SPAWN_EGGS;
    public static final EnumSet<Material> CROPS;
    public static final EnumSet<Material> FENCES;
    public static final EnumSet<Material> GLASS_PANES;
    public static final EnumSet<Material> GATES;
    public static final EnumSet<Material> HEADS;
    public static final EnumSet<Material> TERRACOTTA;

    static {
        TERRACOTTA = EnumSet.of(Material.TERRACOTTA,
                Material.BLACK_TERRACOTTA,
                Material.BLUE_TERRACOTTA,
                Material.BROWN_TERRACOTTA,
                Material.CYAN_TERRACOTTA,
                Material.GRAY_TERRACOTTA,
                Material.GREEN_TERRACOTTA,
                Material.LIGHT_BLUE_TERRACOTTA,
                Material.LIGHT_GRAY_TERRACOTTA,
                Material.LIME_TERRACOTTA,
                Material.MAGENTA_TERRACOTTA,
                Material.ORANGE_TERRACOTTA,
                Material.PINK_TERRACOTTA,
                Material.PURPLE_TERRACOTTA,
                Material.RED_TERRACOTTA,
                Material.WHITE_TERRACOTTA,
                Material.YELLOW_TERRACOTTA);

        HEADS = EnumSet.of(Material.PLAYER_HEAD,
                Material.PLAYER_WALL_HEAD,
                Material.ZOMBIE_HEAD,
                Material.ZOMBIE_WALL_HEAD,
                Material.CREEPER_HEAD,
                Material.CREEPER_WALL_HEAD,
                Material.DRAGON_HEAD,
                Material.DRAGON_WALL_HEAD,
                Material.SKELETON_SKULL,
                Material.SKELETON_WALL_SKULL,
                Material.WITHER_SKELETON_SKULL,
                Material.WITHER_SKELETON_WALL_SKULL);

        GATES = EnumSet.of(Material.ACACIA_FENCE_GATE,
                Material.BIRCH_FENCE_GATE,
                Material.DARK_OAK_FENCE_GATE,
                Material.JUNGLE_FENCE_GATE,
                Material.OAK_FENCE_GATE,
                Material.SPRUCE_FENCE_GATE);

        GLASS_PANES = EnumSet.of(Material.GLASS_PANE,
                Material.BLACK_STAINED_GLASS_PANE,
                Material.BLUE_STAINED_GLASS_PANE,
                Material.BROWN_STAINED_GLASS_PANE,
                Material.CYAN_STAINED_GLASS_PANE,
                Material.GRAY_STAINED_GLASS_PANE,
                Material.GREEN_STAINED_GLASS_PANE,
                Material.LIGHT_BLUE_STAINED_GLASS_PANE,
                Material.LIGHT_GRAY_STAINED_GLASS_PANE,
                Material.LIME_STAINED_GLASS_PANE,
                Material.MAGENTA_STAINED_GLASS_PANE,
                Material.ORANGE_STAINED_GLASS_PANE,
                Material.PINK_STAINED_GLASS_PANE,
                Material.PURPLE_STAINED_GLASS_PANE,
                Material.RED_STAINED_GLASS_PANE,
                Material.WHITE_STAINED_GLASS_PANE,
                Material.YELLOW_STAINED_GLASS_PANE);

        FENCES = EnumSet.of(Material.ACACIA_FENCE,
                Material.BIRCH_FENCE,
                Material.DARK_OAK_FENCE,
                Material.JUNGLE_FENCE,
                Material.OAK_FENCE,
                Material.SPRUCE_FENCE,
                Material.NETHER_BRICK_FENCE);

        CROPS = EnumSet.of(Material.WHEAT,
                Material.CARROTS,
                Material.POTATOES,
                Material.BEETROOTS,
                Material.NETHER_WART_BLOCK);

        BEDS = EnumSet.of(Material.BLACK_BED,
                Material.BLUE_BED,
                Material.BROWN_BED,
                Material.CYAN_BED,
                Material.GRAY_BED,
                Material.GREEN_BED,
                Material.LIGHT_BLUE_BED,
                Material.LIGHT_GRAY_BED,
                Material.LIME_BED,
                Material.MAGENTA_BED,
                Material.ORANGE_BED,
                Material.PINK_BED,
                Material.PURPLE_BED,
                Material.RED_BED,
                Material.WHITE_BED,
                Material.YELLOW_BED);

        SPAWN_EGGS = EnumSet.of(Material.BAT_SPAWN_EGG,
                Material.BLAZE_SPAWN_EGG,
                Material.CAVE_SPIDER_SPAWN_EGG,
                Material.CHICKEN_SPAWN_EGG,
                Material.COD_SPAWN_EGG,
                Material.COW_SPAWN_EGG,
                Material.CREEPER_SPAWN_EGG,
                Material.DOLPHIN_SPAWN_EGG,
                Material.DONKEY_SPAWN_EGG,
                Material.DROWNED_SPAWN_EGG,
                Material.ELDER_GUARDIAN_SPAWN_EGG,
                Material.ENDERMAN_SPAWN_EGG,
                Material.ENDERMITE_SPAWN_EGG,
                Material.EVOKER_SPAWN_EGG,
                Material.GHAST_SPAWN_EGG,
                Material.GUARDIAN_SPAWN_EGG,
                Material.HORSE_SPAWN_EGG,
                Material.HUSK_SPAWN_EGG,
                Material.LLAMA_SPAWN_EGG,
                Material.MAGMA_CUBE_SPAWN_EGG,
                Material.MOOSHROOM_SPAWN_EGG,
                Material.MULE_SPAWN_EGG,
                Material.OCELOT_SPAWN_EGG,
                Material.PARROT_SPAWN_EGG,
                Material.PHANTOM_SPAWN_EGG,
                Material.PIG_SPAWN_EGG,
                Material.POLAR_BEAR_SPAWN_EGG,
                Material.PUFFERFISH_SPAWN_EGG,
                Material.RABBIT_SPAWN_EGG,
                Material.SALMON_SPAWN_EGG,
                Material.SHEEP_SPAWN_EGG,
                Material.SHULKER_SPAWN_EGG,
                Material.SILVERFISH_SPAWN_EGG,
                Material.SKELETON_SPAWN_EGG,
                Material.SKELETON_HORSE_SPAWN_EGG,
                Material.SLIME_SPAWN_EGG,
                Material.SPIDER_SPAWN_EGG,
                Material.SQUID_SPAWN_EGG,
                Material.STRAY_SPAWN_EGG,
                Material.TROPICAL_FISH_SPAWN_EGG,
                Material.TURTLE_SPAWN_EGG,
                Material.VEX_SPAWN_EGG,
                Material.VILLAGER_SPAWN_EGG,
                Material.VINDICATOR_SPAWN_EGG,
                Material.WITCH_SPAWN_EGG,
                Material.WITHER_SKELETON_SPAWN_EGG,
                Material.WOLF_SPAWN_EGG,
                Material.ZOMBIE_SPAWN_EGG,
                Material.ZOMBIE_HORSE_SPAWN_EGG,
                Material.ZOMBIE_PIGMAN_SPAWN_EGG,
                Material.ZOMBIE_VILLAGER_SPAWN_EGG);
    }

}
