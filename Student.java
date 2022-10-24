package testforFileReading;

public class Student {

	private long id;
	private String name;
	private String surname;
	private int age;
	private long school_id;
	private String school_name;
	private String school_address;
	private String lang1_name;
	private String lang1_level;
	private String lang2_name;
	private String lang2_level;
	private String lang3_name;
	private String lang3_level;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getSchoolId() {
		return school_id;
	}

	public void setSchoolId(long school_id) {
		this.school_id = school_id;
	}

	public String getSchoolName() {
		return school_name;
	}

	public void setSchoolName(String school_name) {
		this.school_name = school_name;
	}

	public String getSchoolAddress() {
		return school_address;
	}

	public void setSchoolAddress(String school_address) {
		this.school_address = school_address;
	}

	public String getLang1_Name() {
		return lang1_name;
	}

	public void setLang1_Name(String lang1_name) {
		this.lang1_name = lang1_name;
	}

	public String getLang2_Name() {
		return lang2_name;
	}

	public void setLang2_Name(String lang2_name) {
		this.lang2_name = lang2_name;
	}

	public String getLang3_Name() {
		return lang3_name;
	}

	public void setLang3_Name(String lang3_name) {
		this.lang3_name = lang3_name;
	}

	public String getLang1_Level() {
		return lang1_level;
	}

	public void setLang1_Level(String lang1_level) {
		this.lang1_level = lang1_level;
	}

	public String getLang2_Level() {
		return lang2_level;
	}

	public void setLang2_Level(String lang2_level) {
		this.lang2_level = lang2_level;
	}

	public String getLang3_Level() {
		return lang3_level;
	}

	public void setLang3_Level(String lang3_level) {
		this.lang3_level = lang3_level;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", surname=" + surname + ", age=" + age + ", school_id="
				+ school_id + ", school_name=" + school_name + ", school_address=" + school_address + ", lang1_name="
				+ lang1_name + ", lang2_name=" + lang2_name + ", lang3_name=" + lang3_name + ", lang1_level="
				+ lang1_level + ", lang2_level=" + lang2_level + ", lang3_level=" + lang3_level + "]";
	}


	



}
