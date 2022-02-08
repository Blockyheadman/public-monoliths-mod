
package net.mcreator.monolithspublic.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.monolithspublic.item.LostGemItem;
import net.mcreator.monolithspublic.MonolithspublicModElements;

@MonolithspublicModElements.ModElement.Tag
public class MonolithsTabItemGroup extends MonolithspublicModElements.ModElement {
	public MonolithsTabItemGroup(MonolithspublicModElements instance) {
		super(instance, 42);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmonoliths_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(LostGemItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
