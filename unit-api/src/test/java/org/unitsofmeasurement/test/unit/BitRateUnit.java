/**
 * Unit-API - Units of Measurement API for Java (http://unitsofmeasurement.org)
 * Copyright (c) 2005-2011, Unit-API contributors, JScience and others
 * All rights reserved.
 *
 * See LICENSE.txt for details.
 */
package org.unitsofmeasurement.test.unit;

import org.unitsofmeasurement.quantity.InformationRate;
import org.unitsofmeasurement.unit.Unit;


/**
 * @author Werner Keil
 * @version 1.0
 */
public class BitRateUnit extends TestUnit<InformationRate> {

    public static final BitRateUnit bps = new BitRateUnit("bps", 1.0); // reference Unit
    public static final BitRateUnit REF_UNIT = bps; // reference Unit
    public static final BitRateUnit kb = new BitRateUnit("kb", 1.0e3);

    public BitRateUnit(String name2, double convF) {
        name = name2;
        multFactor = convF;
    }

    @Override
    public Unit<InformationRate> getSystemUnit() {
        return REF_UNIT;
    }
}
