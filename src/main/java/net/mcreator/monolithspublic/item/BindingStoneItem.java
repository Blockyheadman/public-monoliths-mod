
package net.mcreator.monolithspublic.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.monolithspublic.itemgroup.MonolithsTabItemGroup;
import net.mcreator.monolithspublic.MonolithspublicModElements;

@MonolithspublicModElements.ModElement.Tag
public class BindingStoneItem extends MonolithspublicModElements.ModElement {
	@ObjectHolder("monolithspublic:binding_stone")
	public static final Item block = null;

	public BindingStoneItem(MonolithspublicModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MonolithsTabItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("binding_stone");
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

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
