package BrassAmber.com.brass_geodes.block;

import com.google.common.collect.Lists;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.*;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.state.BlockState;

import java.util.*;

public class GemClusterBlock extends AmethystClusterBlock {

    private BlockPos aOrb;
    private BlockPos pos;

    public GemClusterBlock(int p_152015_, int p_152016_, Properties p_152017_) {
        super(p_152015_, p_152016_, p_152017_);
    }

    @Override
    public void animateTick(BlockState blockState, Level level, BlockPos blockPos, RandomSource random) {
        super.animateTick(blockState, level, blockPos, random);
        List<BlockPos> validPos = Lists.newArrayList();
        validPos.add(blockPos);
        if (random.nextInt(6) == 0) {
            if (level.getBlockState(blockPos.above()).isAir()) {
                aOrb = blockPos.above();
                if (level.getBlockState(blockPos.north()).isAir()) {
                    validPos.add(aOrb.north());
                } else if (level.getBlockState(blockPos.east()).isAir()) {
                    validPos.add(aOrb.east());
                } else if (level.getBlockState(blockPos.east()).isAir()) {
                    validPos.add(aOrb.south());
                } else if (level.getBlockState(blockPos.east()).isAir()) {
                    validPos.add(aOrb.west());
                }
            } else if (level.getBlockState(blockPos.below()).isAir()) {
                aOrb = blockPos.above();
                if (level.getBlockState(blockPos.north()).isAir()) {
                    validPos.add(aOrb.north());
                } else if (level.getBlockState(blockPos.east()).isAir()) {
                    validPos.add(aOrb.east());
                } else if (level.getBlockState(blockPos.east()).isAir()) {
                    validPos.add(aOrb.south());
                } else if (level.getBlockState(blockPos.east()).isAir()) {
                    validPos.add(aOrb.west());
                }
            }
            BlockPos particlePos = validPos.get(random.nextInt(validPos.size()));
            level.addParticle(ParticleTypes.ELECTRIC_SPARK, particlePos.getX(), particlePos.getY(), particlePos.getZ(), .2D, .1D, .2D);
            level.playSound(null, particlePos, SoundEvents.AMETHYST_BLOCK_CHIME, SoundSource.BLOCKS, 5F, 1F);
        }
    }

}
