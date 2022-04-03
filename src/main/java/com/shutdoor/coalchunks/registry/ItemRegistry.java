package com.shutdoor.coalchunks.registry;

import com.shutdoor.coalchunks.CoalChunks;
import com.shutdoor.coalchunks.items.FuelItem;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@SuppressWarnings("unused")
public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CoalChunks.MODID);

    public static final RegistryObject<FuelItem> SMALL_COAL_CHUNK = ITEMS.register(
            "small_coal_chunk", () -> new FuelItem(new Item.Properties(), 200,
                    new TranslatableComponent("tooltip.coalchunks.small_chunk")));

    public static final RegistryObject<FuelItem> SMALL_CHARCOAL_CHUNK = ITEMS.register(
            "small_charcoal_chunk", () -> new FuelItem(new Item.Properties(), 200,
                    new TranslatableComponent("tooltip.coalchunks.small_chunk")));

    public static final RegistryObject<FuelItem> MEDIUM_COAL_CHUNK = ITEMS.register(
            "medium_coal_chunk", () -> new FuelItem(new Item.Properties(), 400,
                    new TranslatableComponent("tooltip.coalchunks.medium_chunk")));

    public static final RegistryObject<FuelItem> MEDIUM_CHARCOAL_CHUNK = ITEMS.register(
            "medium_charcoal_chunk", () -> new FuelItem(new Item.Properties(), 400,
                    new TranslatableComponent("tooltip.coalchunks.medium_chunk")));

    public static final RegistryObject<FuelItem> LARGE_COAL_CHUNK = ITEMS.register(
            "large_coal_chunk", () -> new FuelItem(new Item.Properties(), 800,
                    new TranslatableComponent("tooltip.coalchunks.large_chunk")));

    public static final RegistryObject<FuelItem> LARGE_CHARCOAL_CHUNK = ITEMS.register(
            "large_charcoal_chunk", () -> new FuelItem(new Item.Properties(), 800,
                    new TranslatableComponent("tooltip.coalchunks.large_chunk")));
}
