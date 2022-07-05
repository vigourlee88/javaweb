public class DogPlay{
	String breed;
	boolean hasOwner;
	int age;
	
	public DogPlay(String dogBreed,boolean dogOwner,int dogYears) {
		System.out.println("Constructor invoked!");
		breed = dogBreed;
		hasOwner = dogOwner;
		age = dogYears;	
	}
	public static void main(String[] args) {
		System.out.println("Main method started");
		DogPlay fido = new DogPlay("poodle",false,4);
		DogPlay nunzio = new DogPlay("shiba inu",true,12);
		boolean isFidoOlder = fido.age > nunzio.age;
		int totalDogYears = nunzio.age + fido.age;
		System.out.println("Two dogs created: a " + fido.breed + " and a " + nunzio.breed);
		System.out.println("The statement that fido is an older dog is:" + isFidoOlder);
		System.out.println("The total age of the dogs is:" + totalDogYears);
		System.out.println("Main method finished");
	}
	
}