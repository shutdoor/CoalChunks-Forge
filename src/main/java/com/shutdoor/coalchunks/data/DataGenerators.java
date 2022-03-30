package com.shutdoor.coalchunks.data;

import com.shutdoor.coalchunks.CoalChunks;
import com.shutdoor.coalchunks.data.client.ModItemProvider;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = CoalChunks.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        gen.addProvider(new ModItemProvider(gen, existingFileHelper));

        gen.addProvider(new ModItemTagsProvider(gen, new BlockTagsProvider(gen), existingFileHelper));

    }

}
