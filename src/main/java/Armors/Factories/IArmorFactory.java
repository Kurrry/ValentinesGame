package Armors.Factories;


import Armors.Types.Armor;

interface IArmorFactory {

    Armor createArmor(String type);
}
