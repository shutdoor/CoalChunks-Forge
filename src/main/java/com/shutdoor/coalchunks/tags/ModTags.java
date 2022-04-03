package com.shutdoor.coalchunks.tags;

import com.shutdoor.coalchunks.CoalChunks;
import com.shutdoor.coalchunks.registry.ItemRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.Tag;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.Tags;

public class ModTags {
    public static final class Items {
        public static final Tags.IOptionalNamedTag<Item> LARGE_COAL_CHUNK = createModTag(ItemRegistry.LARGE_COAL_CHUNK.get());
        public static final Tags.IOptionalNamedTag<Item> MEDIUM_COAL_CHUNK = createModTag(ItemRegistry.MEDIUM_COAL_CHUNK.get());
        public static final Tags.IOptionalNamedTag<Item> SMALL_COAL_CHUNK = createModTag(ItemRegistry.SMALL_COAL_CHUNK.get());

        public static final Tags.IOptionalNamedTag<Item> LARGE_CHARCOAL_CHUNK = createModTag(ItemRegistry.LARGE_CHARCOAL_CHUNK.get());
        public static final Tags.IOptionalNamedTag<Item> MEDIUM_CHARCOAL_CHUNK = createModTag(ItemRegistry.MEDIUM_CHARCOAL_CHUNK.get());
        public static final Tags.IOptionalNamedTag<Item> SMALL_CHARCOAL_CHUNK = createModTag(ItemRegistry.SMALL_CHARCOAL_CHUNK.get());


        private static Tag.Named<Item> forge(String path) { return ItemTags.bind("forge:" + path); }

        private static Tags.IOptionalNamedTag<Item> createModTag(Item item) {
            String name = item.asItem().getRegistryName().toString();
            return ItemTags.createOptional(new ResourceLocation(CoalChunks.MODID, name));
        }
    }

}
