/**
 * Unit-API - Units of Measurement API for Java (http://unitsofmeasurement.org)
 * Copyright (c) 2005-2010, Unit-API contributors, JScience and others
 * All rights reserved.
 *
 * See LICENSE.txt for details.
 */
package org.unitsofmeasurement.quantity;


/**
 * Moment of a force.
 * The system unit for this quantity is "N.m" (Newton-Metre).
 *
 * <p><b>Note:</b> The Newton-metre ("N.m") is also a way of expressing a Joule
 * (unit of energy). However, torque is not energy. So, to avoid confusion, we
 * will use the units "N.m" for torque and not "J". This distinction occurs due
 * to the scalar nature of energy and the vector nature of torque.</p>
 *
 * @author <a href="mailto:jean-marie@dautelle.com">Jean-Marie Dautelle</a>
 * @author <a href="mailto:units@catmedia.us">Werner Keil</a>
 * @version 1.2.1
 *
 * @see Force
 * @see Length
 */
public interface Torque extends Quantity<Torque> {
}
