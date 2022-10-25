package testforFileReading;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import java.util.List;


public class Methods {
	public static List<Student> getStudentList() throws IOException {
		List<Student> studentList = new ArrayList<Student>();
		FileReader fr = new FileReader("E://Java-Asiman/Task_3/students.csv");
		BufferedReader br = new BufferedReader(fr);
		try {
			String line = br.readLine();
			if (line == null)
				throw new IllegalArgumentException("File is empty");
			if (!line.equals(
					"id,name,surname,age,school_id,school_name,school_address,lang1_name,lang1_level,lang2_name,lang2_level,lang3_name,lang3_level"))
				throw new IllegalArgumentException("File has wrong columns: " + line);
			while (line != null) {
				String[] rows = line.split(",");
				try {
					if (rows.length > 13)
						throw new ArrayIndexOutOfBoundsException();
					Student student = new Student();
					student.setId(Long.parseLong(rows[0]));
					student.setName(rows[1]);
					student.setSurname(rows[2]);
					student.setAge(Integer.parseInt(rows[3]));
					student.setSchoolId(Long.parseLong(rows[4]));
					student.setSchoolName(rows[5]);
					student.setSchoolAddress(rows[6]);
					student.setLang1_Name(rows[7]);
					student.setLang1_Level(rows[8]);
					student.setLang2_Name(rows[9]);
					student.setLang2_Level(rows[10]);
					student.setLang3_Name(rows[11]);
					student.setLang3_Level(rows[12]);
					studentList.add(student);
					line = br.readLine();
				} catch (ArrayIndexOutOfBoundsException | NumberFormatException | NullPointerException e) {
					System.out.println("Invalid line: ");
				}
			}

			return studentList;
		} finally {
			br.close();
		}
	}

}
