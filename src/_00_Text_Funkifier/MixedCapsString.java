package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
	String r = "";
	s=s.toLowerCase();
	
	for (int i = 0; i < s.length(); i++) {
		if(i%2!=0) {
			String x = Character.toString(s.charAt(i));
			
			r+=x.toUpperCase();
		}
		else {
			r+=s.charAt(i);
		}
	}

		return r;
	}

}
