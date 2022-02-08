
package net.mcreator.monolithspublic.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.monolithspublic.item.DevelopmentDisc1Item;
import net.mcreator.monolithspublic.MonolithspublicModElements;

@MonolithspublicModElements.ModElement.Tag
public class DevelopmentDiscsItemGroup extends MonolithspublicModElements.ModElement {
	public DevelopmentDiscsItemGroup(MonolithspublicModElements instance) {
		super(instance, 37);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabdevelopment_discs") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(DevelopmentDisc1Item.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
