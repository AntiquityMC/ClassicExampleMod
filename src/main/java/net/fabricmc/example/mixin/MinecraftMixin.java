package net.fabricmc.example.mixin;

import com.mojang.minecraft.Minecraft;
import com.mojang.minecraft.MinecraftApplet;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.awt.Canvas;

@Mixin(Minecraft.class)
public class MinecraftMixin {
    @Inject(method = "<init>", at = @At("RETURN"))
    private void onConstruct(Canvas canvas, MinecraftApplet arg, int i, int j, boolean flag, CallbackInfo ci) {
        System.out.println("Constructing Minecraft!");
    }
}
