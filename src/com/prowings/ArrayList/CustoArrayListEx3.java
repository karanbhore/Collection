package com.prowings.ArrayList;

import java.util.ArrayList;

public class CustoArrayListEx3 {

	int size = 6;

	class Subject {

		String name;
		int duration;
		String faculty;
		double fees;
		String time;

		public Subject() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Subject(String name, int duration, String faculty, double fees, String time) {
			super();
			this.name = name;
			this.duration = duration;
			this.faculty = faculty;
			this.fees = fees;
			this.time = time;
		}
	}

	public static void main(String[] args) {
		String[] name = { "java", "python", "C", "C++", "AWS", "SQL" };

		int[] duration = { 1, 1, 1, 1, 1, 1 };

		String[] faculty = { "RamSir", "ShamSir", "MohitSir", "AbhiSir", "ShubhamSir", "MukundSir" };

		double[] fees = { 50000d, 50000d, 40000d, 40000d, 70000d, 30000d };

		String[] time = { "7.30 to 8.30", "9 to 10", "10.30 to 11.30", "12 to 1", "1 to 2", "2.30 to 3.30" };

		CustoArrayListEx3 obj = new CustoArrayListEx3();
		obj.addSubjectsData(name, duration, faculty, fees, time);

	}

	private void addSubjectsData(String[] name, int[] duration, String[] faculty, double[] fees, String[] time) {

		ArrayList<Subject> l = new ArrayList<>();

		for (int i = 0; i < size; i++) {
			l.add(new Subject(name[i], duration[i], faculty[i], fees[i], time[i]));
		}

		display(l);

	}

	private void display(ArrayList<Subject> l) {

		System.out.println("SubjectNames " + "   duration     " + "  faculty          " + "  fees   " + "  time   ");

		System.out.println("_______________________________________________________________________________");

		for (int i = 0; i < size; i++) {
			Subject subject = l.get(i);

			System.out.println(subject.name + "           " + "  " + subject.duration + "      " + "      "
					+ subject.faculty + "      " + "       " + subject.fees + "      " + "       " + subject.time);

		}

	}

}
