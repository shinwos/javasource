package sec06.exam02_reflection;

import java.lang.reflect.Constructor; //이 친구들은 뭘까?
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {

	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("sec06.exam02_reflection.Car");
		System.out.println("클래스 이름");
		System.out.println(clazz.getName());
		System.out.println();

		System.out.println("생성자 정보");
		Constructor[] constructors = clazz.getDeclaredConstructors(); // 생성자를 각각 constructor 객체로 만들어서 배열로 리턴
		for (Constructor constructor : constructors) {
			System.out.print(constructor.getName() + "(");
			Class[] parameters = constructor.getParameterTypes(); // 매개변수의 클래스 객체들을 배열로 리턴
			printParameters(parameters);
			System.out.println(")");
		}
		System.out.println();

		System.out.println("필드 정보");
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.getType().getSimpleName() + " " + field.getName());
		}
		System.out.println();

		System.out.println("메소드 정보");
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			System.out.print(method.getReturnType().getSimpleName() + " ");
			System.out.print(method.getName() + "(");
			Class[] parameters = method.getParameterTypes();// 매개변수의 클래스 객체들을 배열로 리턴
			printParameters(parameters);
			System.out.println(")");
		}

	}

	private static void printParameters(Class[] parameters) {
		for (int i = 0; i < parameters.length; i++) {
			System.out.print(parameters[i].getName());
			if (i < (parameters.length - 1)) {
				System.out.print(",");
			}
		}
	}
}
