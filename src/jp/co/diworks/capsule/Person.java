package jp.co.diworks.capsule;

public class Person {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	}
	
	//演習1
	private String name = null;
	private int age = 0;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//演習5 ageを読み取る、上書きする式を作成
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
