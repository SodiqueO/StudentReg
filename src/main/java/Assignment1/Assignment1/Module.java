package Assignment1.Assignment1;

public class Module {
	private String moduleName;
	private String ID;
	private Student studentList[];
	
	public Module(String moduleName, String ID, Student studentList[]){
		this.moduleName = moduleName;
		this.ID = ID;
		this.studentList= studentList;
	}
	
	public String getModuleName(){
		return moduleName;
	}
	
	public void setModuleName(String ModuleName){
		ModuleName = moduleName;
	}
	
	public String getID(){
		return  ID;
	}
	public void setID(String moduleID){
		moduleID = ID;
	}
	
	public Student[] getStudentList(){
		return studentList;
	}
	public void setStudentList(Student StudentList[]){
		StudentList = studentList;
	}
}
