import java.util.Scanner;
class Student
{
int s1,s2,s3,s4,s5,s6,s7,s8;
public static void main(String arg[]){
int gp;
double SGPA;
double prev_sgpa;
double credits=0;
double total=0;

double sgpa=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of students:");
int Student=sc.nextInt();
System.out.println("Enter number of subjects:");
int sub=sc.nextInt();
int i=1;
while(i<=Student)
{
	total = 0;
        sgpa=0;
	System.out.println("For Student"+i+":");
	for(int j=1;j<=sub;j++){
	System.out.println("Enter subject"+j+"marks");
	int marks=sc.nextInt();
	System.out.println("Subject"+j+"Grade :");
	if(marks>=90 && marks<=100){
	System.out.println("S");
	gp=10;
	}
	else if(marks>=80){
	System.out.println("A");
	gp=9;

	}
	else if(marks>=70){
	System.out.println("B");
	gp=8;
	}
	else if(marks>=60){
	System.out.println("C");
	gp=7;
	}
	else if(marks>=50){
	System.out.println("D");
	gp=6;
	}
	else if(marks>=40){
	System.out.println("E");
	gp=5;
	}
	else {
	System.out.println("Fail");
	gp=0;
	}

System.out.println("Enter credits for subject"+i);
credits=sc.nextDouble();

sgpa=(sgpa+(credits*gp));

		total=total+credits;

	

}
	SGPA=sgpa/total;
	System.out.println("SGPA :"+SGPA);
	System.out.println("Enter previous SGPA:");
	prev_sgpa=sc.nextDouble();
	double CGPA=((prev_sgpa+SGPA)*(0.5));
	System.out.println("CGPA:"+CGPA);

i++;
	}

}
}
