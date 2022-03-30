package com.shutdoor.coalchunks.tags;

import com.shutdoor.coalchunks.registry.ItemRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;

public class ModTags {
    public static final class Items {
        public static final ITag.INamedTag<Item> LARGE_COAL_CHUNK = mod(ItemRegistry.LARGE_COAL_CHUNK.get());
        public static final ITag.INamedTag<Item> MEDIUM_COAL_CHUNK = mod(ItemRegistry.MEDIUM_COAL_CHUNK.get());
        public static final ITag.INamedTag<Item> SMALL_COAL_CHUNK = mod(ItemRegistry.SMALL_COAL_CHUNK.get());

        public static final ITag.INamedTag<Item> LARGE_CHARCOAL_CHUNK = mod(ItemRegistry.LARGE_CHARCOAL_CHUNK.get());
        public static final ITag.INamedTag<Item> MEDIUM_CHARCOAL_CHUNK = mod(ItemRegistry.MEDIUM_CHARCOAL_CHUNK.get());
        public static final ITag.INamedTag<Item> SMALL_CHARCOAL_CHUNK = mod(ItemRegistry.SMALL_CHARCOAL_CHUNK.get());


        private static ITag.INamedTag<Item> forge(String path) { return ItemTags.bind("forge:" + path); }

        private static ITag.INamedTag<Item> mod(IItemProvider item) {
            String path = item.asItem().getRegistryName().toString();
            return ItemTags.bind(path);
        }
    }

}
