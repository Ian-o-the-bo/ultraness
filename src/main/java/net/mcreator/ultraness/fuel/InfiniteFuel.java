
package net.mcreator.ultraness.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.mcreator.ultraness.item.FuelgoodItem;
import net.mcreator.ultraness.UltranessModElements;

@UltranessModElements.ModElement.Tag
public class InfiniteFuel extends UltranessModElements.ModElement {
	public InfiniteFuel(UltranessModElements instance) {
		super(instance, 53);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(FuelgoodItem.block, (int) (1)).getItem())
			event.setBurnTime(1000000000);
	}
}
