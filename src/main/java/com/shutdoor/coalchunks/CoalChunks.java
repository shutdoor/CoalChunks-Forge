package com.shutdoor.coalchunks;

import com.shutdoor.coalchunks.registry.ItemRegistry;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CoalChunks.MODID)
@Mod.EventBusSubscriber(modid = CoalChunks.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CoalChunks {

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "coalchunks";

    public CoalChunks() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemRegistry.ITEMS.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }


}
