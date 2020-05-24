/**
 * Copyright (c) 2010-2020 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.yeelight.internal.handler;

import org.eclipse.smarthome.core.library.types.OnOffType;
import org.eclipse.smarthome.core.thing.Thing;
import org.openhab.binding.yeelight.internal.YeelightBindingConstants;
import org.openhab.binding.yeelight.internal.lib.device.DeviceStatus;
import org.openhab.binding.yeelight.internal.lib.enums.ActiveMode;

/**
 * The {@link YeelightCeilingWithNightHandler} is responsible for handling commands, which are
 * sent to one of the channels.
 *
 * @author Nikita Pogudalov - Initial contribution
 */
public class YeelightCeilingWithNightHandler extends YeelightCeilingHandler {

    public YeelightCeilingWithNightHandler(Thing thing) {
        super(thing);
    }

    @Override
    protected void updateUI(DeviceStatus status) {
        super.updateUI(status);

        updateState(YeelightBindingConstants.CHANNEL_NIGHTLIGHT,
                (status.getActiveMode() == ActiveMode.MOONLIGHT_MODE) ? OnOffType.ON : OnOffType.OFF);
    }
}
