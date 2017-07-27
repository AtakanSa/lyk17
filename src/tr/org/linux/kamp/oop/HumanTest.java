package tr.org.linux.kamp.oop;

public class HumanTest {
public static void main(String[] args) {
	Human atakan = new Human();
	Human mustafa = new Human("2","Mustafa","Erkek",10);
	atakan.name = "atakan";
	atakan.age = 22;
	
	atakan.speak();
}
}
