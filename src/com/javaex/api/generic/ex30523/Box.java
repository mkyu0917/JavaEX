package com.javaex.api.generic.ex30523;

// Generic �̿�

public class Box<K, V> { 
		K key;
		V content;
		
		public V getContent() {// ���ϰ��� ������������ ����
			return content;
		}
		public void setContent(V content) { // �޾ƿ��� ���� �ܺο��� ������ ������ �޾ƿ�.
			this.content = content;
		}
		
		public K getKey() {
			return key;
		}
		public void setKey(K key) {
			this.key = key;
		}
		
}
