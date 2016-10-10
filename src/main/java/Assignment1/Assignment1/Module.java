package Assignment1.Assignment1;

public class Module {
	private String moduleName;
	private String id;
	private Student studentList[];
	
	public Module(String moduleName, String id, Student studentList[]){
		this.moduleName = moduleName;
		this.id = id;
		this.studentList= studentList;
	}
	
	public String getModuleName(){
		return moduleName;
	}
	
	public void setModuleName(String ModuleName){
		ModuleName = moduleName;
	}
	
	public String getID(){
		return  id;
	}
	public void setID(String moduleID){
		moduleID = id;
	}
	
	public Student[] getStudentList(){
		return studentList;
	}
	public void setStudentList(Student StudentList[]){
		StudentList = studentList;
	}
}
