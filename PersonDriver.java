
public class PersonDriver {

	public static void main(String[] args) {
		Person robert = new Person();
		robert.setName("Bob");
		robert.setAge(40);
		System.out.println("Person one: Name is " + robert.getName() + " and age is " + robert.getAge());

	Person celeste = new Person("Celeste", 45);
	
		System.out.println("Person two: " + celeste);
		
		if(robert.getName().equals(celeste.getName()) & robert.getAge() == celeste.getAge()) {
		System.out.println("\nTwo persons are equal");
		} else {
		System.out.println("\nTwo persons are not equal");
		
		}

		if(robert.getName().equals(celeste.getName())) {
		System.out.println("Two persons name are equal");
		} else {
		System.out.println("Two persons name are not equal");
		
		}
		
		if(robert.getAge() == celeste.getAge()) {
		System.out.println("Two persons age are equal");
		} else {
		System.out.println("Two persons age are not equal");
		
		}
		
		if(robert.getAge() > celeste.getAge()) {
		System.out.println(robert.getName() + " is older than " + celeste.getName());
		} else {
		System.out.println(robert.getName() + " is younger than " + celeste.getName());
		
		}
		
		if(robert.getAge() < celeste.getAge()) {
		System.out.println(celeste.getName() + " is older than " + robert.getName());
		} else {
		System.out.println(celeste.getName() + " is younger than " + robert.getName());
		
		}

	}
}
