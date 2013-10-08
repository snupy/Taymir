package physics;

/**
 * ����� ����������� ������������ ��������. ������ �������� � ��������.
 * 
 * @author �����
 * 
 */
public class SaturationVaporPartialPressure extends VaporPartialPressure {

	/**
	 * @param value
	 *            �������� ����������� ������������� �������� � ��������.
	 */
	public SaturationVaporPartialPressure(double value) {
		super(value);
		// TODO Auto-generated constructor stub
	}

	/**
	 * ����� ������� ������ �������� ����������� ������������ �������� ��
	 * ��������� ������������� ��������� � ����������� ������������� ��������
	 * 
	 * @param relativeHumidity
	 *            ������������� ���������
	 * @param saturationVaporPartialPressure
	 *            ���������� ����������� ��������
	 * @return
	 */
	public static SaturationVaporPartialPressure CreateByRelativeHumidity(
			RelativeHumidity relativeHumidity,
			SaturationVaporPartialPressure saturationVaporPartialPressure) {
		return new SaturationVaporPartialPressure(relativeHumidity.getValue()
				* saturationVaporPartialPressure.getValue());
	}

}
