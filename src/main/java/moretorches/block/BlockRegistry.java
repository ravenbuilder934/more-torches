package moretorches.block;

import moretorches.MoreTorches;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.particles.ParticleTypes;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static net.minecraft.block.Blocks.TORCH;

public class BlockRegistry
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MoreTorches.MOD_ID);

    public static final RegistryObject<Block> lecterntorch = BLOCKS.register("lecterntorch", () -> new Block(AbstractBlock.Properties.of(Material.WOOD).strength(2.5F).lightLevel((p_235469_0_) -> { return 14; }).sound(SoundType.WOOD)));

    public static final RegistryObject<TorchBlock> talltorch = BLOCKS.register("talltorch", () -> new TorchBlock(AbstractBlock.Properties.of(Material.DECORATION).noCollission().instabreak().lightLevel((p_235470_0_) -> { return 14; }).sound(SoundType.METAL), ParticleTypes.FLAME));

    public static final RegistryObject<TorchBlock> sconce = BLOCKS.register("sconce", () -> new TorchBlock(AbstractBlock.Properties.of(Material.DECORATION).noCollission().lightLevel((p_235469_0_) -> { return 14; }).sound(SoundType.WOOD).dropsLike(TORCH), ParticleTypes.FLAME));
}
