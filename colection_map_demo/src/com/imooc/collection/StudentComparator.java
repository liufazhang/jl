package com.imooc.collection;

import java.util.Comparator;
/*
 * Comparator 定义一些临时比较规则
 */
public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

}
