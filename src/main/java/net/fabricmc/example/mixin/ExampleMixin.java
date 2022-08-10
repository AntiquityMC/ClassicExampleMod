package net.fabricmc.example.mixin;

import com.mojang.minecraft.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class ExampleMixin {
	@Inject(at = @At("HEAD"), method = "run()V")
	private void init(CallbackInfo info) {
		System.out.println("This line is printed by an example mod mixin!");
	}
}
