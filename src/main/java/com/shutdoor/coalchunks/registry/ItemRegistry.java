package com.shutdoor.coalchunks.registry;

import com.shutdoor.coalchunks.CoalChunks;
import com.shutdoor.coalchunks.items.FuelItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("unused")
public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CoalChunks.MODID);

    public static final RegistryObject<FuelItem> SMALL_COAL_CHUNK = ITEMS.register(
            "small_coal_chunk", () -> new FuelItem(new Item.Properties(), 200,
                    new TranslationTextComponent("tooltip.coalchunks.small_chunk")));

    public static final RegistryObject<FuelItem> SMALL_CHARCOAL_CHUNK = ITEMS.register(
            "small_charcoal_chunk", () -> new FuelItem(new Item.Properties(), 200,
                    new TranslationTextComponent("tooltip.coalchunks.small_chunk")));

    public static final RegistryObject<FuelItem> MEDIUM_COAL_CHUNK = ITEMS.register(
            "medium_coal_chunk", () -> new FuelItem(new Item.Properties(), 400,
                    new TranslationTextComponent("tooltip.coalchunks.medium_chunk")));

    public static final RegistryObject<FuelItem> MEDIUM_CHARCOAL_CHUNK = ITEMS.register(
            "medium_charcoal_chunk", () -> new FuelItem(new Item.Properties(), 400,
                    new TranslationTextComponent("tooltip.coalchunks.medium_chunk")));

    public static final RegistryObject<FuelItem> LARGE_COAL_CHUNK = ITEMS.register(
            "large_coal_chunk", () -> new FuelItem(new Item.Properties(), 800,
                    new TranslationTextComponent("tooltip.coalchunks.large_chunk")));

    public static final RegistryObject<FuelItem> LARGE_CHARCOAL_CHUNK = ITEMS.register(
            "large_charcoal_chunk", () -> new FuelItem(new Item.Properties(), 800,
                    new TranslationTextComponent("tooltip.coalchunks.large_chunk")));
}
