package com.javaex.api.generic.ex20523;

// Generic �̿�

public class Box<T> { //T�� �������� ���� Ÿ��, ���ο��� ����� Ÿ���� �ܺο��� �����Ѵ�.
		T content;
		
		public T getContent() {// ���ϰ��� ������������ ����
			return content;
		}
		public void setContent(T content) { // �޾ƿ��� ���� �ܺο��� ������ ������ �޾ƿ�.
			this.content = content;
		}
		
}
