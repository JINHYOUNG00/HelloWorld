package co.edu.collection.generic;

public class Box<T> {
//	Object field; // 모든클래스의 부모클래스 Object (어떤형식이건 다 받아들)
	T field; 
	
	public void setField(T field) {
		this.field = field;
	}

	public T getField() {
		return field;
	}
	
	
}
