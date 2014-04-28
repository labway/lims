package portal;

import java.util.Date;

public class Person {
	private String name;
	private Date birthday;
	private boolean boy;
	private int age;

	public String toString() {
		return name + "|" + birthday.getTime() + "|" + boy + "|" + age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public boolean isBoy() {
		return boy;
	}

	public void setBoy(boolean boy) {
		this.boy = boy;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
