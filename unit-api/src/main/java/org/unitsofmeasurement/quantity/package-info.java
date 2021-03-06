/**
 * Unit-API - Units of Measurement API for Java (http://unitsofmeasurement.org)
 * Copyright (c) 2005-2010, Unit-API contributors, JScience and others
 * All rights reserved.
 *
 * See LICENSE.txt for details.
 */


/**
 * Provides quantitative properties such as mass, time, distance, heat, and angular separation.
 * Quantities of different kinds are represented by sub-types of the
 * {@link org.unitsofmeasurement.quantity.Quantity} interface.
 * This package provides sub-types for the quantities defined in the
 * <a href="http://en.wikipedia.org/wiki/International_System_of_Units">International System of Units</a>
 * (SI), together with a few non-SI quantities. Users can create their own quantity types by extending the
 * {@link org.unitsofmeasurement.quantity.Quantity Quantity} interface.
 *
 * <p>This package supports <cite>measurable</cite> quantities, which can be expressed
 * as ({@link java.lang.Number}, {@link org.unitsofmeasurement.unit.Unit}) tuples.
 * Those tuples are not expected to be used directly in numerically intensive code.
 * They are more useful as metadata converted to the application internal representation
 * (for example {@code double} primitive type with the requirement to provide values in metres)
 * before computation begins.</p>
 *
 * <p>Quantities sub-types are also used as parameterized type to characterize
 * generic classes and provide additional compile time check. This technic is
 * used extensively by the {@link org.unitsofmeasurement.unit.Unit} interface,
 * but users can apply the same approach to their own classes. In the example
 * below, {@code Sensor} and {@code Vector3D} are user-defined classes:</p>
 *
 * [code]
 *    // A general-purpose Sensor class used for temperature measurements:
 *    Sensor<Temperature> sensor ...;
 *    Temperature temp = sensor.getValue();
 *
 *    // Velocity vector (a vector of speeds) in a three-dimensional space.
 *    Unit<Speed> = metrePerSecond = METRE.divide(SECOND);
 *    Vector3D<Speed> aircraftSpeed = new Vector3D(200.0, 50.0, -0.5, metrePerSecond);
 * [/code]
 *
 * <b>Definition of terms</b><br>
 * This package adopts the definitions provided by the
 * <a href="http://www.bipm.org/utils/common/documents/jcgm/JCGM_200_2012.pdf">International
 * vocabulary of metrology</a>, with some adaptations:
 * <p>
 * <ul>
 *   <li><b>Quantity:</b> property of a phenomenon, body, or substance, where the property
 *       has a magnitude that can be expressed as a number and a unit.</li>
 *   <li><b>Kind of quantity:</b> aspect common to mutually comparable quantities.</li>
 * </ul>
 *
 * @author <a href="mailto:jean-marie@dautelle.com">Jean-Marie Dautelle</a>
 * @author <a href="mailto:units@catmedia.us">Werner Keil</a>
 * @version 2.2
 *
 * @see org.unitsofmeasurement.quantity.Quantity
 * @see <a href="http://www.bipm.org/utils/common/documents/jcgm/JCGM_200_2012.pdf">International vocabulary of metrology</a>
 *
 * @since 0.6.0
 */
package org.unitsofmeasurement.quantity;
