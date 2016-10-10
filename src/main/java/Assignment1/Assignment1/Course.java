package Assignment1.Assignment1;


import org.joda.time.LocalDate;


public class Course {
	private String courseName;
	private LocalDate start;
	private LocalDate end;
	private Module modules[];
	
	public Course(String courseName, Module modules[], LocalDate start, LocalDate end ){
		this.courseName = courseName;
		this.modules = modules;
		this.start = start;
		this.end = end;
	}
	
	public String getCourseName(){
		return courseName;
	}
	
	public void setCourseName(String CourseName){
		CourseName = courseName;
	}
	
	public LocalDate getStartDate(){
		return start;
	}
	public void setStartDate(LocalDate StartDate){
		StartDate = start;
	}
	
	public LocalDate getEndDate(){
		return end;
	}
	public void setEndDate(LocalDate EndDate){
		EndDate = end;
	}
	
	public Module[] getModules(){
		return modules;
	}
	
	public void setModules(Module ModuleList[]){
		ModuleList = modules;
	}
}