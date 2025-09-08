package net.gavin.testmod.item;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.gavin.testmod.TestMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

        public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));

        private static Item registerItem(String name, Item item) {
            return Registry.register(Registries.ITEM, Identifier.of(TestMod.MOD_ID, name), item);
        }

        public static void registerModItems() {
            TestMod.LOGGER.info("Registering Mod Items for" + TestMod.MOD_ID);
        }

        ItemGroupEvents.ModifyEntries();

}
