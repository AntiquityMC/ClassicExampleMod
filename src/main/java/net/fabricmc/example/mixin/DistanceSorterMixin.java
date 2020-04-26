package net.fabricmc.example.mixin;

import com.mojang.minecraft.Player;
import com.mojang.minecraft.level.Chunk;
import com.mojang.minecraft.level.DistanceSorter;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import java.util.Comparator;

@Mixin(DistanceSorter.class)
public class DistanceSorterMixin implements Comparator<Chunk> {
    @Shadow private Player player;

    @Override
    public int compare(Chunk first, Chunk second) {
        float distance1 = first.method_87(player);
        float distance2 = second.method_87(player);
        return Float.compare(distance1, distance2);
    }
}
