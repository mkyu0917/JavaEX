package com.javaex.Practice02;

public class PracEnum2 {
	
		public static void main(String[] args){
		
			/*Today day = Today.TUESDAY; 
			
			
			if(day == Today.SATURDAY){
				System.out.println("Today is "+day);
			}else if(day == Today.MONDAY){
				System.out.println("Today is "+day);
			}else{
				System.out.println("�� �߸���");
			}
			
			//System.out.println("It\'s day: " + day);
			*/
		
			
			Name id = Name.�۽���;
			
			String name = id.name(); // �������� �̸��� ��ȯ���ִ� �޼ҵ�
			System.out.println("name(): "+name);
			
			int ord = id.ordinal();
			System.out.println("ordinal(): "+ord); //�������� ������ ��� ��ġ�� �ִ��� ex) �۽����� 2��°
			
			Name vlo = id.valueOf("�̺���");
			System.out.println("same name= "+ vlo);
			
	
			//System.out.println("�̸��� �۾��� �����? " + id);
			
			if(id==Name.�̺���){
				System.out.println("���� �� �θ�ƽ ������..."+id);
				
			}else{
				System.out.println("��û��");
			}
		
		}
}
