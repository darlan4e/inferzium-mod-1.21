package net.darlan.inferziummod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent SANDWICH = new FoodComponent.Builder().nutrition(10).saturationModifier(1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 1000), 1f).build();

}
