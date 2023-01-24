package BrassAmber.com.brass_geodes.config;

import net.minecraftforge.common.ForgeConfigSpec;

public final class BrassGeodesConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    /*public static final ForgeConfigSpec.ConfigValue<Integer> baseGeodeChance;
    public static final ForgeConfigSpec.ConfigValue<Integer> amethystGeodeChance;
    public static final ForgeConfigSpec.ConfigValue<Integer> topazGeodeChance;
    public static final ForgeConfigSpec.ConfigValue<Integer> sapphireGeodeChance;
    public static final ForgeConfigSpec.ConfigValue<Integer> rubyGeodeChance;
    public static final ForgeConfigSpec.ConfigValue<Integer> emeraldGeodeChance;
    public static final ForgeConfigSpec.ConfigValue<Integer> diamondGeodeChance;

    public static final ForgeConfigSpec.ConfigValue<Boolean> removeEmeraldOre;
    public static final ForgeConfigSpec.ConfigValue<Boolean> removeDiamondOre;*/


    static {
        BUILDER.push("Config for Brass Geodes Mod!");
        /*baseGeodeChance = BUILDER.comment(" All geode spawn chance options should be viewed as each chunk of the game having a 1/'base + geode_chance' to spawn.",
                " I.E Amethyst Geodes in this mod have a chance of 1/48 chunks. 24 base + 24 Geode chance", " ---Geode Rarity---",
                " This is the base geode spawn chance (what vanilla Amethyst is set to)",
                " All other geode chances are added on top of this").define("Base Geode Chance", 24);


        amethystGeodeChance = BUILDER.comment("#").define("Amethyst Geode Chance", 48);
        topazGeodeChance =  BUILDER.define("Topaz Geode Chance", 48);
        sapphireGeodeChance =  BUILDER.define("Sapphire Geode Chance", 48);
        rubyGeodeChance =  BUILDER.define("Ruby Geode Chance", 48);
        emeraldGeodeChance =  BUILDER.define("Emerald Geode Chance", 64);
        diamondGeodeChance = BUILDER.define("Diamond Geode Chance", 128);

        BUILDER.comment();
        removeEmeraldOre = BUILDER.comment("#", " ---Natural Ore Removal---",
                " Whether to remove Diamond Ore from natural gen (default = true)")
                .define("Remove Diamond Ore Gen", true);
        removeDiamondOre = BUILDER.comment(" Whether to remove Emerald Ore from natural gen (default = true)")
                .define("Remove Emerald Ore Gen", true);*/

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
