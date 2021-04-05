package moretorches.item;

import moretorches.MoreTorches;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static moretorches.block.BlockRegistry.*;

public class ItemRegistry
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreTorches.MOD_ID);

    public static final RegistryObject<Item> lecterntorch_item = ITEMS.register("lecterntorch", () -> new BlockItem(lecterntorch.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));

    public static final RegistryObject<Item> talltorch_item = ITEMS.register("talltorch", () -> new BlockItem(talltorch.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));

    public static final RegistryObject<Item> sconce_item = ITEMS.register("sconce", () -> new BlockItem(sconce.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
}
