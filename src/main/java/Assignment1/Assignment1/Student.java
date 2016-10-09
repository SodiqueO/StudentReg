package Assignment1.Assignment1;

public class Student {
	private static String name;
	private static int age;
	private int idNo;
	private String dOb;
	
	public Student(String name, String DOB, int age, int idNo){
		this.age = age;
		this.name = name;
		this.idNo = idNo;
		this.dOb = DOB;
	}
	public int getAge(){
		return age;
	}	
	public void setAge(int Age){
		this.age=Age;
	}	
	public String getName(){
		return name;
	}
	public void setName(String Name){
		this.name=Name;
	}
	public static String getUsername(){
		return (name + age);
	}
}