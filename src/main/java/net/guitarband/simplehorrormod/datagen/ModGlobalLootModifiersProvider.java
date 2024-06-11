package net.guitarband.simplehorrormod.datagen;

import net.guitarband.simplehorrormod.SimpleHorrorMod;
import net.guitarband.simplehorrormod.item.ModItems;
import net.guitarband.simplehorrormod.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, SimpleHorrorMod.MOD_ID);
    }

    @Override
    protected void start() {
        add("crystalline_shard_from_diamond_ore", new AddItemModifier(new LootItemCondition[]{
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.DIAMOND_ORE).build(),
                LootItemRandomChanceCondition.randomChance(0.001f).build()
        }, ModItems.CRYSTALLINE_SHARD.get()));
    }
}
