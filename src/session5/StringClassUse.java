package session5;

public class StringClassUse {

	public static void main(String[] args) {
		
		StringClassUse stringClassUse = new StringClassUse();
		stringClassUse.methodString();
		// TODO Auto-generated method stub

	}
	
	public void methodString() {
		String a= "Yogesh";
		String b = "yogesh";
		String c = " yogesh ";
		
		/*
		 * System.out.println("charAt--->"+a.charAt(0));
		 * System.out.println("IndexAt--->"+a.indexOf("Y"));
		 * System.out.println("IndexAt--->"+a.replace("o", "O"));
		 * System.out.println("concat--->"+a.concat("K"));
		 */
		//System.out.println("equal--->"+a.equals(b));
		//System.out.println("equalsIgnoreCase--->"+a.equalsIgnoreCase(b));
		//System.out.println("equalsIgnoreCase--->"+a.length());
		System.out.println("Without Trim--->"+c);
		System.out.println("Trim--->"+c.trim());

		
	}

}
