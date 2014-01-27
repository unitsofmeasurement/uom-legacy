/**
 *  Unit-API - Units of Measurement API for Java
 *  Copyright 2013-2014, Jean-Marie Dautelle, Werner Keil, V2COM and individual
 *  contributors by the @author tag.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.unitsofmeasurement.impl.enums.quantity;

import org.unitsofmeasurement.impl.enums.unit.TemperatureUnit;
import org.unitsofmeasurement.impl.format.SimpleFormat;

import javax.measure.Measurement;
import javax.measure.Unit;
import javax.measure.quantity.Temperature;

/**
 * @author Werner Keil
 * @version 1.4, $Date: 2014-01-23 15:03:08 +0100 (Do, 23 Jän 2014) $
 */
public final class TemperatureQuantity extends AbstractQuantity<Temperature> implements Temperature {
    /**
	 * 
	 */
	private static final long serialVersionUID = -421330065304945228L;

	private final Double scalar; // value in reference unit

    private final Double value; // value in unit (Unit unit)

    private final TemperatureUnit unit;

//    TimeQuantity(){
//    }

    public TemperatureQuantity(Double val, TemperatureUnit un) {
        value = val;
        unit = un;
        if (val!= null && un != null) {
        	scalar = val.doubleValue() * un.getMultFactor();
        } 
        else scalar = null;        
    }

    @Override
    public boolean isZero() {
        return (value != null) && 0d==(value.doubleValue());
    }

    public TemperatureQuantity add(TemperatureQuantity d1) {
        final TemperatureQuantity dn = new TemperatureQuantity(Double.valueOf(this.value.doubleValue() + d1.value.doubleValue()),
        		this.unit);
        return dn;
    }

    public TemperatureQuantity subtract(TemperatureQuantity d1) {
    	final TemperatureQuantity dn = new TemperatureQuantity(this.value.doubleValue() - d1.value.doubleValue(), this.unit);
        return dn;
    }

    public boolean eq(TemperatureQuantity dq) {
         return dq!=null && dq.getValue().equals(getValue()) && dq.getUnit().equals(getUnit()) &&
                 dq.getScalar().equals(getScalar());
    }

    public boolean ne(TemperatureQuantity d1) {
        return ne((TemperatureQuantity) d1);
    }

    public boolean gt(TemperatureQuantity d1) {
        return gt((TemperatureQuantity) d1);
    }

    public boolean lt(TemperatureQuantity d1) {
        return lt((TemperatureQuantity) d1);
    }

    public boolean ge(TemperatureQuantity d1) {
        return ge((TemperatureQuantity)d1);
    }

    public boolean le(TemperatureQuantity d1) {
        return le((TemperatureQuantity) d1);
    }

    public TemperatureQuantity divide(Double v) {
        return new TemperatureQuantity(value.doubleValue() / v.doubleValue(), unit);
    }

    public TemperatureQuantity convert(TemperatureUnit newUnit) {
        return new TemperatureQuantity(value.doubleValue() /  newUnit.getMultFactor(), newUnit);
    }

    @Override
    public Number getScalar() {
        return scalar;
    }

    @Override
    public String toString(boolean withUnit, boolean withSpace, int precision) {
        final StringBuilder sb = new StringBuilder();
    	sb.append(getValue());
    	if(withUnit) {
        	if(withSpace) sb.append(" ");
    		sb.append(getUnit().getSymbol());
    	}
    	return sb.toString();
    }

    @Override
    public String showInUnit(Unit<?> u, int precision, SimpleFormat.Show showWith) {
        return showInUnit(u, value, precision, showWith);
    }

	@Override
	public Number getValue() {
		 return value;
	}

	@Override
	public Unit<Temperature> getUnit() {
		 return unit;
	}

	@Override
	public Measurement<Temperature, Number> add(Measurement<Temperature, Number> that) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Measurement<Temperature, Number> substract(Measurement<Temperature, Number> that) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Measurement<?, Number> multiply(Measurement<?, Number> that) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Measurement<?, Number> multiply(Number that) {
		return new TemperatureQuantity(value.doubleValue() * that.doubleValue(), unit);
	}

	@Override
	public Measurement<?, Number> divide(Measurement<?, Number> that) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Measurement<Temperature, Number> inverse() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Measurement<Temperature, Number> to(Unit<Temperature> unit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eq(AbstractQuantity<Temperature> dq) {
		 return eq((TemperatureQuantity) dq);
	}

	@Override
	public Measurement<?, Number> divide(Number that) {
		return divide((Double)that);
	}
}