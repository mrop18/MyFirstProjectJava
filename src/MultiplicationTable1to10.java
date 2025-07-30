// to display multiplication tables from 1-10
public class MultiplicationTable1to10 {

	public static void main(String[] args) {
		for(int j=1; j<=10; j++) { // table of j
			System.out.printf("%-10s", "Table "+j);
		}
		System.out.println();
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				System.out.printf("%-10s",j+"*"+i+"="+ j*i);
			}
			System.out.println();
		}
	}
}
