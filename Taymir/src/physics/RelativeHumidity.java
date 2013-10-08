/**
 * 
 */
package physics;

/**
 * ����� ������������� ���������. ������� ��������� - ���. 0 ������������ 0%, 1
 * ������������ 100%
 * 
 * @author �����
 * 
 */
public class RelativeHumidity extends SimplePhysicsValue {
	/**
	 * @param value �������� ������������� ��������� (0.0 ����� 0% � 1.0 ����� 100%)
	 */
	public RelativeHumidity(double value) {
		super(value);
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
