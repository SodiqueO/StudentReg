package Assignment1.Assignment1;


import static org.junit.Assert.assertEquals;
import org.junit.Test; 		

public class StudentTest {

	@Test
	public void test(){
			
		Student s = new Student ("Stephen", "20/03/1985", 30, 134902);
		assertEquals("Stephen30", Student.getUsername());
			System.out.println("Student is:" +Student.getUsername() );
		
		}

	
	}
