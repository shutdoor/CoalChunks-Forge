package com.shutdoor.coalchunks.tags;

import com.shutdoor.coalchunks.CoalChunks;
import com.shutdoor.coalchunks.registry.ItemRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.Tags;

public class ModTags {
    public static final class Items {
        public static final TagKey<Item> LARGE_COAL_CHUNK = createModTag(ItemRegistry.LARGE_COAL_CHUNK.get());
        public static final TagKey<Item> MEDIUM_COAL_CHUNK = createModTag(ItemRegistry.MEDIUM_COAL_CHUNK.get());
        public static final TagKey<Item> SMALL_COAL_CHUNK = createModTag(ItemRegistry.SMALL_COAL_CHUNK.get());

        public static final TagKey<Item> LARGE_CHARCOAL_CHUNK = createModTag(ItemRegistry.LARGE_CHARCOAL_CHUNK.get());
        public static final TagKey<Item> MEDIUM_CHARCOAL_CHUNK = createModTag(ItemRegistry.MEDIUM_CHARCOAL_CHUNK.get());
        public static final TagKey<Item> SMALL_CHARCOAL_CHUNK = createModTag(ItemRegistry.SMALL_CHARCOAL_CHUNK.get());

        private static TagKey<Item> createModTag(Item i) {
            String name = i.getDescriptionId();
            return ItemTags.create(new ResourceLocation(CoalChunks.MODID, name));
        }
    }

}
