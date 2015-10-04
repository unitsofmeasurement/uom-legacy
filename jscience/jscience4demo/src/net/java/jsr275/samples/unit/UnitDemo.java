package net.java.jsr275.samples.unit;

import org.jscience.physics.amount.*;
import javax.measure.unit.*;
import javax.measure.quantity.*;

public class UnitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unit<Velocity> kmh = SI.KILO(SI.METER).divide(NonSI.HOUR).asType(Velocity.class);
//		Unit<Velocity> kmh2 = SI.KILO(SI.METER).times(NonSI.HOUR).asType(Velocity.class);
		Unit<?> kmh3 = SI.KILO(SI.METER).times(NonSI.HOUR);
		
		System.out.println(kmh);
//		System.out.println(kmh2);
		System.out.println(kmh3);
		
		Unit<Mass> meg = SI.MEGA(SI.GRAM);
		System.out.println(meg);
		
//		Unit<Dimensionless> d = SI.METER.asType(Dimensionless.class);
//		System.out.println(d);
		
		Amount<Duration> hours = Amount.valueOf(2, NonSI.HOUR);
		System.out.println(hours);
		
//		UnitFormat.getInstance().alias(NonSI.HOUR, "hours");
		UnitFormat.getInstance().label(NonSI.HOUR, "hours");
		System.out.println(hours);
	}

}
