package BrassAmber.com.brass_geodes.util;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum GemMaterial implements Tier, ArmorMaterial {
    AMETHYST("amethyst", 56, 4F, 0.0F, 0.083F, 48),
    TOPAZ("topaz", 64, 4F, 0.0F, 0.083F, 64),
    SAPPHIRE("sapphire", 96, 4F, 0.0F, 0.067F,  80),
    RUBY("ruby", 128, 6F, 1.0F, .055F, 96),
    EMERALD("emerald", 196, 6F, 2.0F, 0.042F, 128),
    DIAMOND("diamond", 256, 8F, 3.0F, 0.028F, 192);


    private final String name;
    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final float rarity;
    private final int geodeRarity;

    GemMaterial(String name, int uses, float speed, float damage, float rarity, int geodeRarity) {
        this.name = name;
        this.level = 0;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = 22;
        this.rarity = rarity;
        this.geodeRarity = geodeRarity;
    }

    public int getGeodeRarity() {
        return geodeRarity;
    }

    public float getRarity() {
        return rarity;
    }

    @Override
    public int getUses() {
        return this.uses;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.damage;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlot p_40410_) {
        return 0;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot p_40411_) {
        return 0;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return null;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.EMPTY;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public float getToughness() {
        return 0;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }

    public int getDurability() {
        return 4;
    }

    public int getDefense() {
        return 0;
    }
}
