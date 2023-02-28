package Armors.Slots.Factory;

import Armors.Slots.IGearSlot;

public interface ISlotFactory {
    IGearSlot createGearSlot(String slot);
}
