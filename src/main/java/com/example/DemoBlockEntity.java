package com.example;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class DemoBlockEntity extends BlockEntity {
    public DemoBlockEntity(BlockPos pos, BlockState state) {
        super(DracoExampleMod.DEMO_BLOCK_ENTITY.get(), pos, state);
    }
}
