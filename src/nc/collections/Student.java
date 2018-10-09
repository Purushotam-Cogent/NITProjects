package nc.collections;

public class Student implements Comparable<Student>{
public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

private int age;
private String name;

public Student()
{
	
}

public Student(int age,String name)
{
	this.age=age;
	this.name=name;
}

@Override
public String toString() {
	return "Student [age=" + age + ", name=" + name + "]";
}

@Override
public int compareTo(Student o) {
	if(this.getAge()>o.getAge())
		return 1;
	else if(this.getAge()<o.getAge())
	return -1;
	else
		return 0;
}


	
}
