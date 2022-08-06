

abstract class name {
	public void  display() {
		System.out.println("my Name is naveen");
	}
	
	public abstract void LastName();
	
}

class Id extends name{
	public void  number() {
		System.out.println("my ID is 375");
	}
	
	public void  LastName() {
		System.out.println("my Last Name is Gittapata");
	}

	
	
}

public class Abstract {

	public static void main(String[] args) {
		
		Id N= new Id();
	    N.number();
		N.display();
		N.LastName();

	}

}
