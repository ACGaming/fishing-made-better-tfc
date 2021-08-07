package net.theawesomegem.fishingmadebetter.common.item.fishslice;

import javax.annotation.Nonnull;

import net.minecraft.item.ItemStack;
import net.minecraftforge.common.capabilities.ICapabilityProvider;

import net.dries007.tfc.api.capability.size.Size;
import net.dries007.tfc.api.capability.size.Weight;

public class ItemRawFishSlice extends ItemFishSlice {
	public ItemRawFishSlice() {
		super("fish_slice_raw", 2, 0.4F);
	}

	@Override
	public ICapabilityProvider getCustomFoodHandler()
	{
		return null;
	}

	@Nonnull
	@Override
	public Size getSize(@Nonnull ItemStack itemStack)
	{
		return Size.SMALL;
	}

	@Nonnull
	@Override
	public Weight getWeight(@Nonnull ItemStack itemStack)
	{
		return Weight.LIGHT;
	}
}