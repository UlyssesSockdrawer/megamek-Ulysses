/*
 * Copyright (c) 2024 - The MegaMek Team. All Rights Reserved.
 *
 * This file is part of MegaMek.
 *
 * MegaMek is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * MegaMek is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with MegaMek. If not, see <http://www.gnu.org/licenses/>.
 */
package megamek.client.ui.advancedsearch;

import megamek.client.ui.Messages;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

class TransportsSearchTab extends JPanel {

    JButton btnTransportsClear = new JButton(Messages.getString("MekSelectorDialog.ClearTab"));
    JLabel lblTroopSpace = new JLabel(Messages.getString("MekSelectorDialog.Search.TroopSpace"));
    JTextField tStartTroopSpace  = new JTextField(4);
    JTextField tEndTroopSpace = new JTextField(4);
    JLabel lblASFBays = new JLabel(Messages.getString("MekSelectorDialog.Search.ASFBays"));
    JTextField tStartASFBays = new JTextField(4);
    JTextField tEndASFBays = new JTextField(4);
    JLabel lblASFDoors = new JLabel(Messages.getString("MekSelectorDialog.Search.Doors"));
    JTextField tStartASFDoors = new JTextField(4);
    JTextField tEndASFDoors = new JTextField(4);
    JLabel lblASFUnits = new JLabel(Messages.getString("MekSelectorDialog.Search.Units"));
    JTextField tStartASFUnits = new JTextField(4);
    JTextField tEndASFUnits = new JTextField(4);
    JLabel lblSmallCraftBays = new JLabel(Messages.getString("MekSelectorDialog.Search.SmallCraftBays"));
    JTextField tStartSmallCraftBays = new JTextField(4);
    JTextField tEndSmallCraftBays = new JTextField(4);
    JLabel lblSmallCraftDoors = new JLabel(Messages.getString("MekSelectorDialog.Search.Doors"));
    JTextField tStartSmallCraftDoors = new JTextField(4);
    JTextField tEndSmallCraftDoors = new JTextField(4);
    JLabel lblSmallCraftUnits = new JLabel(Messages.getString("MekSelectorDialog.Search.Units"));
    JTextField tStartSmallCraftUnits = new JTextField(4);
    JTextField tEndSmallCraftUnits = new JTextField(4);
    JLabel lblMekBays = new JLabel(Messages.getString("MekSelectorDialog.Search.MekBays"));
    JTextField tStartMekBays = new JTextField(4);
    JTextField tEndMekBays = new JTextField(4);
    JLabel lblMekDoors = new JLabel(Messages.getString("MekSelectorDialog.Search.Doors"));
    JTextField tStartMekDoors = new JTextField(4);
    JTextField tEndMekDoors = new JTextField(4);
    JLabel lblMekUnits = new JLabel(Messages.getString("MekSelectorDialog.Search.Units"));
    JTextField tStartMekUnits = new JTextField(4);
    JTextField tEndMekUnits = new JTextField(4);
    JLabel lblHeavyVehicleBays = new JLabel(Messages.getString("MekSelectorDialog.Search.HeavyVehicleBays"));
    JTextField tStartHeavyVehicleBays = new JTextField(4);
    JTextField tEndHeavyVehicleBays = new JTextField(4);
    JLabel lblHeavyVehicleDoors = new JLabel(Messages.getString("MekSelectorDialog.Search.Doors"));
    JTextField tStartHeavyVehicleDoors = new JTextField(4);
    JTextField tEndHeavyVehicleDoors = new JTextField(4);
    JLabel lblHeavyVehicleUnits = new JLabel(Messages.getString("MekSelectorDialog.Search.Units"));
    JTextField tStartHeavyVehicleUnits = new JTextField(4);
    JTextField tEndHeavyVehicleUnits = new JTextField(4);
    JLabel lblLightVehicleBays = new JLabel(Messages.getString("MekSelectorDialog.Search.LightVehicleBays"));
    JTextField tStartLightVehicleBays = new JTextField(4);
    JTextField tEndLightVehicleBays = new JTextField(4);
    JLabel lblLightVehicleDoors = new JLabel(Messages.getString("MekSelectorDialog.Search.Doors"));
    JTextField tStartLightVehicleDoors = new JTextField(4);
    JTextField tEndLightVehicleDoors = new JTextField(4);
    JLabel lblLightVehicleUnits = new JLabel(Messages.getString("MekSelectorDialog.Search.Units"));
    JTextField tStartLightVehicleUnits = new JTextField(4);
    JTextField tEndLightVehicleUnits = new JTextField(4);
    JLabel lblProtomekBays = new JLabel(Messages.getString("MekSelectorDialog.Search.ProtomekBays"));
    JTextField tStartProtomekBays = new JTextField(4);
    JTextField tEndProtomekBays = new JTextField(4);
    JLabel lblProtomekDoors = new JLabel(Messages.getString("MekSelectorDialog.Search.Doors"));
    JTextField tStartProtomekDoors = new JTextField(4);
    JTextField tEndProtomekDoors = new JTextField(4);
    JLabel lblProtomekUnits = new JLabel(Messages.getString("MekSelectorDialog.Search.Units"));
    JTextField tStartProtomekUnits = new JTextField(4);
    JTextField tEndProtomekUnits = new JTextField(4);
    JLabel lblBattleArmorBays = new JLabel(Messages.getString("MekSelectorDialog.Search.BattleArmorBays"));
    JTextField tStartBattleArmorBays = new JTextField(4);
    JTextField tEndBattleArmorBays = new JTextField(4);
    JLabel lblBattleArmorDoors = new JLabel(Messages.getString("MekSelectorDialog.Search.Doors"));
    JTextField tStartBattleArmorDoors = new JTextField(4);
    JTextField tEndBattleArmorDoors = new JTextField(4);
    JLabel lblBattleArmorUnits = new JLabel(Messages.getString("MekSelectorDialog.Search.Units"));
    JTextField tStartBattleArmorUnits = new JTextField(4);
    JTextField tEndBattleArmorUnits = new JTextField(4);
    JLabel lblInfantryBays = new JLabel(Messages.getString("MekSelectorDialog.Search.InfantryBays"));
    JTextField tStartInfantryBays = new JTextField(4);
    JTextField tEndInfantryBays = new JTextField(4);
    JLabel lblInfantryDoors = new JLabel(Messages.getString("MekSelectorDialog.Search.Doors"));
    JTextField tStartInfantryDoors = new JTextField(4);
    JTextField tEndInfantryDoors = new JTextField(4);
    JLabel lblInfantryUnits = new JLabel(Messages.getString("MekSelectorDialog.Search.Units"));
    JTextField tStartInfantryUnits = new JTextField(4);
    JTextField tEndInfantryUnits = new JTextField(4);
    JLabel lblSuperHeavyVehicleBays = new JLabel(Messages.getString("MekSelectorDialog.Search.SuperHeavyVehicleBays"));
    JTextField tStartSuperHeavyVehicleBays = new JTextField(4);
    JTextField tEndSuperHeavyVehicleBays = new JTextField(4);
    JLabel lblSuperHeavyVehicleDoors = new JLabel(Messages.getString("MekSelectorDialog.Search.Doors"));
    JTextField tStartSuperHeavyVehicleDoors = new JTextField(4);
    JTextField tEndSuperHeavyVehicleDoors = new JTextField(4);
    JLabel lblSuperHeavyVehicleUnits = new JLabel(Messages.getString("MekSelectorDialog.Search.Units"));
    JTextField tStartSuperHeavyVehicleUnits = new JTextField(4);
    JTextField tEndSuperHeavyVehicleUnits = new JTextField(4);
    JLabel lblDropshuttleBays = new JLabel(Messages.getString("MekSelectorDialog.Search.DropshuttleBays"));
    JTextField tStartDropshuttleBays = new JTextField(4);
    JTextField tEndDropshuttleBays = new JTextField(4);
    JLabel lblDropshuttleDoors = new JLabel(Messages.getString("MekSelectorDialog.Search.Doors"));
    JTextField tStartDropshuttleDoors = new JTextField(4);
    JTextField tEndDropshuttleDoors = new JTextField(4);
    JLabel lblDropshuttleUnits = new JLabel(Messages.getString("MekSelectorDialog.Search.Units"));
    JTextField tStartDropshuttleUnits = new JTextField(4);
    JTextField tEndDropshuttleUnits = new JTextField(4);
    JLabel lblDockingCollars = new JLabel(Messages.getString("MekSelectorDialog.Search.DockingCollars"));
    JTextField tStartDockingCollars = new JTextField(4);
    JTextField tEndDockingCollars = new JTextField(4);
    JLabel lblBattleArmorHandles = new JLabel(Messages.getString("MekSelectorDialog.Search.BattleArmorHandles"));
    JTextField tStartBattleArmorHandles = new JTextField(4);
    JTextField tEndBattleArmorHandles = new JTextField(4);
    JLabel lblCargoBayUnits = new JLabel(Messages.getString("MekSelectorDialog.Search.CargoBayUnits"));
    JTextField tStartCargoBayUnits = new JTextField(4);
    JTextField tEndCargoBayUnits = new JTextField(4);
    JLabel lblNavalRepairFacilities = new JLabel(Messages.getString("MekSelectorDialog.Search.NavalRepairFacilities"));
    JTextField tStartNavalRepairFacilities = new JTextField(4);
    JTextField tEndNavalRepairFacilities = new JTextField(4);

