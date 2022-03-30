package com.shutdoor.coalchunks.data.client;

import com.shutdoor.coalchunks.CoalChunks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemProvider extends ItemModelProvider {

    public ModItemProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, CoalChunks.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        ModelFile itemGen = getExistingFile(mcLoc("item/generated"));

        builder(itemGen, "small_coal_chunk");
        builder(itemGen, "small_charcoal_chunk");

        builder(itemGen, "medium_coal_chunk");
        builder(itemGen, "medium_charcoal_chunk");

        builder(itemGen, "large_coal_chunk");
        builder(itemGen, "large_charcoal_chunk");
    }

    private ItemModelBuilder builder(ModelFile itemGen, String name) {
        return getBuilder(name).parent(itemGen).texture("layer0", "item/" + name);
    }


}
