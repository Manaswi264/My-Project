package privateAccess;
class privateAccess{
	void display() {
		System.out.println("This is private access Specifier");
	}
}
public class privateAccessSpecifier {
	public static void main(String[] args) {
		privateAccess obj=new privateAccess();
		//if we need to access private specifiers
		obj.display();
		
	}

}
