package net.guitarband.simplehorrormod.item;

import net.guitarband.simplehorrormod.SimpleHorrorMod;
import net.guitarband.simplehorrormod.item.custom.ModArmorItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SimpleHorrorMod.MOD_ID);

    public static final RegistryObject<Item> BAZZLE_SHARD = ITEMS.register("bazzle_shard",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CRYSTALLINE_SHARD = ITEMS.register("crystalline_shard",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BAZZLE_AXE = ITEMS.register("bazzle_axe",
            () -> new AxeItem(ModToolTiers.BAZZLE, 4, 2, new Item.Properties()));

    public static final RegistryObject<Item> BAZZLE_HELMET = ITEMS.register("bazzle_helmet",
            () -> new ModArmorItem(ModArmorMaterials.BAZZLE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> BAZZLE_CHESTPLATE = ITEMS.register("bazzle_chestplate",
            () -> new ArmorItem(ModArmorMaterials.BAZZLE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> BAZZLE_LEGGINGS = ITEMS.register("bazzle_leggings",
            () -> new ArmorItem(ModArmorMaterials.BAZZLE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> BAZZLE_BOOTS = ITEMS.register("bazzle_boots",
            () -> new ArmorItem(ModArmorMaterials.BAZZLE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
