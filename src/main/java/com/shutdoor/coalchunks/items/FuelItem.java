package com.shutdoor.coalchunks.items;

import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.contents.TranslatableContents;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mutable;

import javax.annotation.Nullable;
import java.util.List;

public class FuelItem extends Item {

    public final int burnTime;
    public final String hoverText;

    public FuelItem(Properties properties, int burn, String text) {
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
        super.appendHoverText(stack, level, tooltipComp, isAdvance);
        MutableComponent textComponent = Component.translatable("tooltip.coalchunks."+ hoverText);
        textComponent.withStyle(ChatFormatting.YELLOW);
        tooltipComp.add(textComponent);
    }
}
