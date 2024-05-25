package com.example;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class DemoBlock extends Block implements EntityBlock {
    public DemoBlock(Block.Properties properties) {
        super(properties);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new DemoBlockEntity(blockPos, blockState);
    }
}
