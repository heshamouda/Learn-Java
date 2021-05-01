package lecture12.solutions.userselection;

public enum Usertypes {
	ADMIN(Autorization.ALL, Autorization.ALL),
	POWERUSER(Autorization.ALL, Autorization.UNCRITICAL),
	USER(Autorization.UNCRITICAL, Autorization.UNCRITICAL),
	VISITOR(Autorization.UNCRITICAL, Autorization.NONE);
	
	private Autorization read;
	private Autorization write;
	
	Usertypes(Autorization r, Autorization w){
		read= r;
		write=w;
	}
}
