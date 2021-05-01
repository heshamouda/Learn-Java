package lecture12.solutions.canton;

public class CantonUsage {

	public static void main(String[] args) {
		Canton[] cantons= Canton.values();
		for (int i= 0; i<cantons.length; i++){
			System.out.println(cantons[i] +" has "+ cantons[i].getInhabitants()+" inhabitants on an area of "+
					cantons[i].getSize()+" km^2. The people mostly speak " + cantons[i].getLanguage());
		}
		Canton max=cantons[0];
		for (int i= 1; i<cantons.length; i++){
			if (cantons[i].getInhabitants()>max.getInhabitants()){
				max= cantons[i];
			}
		}
		System.out.println(max+" has most inhabitants ("+ max.getInhabitants()+"). ");
		max=cantons[0];
		for (int i= 1; i<cantons.length; i++){
			if (cantons[i].getSize()>max.getSize()){
				max= cantons[i];
			}
		}
		System.out.println(max+" has the largest area ("+ max.getSize()+" km^2). ");
	}

}
