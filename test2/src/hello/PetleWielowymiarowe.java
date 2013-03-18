package hello;

public class PetleWielowymiarowe {

	public static void main(String[] args) {
		int[][] tab = new int[2][3];
		for (int i=0;i<tab.length;i++)
			for(int j=0;j<tab[i].length;j++)
				tab[i][j]=i*3+j;
		
		for (int i=0;i<tab.length;i++)
			for(int j=0;j<tab[i].length;j++)
				System.out.printf("tab[%d][%d]=%d \n", i, j,tab[i][j]);
// sprytniej bedzie:
		int[][] tab1 = new int[2][3];
		for (int i=0;i<tab1.length*tab1[0].length;i++)
					tab1[i/3][i%3]=i+1;
		
		for (int i=0;i<tab1.length*tab1[0].length;i++)
			System.out.printf("tab[%d][%d]=%d \n", i/3, i%3,tab[i/3][i%3]);
	}

}
