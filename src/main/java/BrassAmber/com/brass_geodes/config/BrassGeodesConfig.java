package BrassAmber.com.brass_geodes.config;

import net.minecraftforge.common.ForgeConfigSpec;

public final class BrassGeodesConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> baseGeodeChance;
    public static final ForgeConfigSpec.ConfigValue<Integer> amethystGeodeChance;
    public static final ForgeConfigSpec.ConfigValue<Integer> topazGeodeChance;
    public static final ForgeConfigSpec.ConfigValue<Integer> sapphireGeodeChance;
    public static final ForgeConfigSpec.ConfigValue<Integer> rubyGeodeChance;
    public static final ForgeConfigSpec.ConfigValue<Integer> emeraldGeodeChance;
    public static final ForgeConfigSpec.ConfigValue<Integer> diamondGeodeChance;

    public static final ForgeConfigSpec.ConfigValue<Boolean> emeraldOre;
    public static final ForgeConfigSpec.ConfigValue<Boolean> diamondOre;


    static {
        BUILDER.push("Config for Brass Geodes Mod!");
        BUILDER.comment("All geode spawn chance options should be viewed as each chunk fo the game having a 1 out of 'geode_chance' to spawn.");
        BUILDER.comment("I.E Amethyst Geodes in this mod have a chance of 1/48 chunks. 24 base + 24 Geode chance");
        baseGeodeChance = BUILDER.comment("This is the base geode spawn chance (what vanilla Amethyst is set to) " +
                "which all other geode chances are added on top of").define("Base Geode Chance", 24);
        amethystGeodeChance = BUILDER.comment("Amethyst Geode Chance").define("Amethyst Geode Chance", 24);
        topazGeodeChance =  BUILDER.comment("Topaz Geode Chance").define("Topaz Geode Chance", 40);
        sapphireGeodeChance =  BUILDER.comment("Sapphire Geode Chance").define("Sapphire Geode Chance", 56);
        rubyGeodeChance =  BUILDER.comment("Ruby Geode Chance").define("Ruby Geode Chance", 72);
        emeraldGeodeChance =  BUILDER.comment("Emerald Geode Chance").define("Emerald Geode Chance", 104);
        diamondGeodeChance = BUILDER.comment("Diamond Geode Chance").define("Diamond Geode Chance", 152);
        BUILDER.comment("");

        emeraldOre = BUILDER.comment("Whether Diamond Ore spawns naturally or not (default = false)").define("Diamond Ore Gen", false);
        diamondOre = BUILDER.comment("Whether Emerald Ore spawns naturally or not (default = false)").define("Emerald Ore Gen", false);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
