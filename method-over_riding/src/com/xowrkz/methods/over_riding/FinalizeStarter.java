package com.xowrkz.methods.over_riding;

import java.lang.reflect.Method;

public class FinalizeStarter {

	public static void main(String[] args) {

		FinalizeMethod finalize = new FinalizeMethod();

		Class clazz = finalize.getClass();
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getTypeName());
		System.out.println(clazz.getSuperclass());
		System.out.println(clazz.desiredAssertionStatus());
		System.out.println(clazz.equals(clazz));
		System.out.println(clazz.getCanonicalName());
		System.out.println(clazz.getTypeParameters());

		Method[] method = clazz.getMethods();
		System.out.println(method.clone());
		for (int i = 0; i < method.length; i++) {

			System.out.println(method.length);
			System.out.println(method);
			System.out.println(method.getClass());
			System.out.println(method.clone());
		}

	}

}
