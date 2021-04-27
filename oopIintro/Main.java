package oopIintro;

public class Main {

	public static void main(String[] args) {
		
		Category category1=new Category("yazýlým geliþtirci yetiþtirme kamplarý",1);
		category1.name="yazýlým geliþtirci yetiþtirme kamplarý";
		category1.Id=1;
		Category category2=new Category("programlamaya giriþ temel seviye kamplarý",2);
		category2.name="programlamaya giriþ temel seviye kamplarý";
		category2.Id=2;
		Course course1= new Course(1,1,"yazýlým geliþtirici yetiþtirme kampý c#+ANGULAR","ENGÝN DEMÝROG");
		course1.CategoryId=1;
		course1.Id=1;
		course1.Name="yazýlým geliþtirici yetiþtirme kampý c#+ANGULAR";
		course1.Instructor="ENGÝN DEMÝROG";
		Course course2= new Course(1,2,"yazýlým geliþtirici yetiþtirme kampý java+react ","ENGÝN DEMÝROG");
		course2.CategoryId=1;
		course2.Id=2;
		course2.Name="yazýlým geliþtirici yetiþtirme kampý java+react ";
		course2.Instructor="ENGÝN DEMÝROG";
		
		Course course3= new Course(2,3,"programlamaya giriþ için temel kurs","ENGÝN DEMÝROG");			
		course3.CategoryId=2;
		course3.Id=3;
		course3.Name="programlamaya giriþ için temel kurs";
		course3.Instructor="ENGÝN DEMÝROG";
		
		CourseManager courseManager= new CourseManager();
		courseManager.jointocourse();
		
		Course []courses= {course1,course2,course3};
		for (Course course : courses) {
			System.out.println(course.Name);
		
			
		}

	}

}
