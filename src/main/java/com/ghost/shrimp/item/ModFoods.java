package com.ghost.shrimp.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {

    public static final FoodProperties PRAWN = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.4F).build();
    public static final FoodProperties GOLDEN_PRAWN = (new FoodProperties.Builder()).fast().nutrition(20).saturationMod(1.0F).effect(new MobEffectInstance(MobEffects.REGENERATION, 1200, 3), 1.0F).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1200, 3), 1.0F).effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 1200, 0), 1.0F).effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 2400, 0), 1.0F).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2400, 3), 1.0F).effect(new MobEffectInstance(MobEffects.JUMP, 2400, 3), 1.0F).meat().build();
}
