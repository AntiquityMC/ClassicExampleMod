package net.fabricmc.example.mixin;

import com.mojang.minecraft.class_103;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(class_103.class)
public class InGameHudMixin {
    @ModifyConstant(method = "method_321", constant = @Constant(stringValue = "0.30"))
    private String modifyVersion(String version) {
        return version + ": Hello Fabric world!";
    }
}
