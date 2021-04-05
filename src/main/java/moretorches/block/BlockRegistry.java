package moretorches.block;

import moretorches.MoreTorches;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.particles.ParticleTypes;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MoreTorches.MOD_ID);

    public static final RegistryObject<Block> lecterntorch = BLOCKS.register("lecterntorch", () -> new Block(AbstractBlock.Properties.of(Material.WOOD).strength(2.5F).lightLevel((p_235469_0_) -> { return 14; }).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> talltorch = BLOCKS.register("talltorch", () -> new Block(AbstractBlock.Properties.of(Material.DECORATION).lightLevel((p_235470_0_) -> { return 14; }).sound(SoundType.METAL)));

    public static final RegistryObject<SconceBlock> sconce = BLOCKS.register("sconce", () -> new SconceBlock(AbstractBlock.Properties.of(Material.DECORATION).lightLevel((p_235469_0_) -> { return 14; }).sound(SoundType.WOOD), ParticleTypes.FLAME));
}
