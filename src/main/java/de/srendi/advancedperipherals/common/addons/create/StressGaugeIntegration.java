package de.srendi.advancedperipherals.common.addons.create;


import com.simibubi.create.content.contraptions.relays.gauge.StressGaugeTileEntity;
import dan200.computercraft.api.lua.LuaFunction;
import de.srendi.advancedperipherals.lib.peripherals.BlockEntityIntegrationPeripheral;
import net.minecraft.world.level.block.entity.BlockEntity;

public class StressGaugeIntegration extends BlockEntityIntegrationPeripheral<StressGaugeTileEntity> {

    public StressGaugeIntegration(BlockEntity entity) {
        super(entity);
    }

    @Override
    public String getType() {
        return "stressometer";
    }

    @LuaFunction(mainThread = true)
    public float getStress() {
        return blockEntity.getNetworkStress();
    }

    @LuaFunction(mainThread = true)
    public float getCapacity(){
        return blockEntity.getNetworkCapacity();
    }
}
