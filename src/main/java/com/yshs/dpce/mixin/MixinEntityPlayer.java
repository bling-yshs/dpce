package com.yshs.dpce.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(EntityPlayer.class)
public abstract class MixinEntityPlayer {

    /**
     * @author yshs
     * @reason mod needed
     */
    @Overwrite
    public void applyEntityCollision(Entity entityIn) {
    }
}
