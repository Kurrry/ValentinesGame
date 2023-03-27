package Armors.Factories;


import Armors.Slots.IGearSlot;
import Armors.Types.Armor;

interface IArmorFactory {

    Armor createArmor(String type, IGearSlot slot);
}
