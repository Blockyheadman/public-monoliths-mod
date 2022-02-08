
package net.mcreator.monolithspublic.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.monolithspublic.itemgroup.MonolithsTabItemGroup;
import net.mcreator.monolithspublic.MonolithspublicModElements;

@MonolithspublicModElements.ModElement.Tag
public class LostFragmentItem extends MonolithspublicModElements.ModElement {
	@ObjectHolder("monolithspublic:lost_fragment")
	public static final Item block = null;

	public LostFragmentItem(MonolithspublicModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MonolithsTabItemGroup.tab).maxStackSize(64).isImmuneToFire().rarity(Rarity.RARE));
			setRegistryName("lost_fragment");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
