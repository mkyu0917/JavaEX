package com.javaex.conditional;

public class SwitchEx3 {
	public static void main(String[] args){
		// ���߿� �� �ڵ带 enum �ٽ� ���鿹���Դϴ�.
		String day = "";
		String act;
		
		switch (day){
		case "SUNDAY" :
			act = "�޽�";
			break;
		case "MONDAY" :
		case "TUESDAY" :
		case "WEDNESDAY" :
		case "THURSDAY" :
			act = "����";
			break;
		case "FRIDAY" :
			act = "������ �ұ�";
			break;
		default:
			act = "���� ���?";
		}
		System.out.println(act);
		}
	}

