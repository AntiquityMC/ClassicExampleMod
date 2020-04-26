package net.fabricmc.example.mixin;

import com.mojang.minecraft.MinecraftApplet;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftApplet.class)
public abstract class MinecraftAppletMixin {
    @Shadow public abstract void startGameThread();

    @Inject(method = "start", at = @At("HEAD"))
    private void onStart(CallbackInfo ci) {
        System.out.println("haha no");
        startGameThread();
    }
}
