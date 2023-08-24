package Day0824;

public class Main {
	public static void main(String[] args) {
//		Phone myPhone = new Phone("너");
//		
//		myPhone.number = "010-1234-5678";
//		System.out.println(myPhone.number);
//		
////		myPhone.owner;
//		System.out.println(myPhone.getOwner());
//		
//		System.out.println(myPhone.operator);
		
//		System.out.println(Phone.model);		
		
		IPhone myPhone1 = new IPhone("이","010");
		System.out.println(myPhone1.operator);
		
		GalaxyPhone myPhone2 = new GalaxyPhone("이","020");
		System.out.println(GalaxyPhone.MANUFACTURER);
		
		Phone[] myPhones = new Phone[] {myPhone1,myPhone2}; 
		
		myPhones[0].installApp("김나라");
		myPhones[1].installApp("김나라");
		
		myPhone2.installApp("카메라");
		
	}
}
