package com.example;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import sh.talonfloof.draco_std.builder.BlockEntityTypeBuilder;
import sh.talonfloof.draco_std.listeners.IRegisterListener;
import sh.talonfloof.draco_std.registries.DeferredHolder;
import sh.talonfloof.draco_std.registries.DeferredRegistry;

public class DracoExampleMod implements IRegisterListener {
    public static Logger LOGGER = LogManager.getLogger("DracoExampleMod");
    public static final DeferredRegistry<Block> BLOCK_REGISTRY = DeferredRegistry.create(Registries.BLOCK,"draco_example_mod");
    public static final DeferredHolder<Block, DemoBlock> DEMO_BLOCK = BLOCK_REGISTRY.register("demo_block",() -> new DemoBlock(Block.Properties.of()));
    public static final DeferredRegistry<BlockEntityType<?>> BLOCK_ENTITY_REGISTRY = DeferredRegistry.create(Registries.BLOCK_ENTITY_TYPE,"draco_example_mod");
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DemoBlockEntity>> DEMO_BLOCK_ENTITY = BLOCK_ENTITY_REGISTRY.register("demo_block",() -> BlockEntityTypeBuilder.of(DemoBlockEntity::new,DEMO_BLOCK.get()).build(null));
    public static final DeferredRegistry<Item> ITEM_REGISTRY = DeferredRegistry.create(Registries.ITEM, "draco_example_mod");
    public static final DeferredHolder<Item, BlockItem> DEMO_BLOCK_ITEM = ITEM_REGISTRY.register("demo_block", () -> new BlockItem(DEMO_BLOCK.get(),new Item.Properties()));

    @Override
    public void register() {
        BLOCK_REGISTRY.register();
        BLOCK_ENTITY_REGISTRY.register();
        ITEM_REGISTRY.register();
    }
}
