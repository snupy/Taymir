/**
 * 
 */
package fiziki;

import utils.SimpleValue;

/**
 * ����� ��������. ������ �������� � ��������
 * 
 * @author �����
 * 
 */
public class Pressure implements SimpleValue<Double> {

	private double value;

	@Override
	public Double getValue() {
		return value;
	}

	@Override
	public Double setValue(Double value) {
		this.value = value;
		return this.value;
	}

	/**��������� ������ ��������
	 * @param value �������� �������� � ��������
	 */
	public Pressure(double value) {
		this.value = value;
	}
	
	

}