    TransportsSearchTab(ActionListener listener) {
        btnTransportsClear.addActionListener(listener);

        GridBagConstraints c = new GridBagConstraints();
        setLayout(new GridBagLayout());

        c.weighty = 0;
        c.anchor = GridBagConstraints.NORTHWEST;
        c.fill = GridBagConstraints.NONE;
        c.insets = new Insets(20, 10, 0, 0);

        c.gridwidth  = 1;
        c.gridx = 0; c.gridy++;
        JPanel mbPanel = new JPanel();
        mbPanel.add(lblMekBays);
        mbPanel.add(tStartMekBays);
        mbPanel.add(new JLabel("-"));
        mbPanel.add(tEndMekBays);
        mbPanel.add(lblMekDoors);
        mbPanel.add(tStartMekDoors);
        mbPanel.add(new JLabel("-"));
        mbPanel.add(tEndMekDoors);
        mbPanel.add(lblMekUnits);
        mbPanel.add(tStartMekUnits);
        mbPanel.add(new JLabel("-"));
        mbPanel.add(tEndMekUnits);
        add(mbPanel, c);
        c.insets = new Insets(5, 10, 0, 0);
        c.gridx = 0; c.gridy++;
        JPanel abPanel = new JPanel();
        abPanel.add(lblASFBays);
        abPanel.add(tStartASFBays);
        abPanel.add(new JLabel("-"));
        abPanel.add(tEndASFBays);
        abPanel.add(lblASFDoors);
        abPanel.add(tStartASFDoors);
        abPanel.add(new JLabel("-"));
        abPanel.add(tEndASFDoors);
        abPanel.add(lblASFUnits);
        abPanel.add(tStartASFUnits);
        abPanel.add(new JLabel("-"));
        abPanel.add(tEndASFUnits);
        add(abPanel, c);
        c.gridx = 0; c.gridy++;
        JPanel scbPanel = new JPanel();
        scbPanel.add(lblSmallCraftBays);
        scbPanel.add(tStartSmallCraftBays);
        scbPanel.add(new JLabel("-"));
        scbPanel.add(tEndSmallCraftBays);
        scbPanel.add(lblSmallCraftDoors);
        scbPanel.add(tStartSmallCraftDoors);
        scbPanel.add(new JLabel("-"));
        scbPanel.add(tEndSmallCraftDoors);
        scbPanel.add(lblSmallCraftUnits);
        scbPanel.add(tStartSmallCraftUnits);
        scbPanel.add(new JLabel("-"));
        scbPanel.add(tEndSmallCraftUnits);
        add(scbPanel, c);
        c.gridx = 0; c.gridy++;
        JPanel dPanel = new JPanel();
        dPanel.add(lblDropshuttleBays);
        dPanel.add(tStartDropshuttleBays);
        dPanel.add(new JLabel("-"));
        dPanel.add(tEndDropshuttleBays);
        dPanel.add(lblDropshuttleDoors);
        dPanel.add(tStartDropshuttleDoors);
        dPanel.add(new JLabel("-"));
        dPanel.add(tEndDropshuttleDoors);
        dPanel.add(lblDropshuttleUnits);
        dPanel.add(tStartDropshuttleUnits);
        dPanel.add(new JLabel("-"));
        dPanel.add(tEndDropshuttleUnits);
        add(dPanel, c);
        c.gridx = 0; c.gridy++;
        JPanel lvPanel = new JPanel();
        lvPanel.add(lblLightVehicleBays);
        lvPanel.add(tStartLightVehicleBays);
        lvPanel.add(new JLabel("-"));
        lvPanel.add(tEndLightVehicleBays);
        lvPanel.add(lblLightVehicleDoors);
        lvPanel.add(tStartLightVehicleDoors);
        lvPanel.add(new JLabel("-"));
        lvPanel.add(tEndLightVehicleDoors);
        lvPanel.add(lblLightVehicleUnits);
        lvPanel.add(tStartLightVehicleUnits);
        lvPanel.add(new JLabel("-"));
        lvPanel.add(tEndLightVehicleUnits);
        add(lvPanel, c);
        c.gridx = 0; c.gridy++;
        JPanel hvPanel = new JPanel();
        hvPanel.add(lblHeavyVehicleBays);
        hvPanel.add(tStartHeavyVehicleBays);
        hvPanel.add(new JLabel("-"));
        hvPanel.add(tEndHeavyVehicleBays);
        hvPanel.add(lblHeavyVehicleDoors);
        hvPanel.add(tStartHeavyVehicleDoors);
        hvPanel.add(new JLabel("-"));
        hvPanel.add(tEndHeavyVehicleDoors);
        hvPanel.add(lblHeavyVehicleUnits);
        hvPanel.add(tStartHeavyVehicleUnits);
        hvPanel.add(new JLabel("-"));
        hvPanel.add(tEndHeavyVehicleUnits);
        add(hvPanel, c);
        c.gridx = 0; c.gridy++;
        JPanel shvPanel = new JPanel();
        shvPanel.add(lblSuperHeavyVehicleBays);
        shvPanel.add(tStartSuperHeavyVehicleBays);
        shvPanel.add(new JLabel("-"));
        shvPanel.add(tEndSuperHeavyVehicleBays);
        shvPanel.add(lblSuperHeavyVehicleDoors);
        shvPanel.add(tStartSuperHeavyVehicleDoors);
        shvPanel.add(new JLabel("-"));
        shvPanel.add(tEndSuperHeavyVehicleDoors);
        shvPanel.add(lblSuperHeavyVehicleUnits);
        shvPanel.add(tStartSuperHeavyVehicleUnits);
        shvPanel.add(new JLabel("-"));
        shvPanel.add(tEndSuperHeavyVehicleUnits);
        add(shvPanel, c);
        c.gridx = 0; c.gridy++;
        JPanel pmPanel = new JPanel();
        pmPanel.add(lblProtomekBays);
        pmPanel.add(tStartProtomekBays);
        pmPanel.add(new JLabel("-"));
        pmPanel.add(tEndProtomekBays);
        pmPanel.add(lblProtomekDoors);
        pmPanel.add(tStartProtomekDoors);
        pmPanel.add(new JLabel("-"));
        pmPanel.add(tEndProtomekDoors);
        pmPanel.add(lblProtomekUnits);
        pmPanel.add(tStartProtomekUnits);
        pmPanel.add(new JLabel("-"));
        pmPanel.add(tEndProtomekUnits);
        add(pmPanel, c);
        c.gridx = 0; c.gridy++;
        JPanel baPanel = new JPanel();
        baPanel.add(lblBattleArmorBays);
        baPanel.add(tStartBattleArmorBays);
        baPanel.add(new JLabel("-"));
        baPanel.add(tEndBattleArmorBays);
        baPanel.add(lblBattleArmorDoors);
        baPanel.add(tStartBattleArmorDoors);
        baPanel.add(new JLabel("-"));
        baPanel.add(tEndBattleArmorDoors);
        baPanel.add(lblBattleArmorUnits);
        baPanel.add(tStartBattleArmorUnits);
        baPanel.add(new JLabel("-"));
        baPanel.add(tEndBattleArmorUnits);
        add(baPanel, c);
        c.gridx = 0; c.gridy++;
        JPanel iPanel = new JPanel();
        iPanel.add(lblInfantryBays);
        iPanel.add(tStartInfantryBays);
        iPanel.add(new JLabel("-"));
        iPanel.add(tEndInfantryBays);
        iPanel.add(lblInfantryDoors);
        iPanel.add(tStartInfantryDoors);
        iPanel.add(new JLabel("-"));
        iPanel.add(tEndInfantryDoors);
        iPanel.add(lblInfantryUnits);
        iPanel.add(tStartInfantryUnits);
        iPanel.add(new JLabel("-"));
        iPanel.add(tEndInfantryUnits);
        add(iPanel, c);
        c.gridx = 0; c.gridy++;
        JPanel dcPanel = new JPanel();
        dcPanel.add(lblDockingCollars);
        dcPanel.add(tStartDockingCollars);
        dcPanel.add(new JLabel("-"));
        dcPanel.add(tEndDockingCollars);
        add(dcPanel, c);
        c.gridx = 0; c.gridy++;
        JPanel tsPanel = new JPanel();
        tsPanel.add(lblTroopSpace);
        tsPanel.add(tStartTroopSpace);
        tsPanel.add(new JLabel("-"));
        tsPanel.add(tEndTroopSpace);
        add(tsPanel, c);
        c.gridx = 0; c.gridy++;
        JPanel cbPanel = new JPanel();
        cbPanel.add(lblCargoBayUnits);
        cbPanel.add(tStartCargoBayUnits);
        cbPanel.add(new JLabel("-"));
        cbPanel.add(tEndCargoBayUnits);
        add(cbPanel, c);
        c.gridx = 0; c.gridy++;
        JPanel nrfPanel = new JPanel();
        nrfPanel.add(lblNavalRepairFacilities);
        nrfPanel.add(tStartNavalRepairFacilities);
        nrfPanel.add(new JLabel("-"));
        nrfPanel.add(tEndNavalRepairFacilities);
        add(nrfPanel, c);
        c.gridx = 0; c.gridy++;
        JPanel bahPanel = new JPanel();
        bahPanel.add(lblBattleArmorHandles);
        bahPanel.add(tStartBattleArmorHandles);
        bahPanel.add(new JLabel("-"));
        bahPanel.add(tEndBattleArmorHandles);
        add(bahPanel, c);

        c.weighty = 1;
        JPanel blankPanel = new JPanel();
        c.gridx = 0; c.gridy++;
        blankPanel.add(btnTransportsClear, c);
        add(blankPanel, c);
    }

