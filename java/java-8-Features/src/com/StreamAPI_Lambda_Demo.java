package com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;

class Student {

	private int gradeYear;
	private double score;

	public Student(int gradeYear, double score) {
		super();
		this.gradeYear = gradeYear;
		this.score = score;
	}

	public int getGradeYear() {
		return gradeYear;
	}

	public void setGradeyear(int gradeyear) {
		this.gradeYear = gradeyear;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

}

public class StreamAPI_Lambda_Demo {

	public static void main(String[] args) {

		Student student1 = new Student(2006, 70.00);
		Student student2 = new Student(2005, 40.00);
		Student student3 = new Student(2007, 70.00);
		Student student4 = new Student(2006, 50.00);
		Student student5 = new Student(2006, 30.00);
		Student student6 = new Student(2006, 40.00);

		List<Student> students = new ArrayList<>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		students.add(student6);

		// ----------------------------------------------

		// way-1 ( external-iteration with mutable variables )

		// double highScore = 0; // mutable var
		// for (Student student : students) {
		// if (student.getGradeYear() == 2006) {
		// if (student.getScore() > highScore) {
		// highScore = student.getScore();
		// }
		// }
		// }
		// System.out.println(highScore);

		// ----------------------------------------------

		// way-2 ( stream API with Anonymous inner-classes)

		// double highScore=students
		// //.stream() // serial
		// .parallelStream() // parallel
		// .filter(new Predicate<Student>() {
		// @Override
		// public boolean test(Student t) {
		// return t.getGradeYear()==2006;
		// }
		// })
		// .mapToDouble(new ToDoubleFunction<Student>() {
		// @Override
		// public double applyAsDouble(Student t) {
		// return t.getScore();
		// }
		// })
		// .max()
		// .getAsDouble();
		//
		//
		// System.out.println(highScore);

		// ----------------------------------------------------------

		// way-3 ( Stream API + Lambda )

		double highScore = students
				// .stream() // serial
				.parallelStream() // parallel ( concurrent )
				.filter((t) -> t.getGradeYear() == 2006).mapToDouble((t) -> t.getScore()).max().getAsDouble();

		System.out.println(highScore);

		// ----------------------------------------------------------

		final String name = "Nag";

		Predicate<String> predicate = s -> {
			return s.length() >= name.length();
		};

		System.out.println(predicate.test("Nag"));

		// -------------------------------------------------------------

	}

}
