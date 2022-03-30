package com.shutdoor.coalchunks.items;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class FuelItem extends Item {

    public final int burnTime;
    public final TranslationTextComponent hoverText;

    public FuelItem(Properties properties, int burn, TranslationTextComponent text) {
        super(properties);
        this.burnTime = burn;
        this.hoverText = text;
    }

    @Override
    public int getBurnTime(ItemStack itemStack) {
        return burnTime;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(hoverText);

        super.appendHoverText(stack, worldIn, tooltip, flagIn);
    }
}
