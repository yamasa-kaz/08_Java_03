package jp.co.diworks.capsule;

public class Capsule {

	public static void main(String[] args) {
		//演習2
		Person taro = new Person("山田太郎", 20);
		
		//演習4
		System.out.println(taro.getName());
		
		taro.setName("花子");
		
		System.out.println(taro.getName());

		//演習5
		//System.out.println(taro.age); ageがprivateなため読み取れない
		System.out.println(taro.getAge());
		
		taro.setAge(30);
		
		System.out.println(taro.getAge());
		
	}

}
