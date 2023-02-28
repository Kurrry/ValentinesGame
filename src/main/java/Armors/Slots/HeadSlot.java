package Armors.Slots;

import Text.GearSlots;

public class HeadSlot implements IGearSlot {
    private final String gearSlot;

    public HeadSlot() {
        this.gearSlot = GearSlots.head;
    }
    @Override
    public String getGearField() {
        return gearSlot;
    }
}
