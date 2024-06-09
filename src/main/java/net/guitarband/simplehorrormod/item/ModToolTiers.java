package net.guitarband.simplehorrormod.item;

import net.guitarband.simplehorrormod.SimpleHorrorMod;
import net.guitarband.simplehorrormod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier BAZZLE = TierSortingRegistry.registerTier(
            new ForgeTier(4, 4000, 5, 25, 25,
                    ModTags.Blocks.NEEDS_BAZZLE_TOOL, () -> Ingredient.of(ModItems.BAZZLE_SHARD.get())),
            new ResourceLocation(SimpleHorrorMod.MOD_ID, "bazzle"), List.of(Tiers.DIAMOND), List.of(Tiers.NETHERITE)
    );
}
