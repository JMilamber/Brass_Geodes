package BrassAmber.com.brass_geodes.util;

import net.minecraft.core.BlockPos;

public class BGUtil {

    public static double distanceTo2D(BlockPos origin, BlockPos end) {
        double dX = Math.abs(origin.getX() - end.getX());
        double dZ = Math.abs(origin.getZ() - end.getZ());
        return Math.sqrt(dX * dX + dZ * dZ);
    }

    public static double distanceTo3D(BlockPos origin, BlockPos end) {
        double dXZ = distanceTo2D(origin, end);
        double dY = origin.getY() - end.getY();
        return Math.sqrt(Math.abs(dXZ * dXZ + dY * dY));
    }
}
