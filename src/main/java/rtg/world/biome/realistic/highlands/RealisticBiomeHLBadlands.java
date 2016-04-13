package rtg.world.biome.realistic.highlands;

import highlands.api.HighlandsBiomes;
import rtg.api.biome.BiomeConfig;
import rtg.world.gen.surface.highlands.SurfaceHLBadlands;
import rtg.world.gen.terrain.highlands.TerrainHLBadlands;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;
import rtg.util.CellNoise;
import rtg.util.OpenSimplexNoise;

public class RealisticBiomeHLBadlands extends RealisticBiomeHLBase
{
    public static BiomeGenBase hlBiome = HighlandsBiomes.badlands;
    
    public static Block topBlock = hlBiome.topBlock;
    public static Block fillerBlock = hlBiome.fillerBlock;
    
    public RealisticBiomeHLBadlands(BiomeConfig config)
    {
    
        super(config, 
            hlBiome, BiomeGenBase.river,
            new TerrainHLBadlands(40f, 140f, 13f, 70f, 76f),
            new SurfaceHLBadlands(config, topBlock, fillerBlock));
        this.noLakes = true;
    }
    
}
