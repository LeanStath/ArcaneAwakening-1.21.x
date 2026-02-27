package com.lean.arcaneawakening.item;

import com.lean.arcaneawakening.ArcaneAwakening;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ArcaneAwakening.MOD_ID);

    public static final DeferredItem<Item> LIGHT_CORE = ITEMS.register("light_core",
            ()-> new Item(new Item.Properties()));

    public static final DeferredItem<Item> TOMAHAWK = ITEMS.register("tomahawk",
            ()-> new Item(new Item.Properties()));

    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
