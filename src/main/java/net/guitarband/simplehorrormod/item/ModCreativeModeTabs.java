package net.guitarband.simplehorrormod.item;

import net.guitarband.simplehorrormod.SimpleHorrorMod;
import net.guitarband.simplehorrormod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SimpleHorrorMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SIMPLE_HORROR_TAB = CREATIVE_MODE_TABS.register("simplehorrorguitarband",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BAZZLE_SHARD.get()))
                    .title(Component.translatable("creativetab.simplehorrorguitarband"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(ModItems.BAZZLE_SHARD.get());
                        output.accept(ModBlocks.BAZZLE_BLOCK.get());
                    }))
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
