package de.srendi.advancedperipherals.common.addons.create;

import com.simibubi.create.content.contraptions.relays.gauge.SpeedGaugeTileEntity;
import dan200.computercraft.api.lua.LuaFunction;
import de.srendi.advancedperipherals.lib.peripherals.BlockEntityIntegrationPeripheral;
import net.minecraft.world.level.block.entity.BlockEntity;
import org.jetbrains.annotations.NotNull;

public class SpeedGaugeIntegration extends BlockEntityIntegrationPeripheral<SpeedGaugeTileEntity> {

    public SpeedGaugeIntegration(BlockEntity entity) {
        super(entity);
    }

    @NotNull
    @Override
    public String getType() {
        return "speedometer";
    }

    @LuaFunction(mainThread = true)
    public final float getSpeed() {
        return blockEntity.getSpeed();
    }
}
