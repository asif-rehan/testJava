/**
 * 
 */
package testJava;

/**
 * @author Asif Rehan
 *
 */
public class Student {

	/**
	 * 
	 */
	public static Integer numStudent = 0;
	@SuppressWarnings("unused")
	private String name;
	@SuppressWarnings("unused")
	private Integer id;
	public Student(Integer id, String name) {
		this.id = id;
		this.name = name;
		numStudent = numStudent + 1;
	}

	public static void main(String[] args) {
		for (Integer i = 0; i < 10; i++) {
			Student s = new Student(i,"student#"+ i.toString());
		}
	System.out.println("Numbr of Student:"+numStudent.toString());
	}
	
}
