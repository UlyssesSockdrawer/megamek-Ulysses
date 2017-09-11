/**
 * MegaMek - Copyright (C) 2005 Ben Mazur (bmazur@sev.org)
 *
 *  This program is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License as published by the Free
 *  Software Foundation; either version 2 of the License, or (at your option)
 *  any later version.
 *
 *  This program is distributed in the hope that it will be useful, but
 *  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 *  or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 *  for more details.
 */
/*
 * Created on Sep 12, 2004
 *
 */
package megamek.common.weapons.lasers;

import megamek.common.SimpleTechLevel;
import megamek.common.WeaponType;

/**
 * @author Sebastian Brocks
 */
public class CLERPulseLaserSmall extends PulseLaserWeapon {
    /**
     *
     */
    private static final long serialVersionUID = -273231806790327505L;

    /**
     *
     */
    public CLERPulseLaserSmall() {
        super();
        name = "ER Small Pulse Laser";
        setInternalName("CLERSmallPulseLaser");
        addLookupName("Clan ER Pulse Small Laser");
        addLookupName("Clan ER Small Pulse Laser");
        addLookupName("ClanERSmallPulseLaser");
        heat = 3;
        damage = 5;
        infDamageClass = WeaponType.WEAPON_BURST_1D6;
        toHitModifier = -1;
        shortRange = 2;
        mediumRange = 4;
        longRange = 6;
        extremeRange = 8;
        waterShortRange = 1;
        waterMediumRange = 2;
        waterLongRange = 4;
        waterExtremeRange = 4;
        tonnage = 1.5f;
        criticals = 1;
        bv = 36;
        cost = 30000;
        flags = flags.or(F_BURST_FIRE);
        rulesRefs = "320,TO";
        techAdvancement.setTechBase(TECH_BASE_CLAN)
            .setTechRating(RATING_F).setAvailability(RATING_X, RATING_X, RATING_E, RATING_D)
            .setClanAdvancement(3057, 3082, 3095).setPrototypeFactions(F_CWF)
            .setProductionFactions(F_CWF).setStaticTechLevel(SimpleTechLevel.EXPERIMENTAL);
    }
}
