package intermediateOOP;

public class Singleton {

//	Early Initialization
//	
//	static Singleton instance;
//	
//	private Singleton(){
//		
//	}
//	
//	private static Singleton getInstance(){
//		instance = new Singleton();
//		return instance;
//	}

//	LAzy (Syncronised)

	static Singleton instance;

	private Singleton() {

	}

	private static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton obj = Singleton.getInstance();
		
		Singleton obj2 = Singleton.getInstance();
		
		System.out.println(obj==obj2);
		System.out.println(obj.hashCode());
		System.out.println(obj2.hashCode());

	}

}
