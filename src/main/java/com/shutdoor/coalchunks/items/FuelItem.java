package com.shutdoor.coalchunks.items;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.property.Properties;

import javax.annotation.Nullable;
import java.util.List;

public class FuelItem extends Item {

    public final int burnTime;
    public final TranslatableComponent hoverText;

    public FuelItem(Properties properties, int burn, TranslatableComponent text) {
        super(properties.tab(CreativeModeTab.TAB_MISC));
        this.burnTime = burn;
        this.hoverText = text;
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return burnTime;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltipComp, TooltipFlag isAdvance) {
        tooltipComp.add(hoverText);

        super.appendHoverText(stack, level, tooltipComp, isAdvance);
    }
}
