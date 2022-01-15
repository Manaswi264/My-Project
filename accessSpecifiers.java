package accessSpecifiers;
class defAccessSpecifier{
	void display() {
		System.out.println("you are using default  access specifier");	
	}
}
public class accessSpecifiers {
	public static void main(String[] args) {
		System.out.println("Default access specifier");
		defAccessSpecifier obj=new defAccessSpecifier();
		obj.display();
	}

}
