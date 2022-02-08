
package net.mcreator.monolithspublic.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.monolithspublic.itemgroup.DevelopmentDiscsItemGroup;
import net.mcreator.monolithspublic.MonolithspublicModElements;

import java.util.List;

@MonolithspublicModElements.ModElement.Tag
public class DevelopmentDisc2Item extends MonolithspublicModElements.ModElement {
	@ObjectHolder("monolithspublic:development_disc_2")
	public static final Item block = null;

	public DevelopmentDisc2Item(MonolithspublicModElements instance) {
		super(instance, 38);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, MonolithspublicModElements.sounds.get(new ResourceLocation("monolithspublic:monoliths-developement-disc-2")),
					new Item.Properties().group(DevelopmentDiscsItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("development_disc_2");
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Covers up to version 1.4.3!"));
		}
	}
}
