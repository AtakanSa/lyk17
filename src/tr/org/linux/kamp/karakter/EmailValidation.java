package tr.org.linux.kamp.karakter;

public class EmailValidation {
	public static void main(String[] args) {
		System.out.println(isValidate("asdasd@gmail.ma"));
	}
	
	public static boolean isValidate(String mail) {
		
		if(mail.indexOf(' ') != -1)
			return false;
		
		if(mail.indexOf('@') == -1)
			return false;
		
		if(mail.indexOf('.') == -1)
			return false;
		
		if(mail.charAt(0) == '@')
			return false;
		
		if(mail.charAt(0) == '.')
			return false;
		
		if(mail.charAt(mail.indexOf('@')+1) == '.')
			return false;
		
		if((mail.indexOf('.')+2) == mail.length())
		return false;
		
		return true;
		
	}
}
