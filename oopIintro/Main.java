package oopIintro;

public class Main {

	public static void main(String[] args) {
		
		Category category1=new Category("yaz�l�m geli�tirci yeti�tirme kamplar�",1);
		category1.name="yaz�l�m geli�tirci yeti�tirme kamplar�";
		category1.Id=1;
		Category category2=new Category("programlamaya giri� temel seviye kamplar�",2);
		category2.name="programlamaya giri� temel seviye kamplar�";
		category2.Id=2;
		Course course1= new Course(1,1,"yaz�l�m geli�tirici yeti�tirme kamp� c#+ANGULAR","ENG�N DEM�ROG");
		course1.CategoryId=1;
		course1.Id=1;
		course1.Name="yaz�l�m geli�tirici yeti�tirme kamp� c#+ANGULAR";
		course1.Instructor="ENG�N DEM�ROG";
		Course course2= new Course(1,2,"yaz�l�m geli�tirici yeti�tirme kamp� java+react ","ENG�N DEM�ROG");
		course2.CategoryId=1;
		course2.Id=2;
		course2.Name="yaz�l�m geli�tirici yeti�tirme kamp� java+react ";
		course2.Instructor="ENG�N DEM�ROG";
		
		Course course3= new Course(2,3,"programlamaya giri� i�in temel kurs","ENG�N DEM�ROG");			
		course3.CategoryId=2;
		course3.Id=3;
		course3.Name="programlamaya giri� i�in temel kurs";
		course3.Instructor="ENG�N DEM�ROG";
		
		CourseManager courseManager= new CourseManager();
		courseManager.jointocourse();
		
		Course []courses= {course1,course2,course3};
		for (Course course : courses) {
			System.out.println(course.Name);
		
			
		}

	}

}
