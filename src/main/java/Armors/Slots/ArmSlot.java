package Armors.Slots;

import Text.GearSlots;

public class ArmSlot implements IGearSlot {
    private final String gearSlot;

    public ArmSlot() {
        this.gearSlot = GearSlots.arm;
    }
    @Override
    public String getGearField() {
        return gearSlot;
    }
}
