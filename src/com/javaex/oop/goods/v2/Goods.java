package com.javaex.oop.goods.v2;

public class Goods {
	//�ʵ� ���� //private �� �����ڸ� �س����� ����ۿ��� �����ϰ���
	  private String name;
	  private int price;
	  
	  // �ܺ� ������ ���� getter, setter
	  
	  // Getters
	  public String getName(){
		  return name;
	  }
	  
	  public int getPrice(){
		  return price;
	  }
	  
	  //Setters
	  public void setName(String name){
		  this.name = name; // this= ���� �����ִ� name�� ���ڴ�.
	  }
	  
	  public void setPrice(int price){
		  this.price = price;
	  }
	  
	  public void showInfo() {
		  System.out.println("��ǰ��:" + name);
		  System.out.println("����:" + price);
	  }
}
