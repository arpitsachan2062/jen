package sample;
import java.util.*;
public class sam {
int studId;
String name;
String adress;
int phone;
class onlineTraining {
int duration;
int onlinemarks;
void getData() {
duration = 2;
onlinemarks = 70;
studId = 007; name = "arpit";
adress = " noida"; phone = 12342;
}
void showData() {
System.out.println("name: " + name);
System.out.println("addres: " + adress);
System.out.println("phone: " + phone);
System.out.println("studentid; " + studId);
System.out.println("duration " + duration + " hours " + "and " + onlinemarks + "marks");
}
}
class offlineTraning {
boolean booleanSystemAllocation; int offlineMarks;
void input() {
studId = 345; name = "arpit";
adress = " noida"; phone = 12342;
booleanSystemAllocation = true; offlineMarks = 95;
}
void display() {
System.out.println("name: " + name);
System.out.println("addres: " + adress);
System.out.println("phone: " + phone);
System.out.println("studentid; " + studId);
System.out.println("onlinemarks: " + offlineMarks + " correct computer: " +
booleanSystemAllocation);
}
}
public class innerloop {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
sam t = new sam();
sam.onlineTraining o = t.new onlineTraining();
sam.offlineTraning f = t.new offlineTraning();
System.out.println("enter 1 for online classes details");
System.out.println("enetr 2 for offline classes details");
int choice = sc.nextInt();
if (choice == 1) {
o.getData();
o.showData();
} else {
f.input();
f.display();
}
}
}
}