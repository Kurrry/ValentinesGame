package Armors.Slots;

import Text.GearSlots;

public class BootSlot implements IGearSlot {
    private final String gearSlot;

    public BootSlot() {
        this.gearSlot = GearSlots.boot;
    }

    @Override
    public String getGearField() {
        return gearSlot;
    }
}
