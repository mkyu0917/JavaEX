package com.javaex.collection.hash;

import java.util.HashSet;

class SimpleNum{ // Ŭ���� ����
	
		int num;
		
		public SimpleNum(int num) { //������
			this.num = num;
		}

		@Override //�������̵�
		public String toString() {
			return String.valueOf(num);
		}

		// hashCode, equals �������̵�
		
		@Override
		public boolean equals(Object obj) { // �ؽ��ڵ带 �����༭ �ѹ� �Ÿ���.
			if(obj instanceof SimpleNum) {
				SimpleNum other = (SimpleNum)obj;
				return num == other.num;
			}
			return super.equals(obj);
		}

		@Override
		public int hashCode() { // �ؽ��ڵ忡�� �Ǵ��Ͽ� �����ȿ� ���� ��� ã�°��� ���� ȿ������ �޶���
	// 		return super.hashCode();
			//return num%10; // �ؽ��ڵ尪�� 10���� ����� 10���� ������ �����Ͽ� ã��
			return num%2; //
			//return num; // �ؽ��ڵ��� ������ ���� �� ����, 
			//�ؽ��ڵ带 �����ϱ� ���ؼ� ������ ����� �־����,8��88
		}
		
		
		
}

public class HashSetEx2 {

	public static void main(String[] args) {
		HashSet<SimpleNum> hs = new HashSet<>();
		
		SimpleNum s1 = new SimpleNum(10);
		SimpleNum s2 = new SimpleNum(20); // s2, s3�� �޸� �ּҹ����� �ٸ� �ٸ� ��ü�� ����, �׷��� �츮�� �������̶� �Ǵ������� �ߺ�ó���� �ȵ�, ���� ���̶�� ���� �Ǵ��ϴ� ���� hashcode��.
		SimpleNum s3 = new SimpleNum(20);
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		System.out.println(hs);
		System.out.println(s2.equals(s3));
	}

}