    void clearTransports() {
        tStartTroopSpace.setText("");
        tEndTroopSpace.setText("");
        tStartASFBays.setText("");
        tEndASFBays.setText("");
        tStartASFDoors.setText("");
        tEndASFDoors.setText("");
        tStartASFUnits.setText("");
        tEndASFUnits.setText("");
        tStartSmallCraftBays.setText("");
        tEndSmallCraftBays.setText("");
        tStartSmallCraftDoors.setText("");
        tEndSmallCraftDoors.setText("");
        tStartSmallCraftUnits.setText("");
        tEndSmallCraftUnits.setText("");
        tStartMekBays.setText("");
        tEndMekBays.setText("");
        tStartMekDoors.setText("");
        tEndMekDoors.setText("");
        tStartMekUnits.setText("");
        tEndMekUnits.setText("");
        tStartHeavyVehicleBays.setText("");
        tEndHeavyVehicleBays.setText("");
        tStartHeavyVehicleDoors.setText("");
        tEndHeavyVehicleDoors.setText("");
        tStartHeavyVehicleUnits.setText("");
        tEndHeavyVehicleUnits.setText("");
        tStartLightVehicleBays.setText("");
        tEndLightVehicleBays.setText("");
        tStartLightVehicleDoors.setText("");
        tEndLightVehicleDoors.setText("");
        tStartLightVehicleUnits.setText("");
        tEndLightVehicleUnits.setText("");
        tStartProtomekBays.setText("");
        tEndProtomekBays.setText("");
        tStartProtomekDoors.setText("");
        tEndProtomekDoors.setText("");
        tStartProtomekUnits.setText("");
        tEndProtomekUnits.setText("");
        tStartBattleArmorBays.setText("");
        tEndBattleArmorBays.setText("");
        tStartBattleArmorDoors.setText("");
        tEndBattleArmorDoors.setText("");
        tStartBattleArmorUnits.setText("");
        tEndBattleArmorUnits.setText("");
        tStartInfantryBays.setText("");
        tEndInfantryBays.setText("");
        tStartInfantryDoors.setText("");
        tEndInfantryDoors.setText("");
        tStartInfantryUnits.setText("");
        tEndInfantryUnits.setText("");
        tStartSuperHeavyVehicleBays.setText("");
        tEndSuperHeavyVehicleBays.setText("");
        tStartSuperHeavyVehicleDoors.setText("");
        tEndSuperHeavyVehicleDoors.setText("");
        tStartSuperHeavyVehicleUnits.setText("");
        tEndSuperHeavyVehicleUnits.setText("");
        tStartDropshuttleBays.setText("");
        tEndDropshuttleBays.setText("");
        tStartDropshuttleDoors.setText("");
        tEndDropshuttleDoors.setText("");
        tStartDropshuttleUnits.setText("");
        tEndDropshuttleUnits.setText("");
        tStartDockingCollars.setText("");
        tEndDockingCollars.setText("");
        tStartBattleArmorHandles.setText("");
        tEndBattleArmorHandles.setText("");
        tStartCargoBayUnits.setText("");
        tEndCargoBayUnits.setText("");
        tStartNavalRepairFacilities.setText("");
        tEndNavalRepairFacilities.setText("");
    }
}
