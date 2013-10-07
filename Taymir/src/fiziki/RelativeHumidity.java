/**
 * 
 */
package fiziki;

import utils.SimpleValue;

/**
 * ����� ������������� ���������. ������� ��������� - ���. 0 ������������ 0%, 1
 * ������������ 100%
 * 
 * @author �����
 * 
 */
public class RelativeHumidity implements SimpleValue<Double> {
	private double value;

	@Override
	public Double getValue() {
		// TODO Auto-generated method stub
		return value;
	}

	@Override
	public Double setValue(Double value) {
		this.value = value;
		return this.value;
	}

	/**
	 * @param value
	 */
	public RelativeHumidity(double value) {
		this.value = value;
	}

	/**
	 * ����� �������� ������� �������� ������������� ��������� ����� �����������
	 * �������� �������� ����.
	 * 
	 * @param vaporPartialPressure
	 *            ����������� �������� �������� ����
	 * @param saturationVaporPartialPressure
	 *            ����������� �������� ���������� �������� ����
	 * @return
	 */
	public static RelativeHumidity CreateByVaporPartialPressure(
			VaporPartialPressure vaporPartialPressure,
			SaturationVaporPartialPressure saturationVaporPartialPressure) {
		return new RelativeHumidity(vaporPartialPressure.getValue()
				/ saturationVaporPartialPressure.getValue());
	}
}
