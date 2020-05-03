package net.fabric.hello.world;

import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.sound.SoundEvents;

public class HelloItem extends Item {
    public HelloItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(final World world, final PlayerEntity playerEntity, final Hand hand)
    {
        playerEntity.playSound(SoundEvents.BLOCK_WOOL_BREAK, 1.0F, 1.0F);
        return new TypedActionResult<>(ActionResult.SUCCESS, playerEntity.getStackInHand(hand));
    }
}