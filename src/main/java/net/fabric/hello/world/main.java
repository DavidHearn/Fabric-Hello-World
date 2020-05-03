package net.fabric.hello.world;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class main implements ModInitializer {
    
    public static final Item FABRIC_ITEM = new HelloItem(new Item.Settings()
        .group(ItemGroup.MISC).maxCount(1));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("helloworld", "fabric_item"), FABRIC_ITEM);
    }

}