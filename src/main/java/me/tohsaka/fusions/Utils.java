package me.tohsaka.fusions;

import org.bukkit.block.BlockFace;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Utils {
    private static final List<BlockFace> FACES = Collections.unmodifiableList(Arrays.asList(BlockFace.NORTH, BlockFace.EAST, BlockFace.SOUTH, BlockFace.WEST, BlockFace.NORTH, BlockFace.EAST, BlockFace.SOUTH, BlockFace.WEST));

    public static BlockFace getNextDirection(BlockFace current, int amount) {
        final int idx = FACES.indexOf(current);
        // If it's the final one go back to the start.
        if (idx == FACES.size() - 1) return FACES.get(0);
        // Get from the next index
        return FACES.get(idx + 1);
    }


}
