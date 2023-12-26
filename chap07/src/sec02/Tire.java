package sec02;

public class Tire {

	public int maxRotation; // �ִ�ȸ����(Ÿ�̾����)
	public int accumulatedRotation; // ����ȸ����
	public String location; // Ÿ�̾��� ��ġ

	// �Ű����� 2�� ������
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	// �޼ҵ� �Ű�����x, ����Ÿ�� boolean

	public boolean roll() {
		++accumulatedRotation; // ����ȸ���� 1�� ����
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire ����: " + (maxRotation - accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + " Tire ��ũ ***");
			return false;
		}
	}
}