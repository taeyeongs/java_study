package test.ch12.method;

public class Box<T> {
	public T t;
	
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t = t;
	}
}
