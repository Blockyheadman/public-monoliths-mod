package net.mcreator.monolithspublic.procedures;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.monolithspublic.MonolithspublicMod;

import java.util.Map;

public class MonolithsBuildVerCommandExecutedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MonolithspublicMod.LOGGER.warn("Failed to load dependency entity for procedure MonolithsBuildVerCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Monoliths Build Ver: 1.5.0"), (false));
		}
		MonolithspublicMod.LOGGER.info("First number is major, second is minor, third is revision");
	}
}
