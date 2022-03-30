package com.shutdoor.coalchunks.data;

import com.shutdoor.coalchunks.CoalChunks;
import com.shutdoor.coalchunks.registry.ItemRegistry;
import com.shutdoor.coalchunks.tags.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class ModItemTagsProvider extends ItemTagsProvider {

    public ModItemTagsProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(dataGenerator, blockTagProvider, CoalChunks.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(){
        tag(ModTags.Items.LARGE_COAL_CHUNK).add(ItemRegistry.LARGE_COAL_CHUNK.get());
        tag(ModTags.Items.MEDIUM_COAL_CHUNK).add(ItemRegistry.MEDIUM_COAL_CHUNK.get());
        tag(ModTags.Items.SMALL_COAL_CHUNK).add(ItemRegistry.SMALL_COAL_CHUNK.get());

        tag(ModTags.Items.LARGE_CHARCOAL_CHUNK).add(ItemRegistry.LARGE_CHARCOAL_CHUNK.get());
        tag(ModTags.Items.MEDIUM_CHARCOAL_CHUNK).add(ItemRegistry.MEDIUM_CHARCOAL_CHUNK.get());
        tag(ModTags.Items.SMALL_CHARCOAL_CHUNK).add(ItemRegistry.SMALL_CHARCOAL_CHUNK.get());
    }
}
