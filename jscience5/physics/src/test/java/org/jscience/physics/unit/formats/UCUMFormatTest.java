package org.jscience.physics.unit.formats;

import static org.junit.Assert.*;
import static org.jscience.physics.unit.system.SI.*;
import static org.jscience.physics.unit.system.UCUM.METER;

import java.io.IOException;
import java.text.ParsePosition;

import org.unitsofmeasurement.quantity.*;
import org.junit.Ignore;
import org.junit.Test;
import org.unitsofmeasurement.unit.Unit;
import org.unitsofmeasurement.unit.UnitFormat;

public class UCUMFormatTest {
	private static final ParsePosition PP0 = new ParsePosition(0);
	
	@Test
	public void testFormatUCUMPrint() {
		final UnitFormat format = UCUMFormat.getPrintInstance();
		final Appendable a = new StringBuilder();
		try {
			format.format(METRE, a);
		} catch (IOException e) {
			fail(e.getMessage());
		}
		assertEquals(METRE, METER);
		assertEquals("m", a.toString());

		final Appendable a2 = new StringBuilder();
		@SuppressWarnings("unchecked")
		Unit<Velocity> v = (Unit<Velocity>) METER.divide(SECOND);
		try {
			format.format(v, a2);
		} catch (IOException e) {
			fail(e.getMessage());
		}
		assertEquals("m/s", a2.toString());
	}

	@Test
	public void testFormatUCUMCS() {
		final UnitFormat format = UCUMFormat.getCaseSensitiveInstance();
		final Appendable a = new StringBuilder();
		try {
			format.format(METRE, a);
		} catch (IOException e) {
			fail(e.getMessage());
		}
		assertEquals(METRE, METER);
		assertEquals("m", a.toString());

		final Appendable a2 = new StringBuilder();
		@SuppressWarnings("unchecked")
		Unit<Velocity> v = (Unit<Velocity>) METER.divide(SECOND);
		try {
			format.format(v, a2);
		} catch (IOException e) {
			fail(e.getMessage());
		}
		assertEquals("m/s", a2.toString());
	}

	@Test
	public void testFormatUCUMCI() {
		final UnitFormat format = UCUMFormat.getCaseInsensitiveInstance();
		final Appendable a = new StringBuilder();
		try {
			format.format(METRE, a);
		} catch (IOException e) {
			fail(e.getMessage());
		}
		assertEquals(METRE, METER);
		assertEquals("M", a.toString());
	}

	@Test
	public void testParseUCUMCS() {
		final UnitFormat format = UCUMFormat.getCaseSensitiveInstance();
		try {
			Unit<?> u = format.parse("min", PP0);
			assertEquals(MINUTE, u);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	@Ignore
	public void testParseUCUMCI() {
		final UnitFormat format = UCUMFormat.getCaseInsensitiveInstance();
		try {
			Unit<?> u = format.parse("M", PP0);
			assertEquals(METRE, u);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
}
