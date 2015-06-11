import java.util.ArrayList;

public class Runner {

	Classroom classs;

	int blue = 0;

	int gold = 0;

	int red = 0;

	public String getMostCommonEyeColor() {

		ArrayList<Student> students = new ArrayList<Student>();
		// array list of students

		// students
		students.add(new Student("blue"));

		students.add(new Student("gold"));

		students.add(new Student("gold"));

		students.add(new Student("red"));

		// new class with students
		classs = new Classroom(students);

		// getting the eye color from all the students in the class
		for (Student s : classs.students) {

			// gets eye color
			String color = s.getEyeColor();

			// determines the number of different eye colors
			if (color.equals("blue")) {

				blue++;

			}
			if (color.equals("gold")) {

				gold++;

			}
			if (color.equals("red")) {

				red++;

			}
		}

		// determines which eue color is the most common
		if (gold > blue) {

			return "gold";

		} else if (blue > red) {

			return "blue";

		}

		return null;

	}

	public static void main(String[] args) {

		Runner run = new Runner();

		//prints the most common eye color
		System.out.println(run.getMostCommonEyeColor());

	}

}
