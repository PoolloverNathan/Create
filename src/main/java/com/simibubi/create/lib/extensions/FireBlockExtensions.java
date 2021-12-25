package com.simibubi.create.lib.extensions;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;

public interface FireBlockExtensions {
	boolean create$canCatchFire(BlockGetter world, BlockPos pos, Direction face);

	int create$invokeGetBurnOdd(BlockState state);
}