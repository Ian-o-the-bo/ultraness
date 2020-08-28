
package net.mcreator.ultraness.enchantment;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.DamageSource;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

import net.mcreator.ultraness.UltranessModElements;

@UltranessModElements.ModElement.Tag
public class KoolaidEnchantment extends UltranessModElements.ModElement {
	@ObjectHolder("ultraness:koolaid")
	public static final Enchantment enchantment = null;
	public KoolaidEnchantment(UltranessModElements instance) {
		super(instance, 57);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("koolaid"));
	}
	public static class CustomEnchantment extends Enchantment {
		public CustomEnchantment(EquipmentSlotType... slots) {
			super(Enchantment.Rarity.COMMON, EnchantmentType.ALL, slots);
		}

		@Override
		public int getMinLevel() {
			return 1;
		}

		@Override
		public int getMaxLevel() {
			return 1004;
		}

		@Override
		public int calcModifierDamage(int level, DamageSource source) {
			return level * 1002;
		}

		@Override
		public boolean isTreasureEnchantment() {
			return true;
		}

		@Override
		public boolean isCurse() {
			return false;
		}

		@Override
		public boolean isAllowedOnBooks() {
			return true;
		}
	}
}
