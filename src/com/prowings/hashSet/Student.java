package com.prowings.hashSet;

import java.util.HashSet;
import java.util.Objects;

public class Student {

	int id;
	String name;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && this.name.equals( other.name);
	}

	public static void main(String[] args) {
		Student s1 = new Student(10, "ram");
		Student s2 = new Student(10, "ram");
		Student s3 = new Student(10, "sham");

		System.out.println(s1 == s2);
		System.out.println("<<<<<<<<<<?>>>>>>>>");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println();

		HashSet hs = new HashSet<>();
		System.out.println(hs.add(s1));
		System.out.println(hs.add(s2));
		System.out.println(hs.add(s3));

		System.out.println(hs);
		
		String s="hello";
		String ss1 = new String("hello");
		String ss2=ss1.intern();
		String ss4=s.intern();
		
		System.out.println(s==ss2);
		System.out.println(ss4==ss2);


	}

}
