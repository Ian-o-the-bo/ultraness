
package net.mcreator.ultraness.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.ultraness.UltranessModElements;

@UltranessModElements.ModElement.Tag
public class YahPickaxeItem extends UltranessModElements.ModElement {
	@ObjectHolder("ultraness:yah_pickaxe")
	public static final Item block = null;
	public YahPickaxeItem(UltranessModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 786;
			}

			public float getEfficiency() {
				return 51.5f;
			}

			public float getAttackDamage() {
				return 4.6f;
			}

			public int getHarvestLevel() {
				return 18;
			}

			public int getEnchantability() {
				return 40;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("yah_pickaxe"));
	}
}
