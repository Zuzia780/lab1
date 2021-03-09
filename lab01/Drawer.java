package dsaa.lab01;

public class Drawer {
	private static void drawLine(int n, char ch) {
		for(int i=0;i<n;i++) {
			System.out.println(ch);
		}

	}


	public static void drawPyramid(int n) {
		int spaces=n-1;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n-1;j++) {
				System.out.print("\t");
			}
			spaces--;
			int stars = (i-1)*2+1;
			for(int k=1; k<=stars;k++)
			{
				System.out.print("*\t");
			}
			System.out.println("\r");
			
		}
	}

	
	public static void drawChristmassTree(int n) {
		// TODO
		int repeating = n;
		int spaces=n-1;
		n=1;
		while(n<=repeating) {
			
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=spaces;j++) {
					System.out.print("\t");
				}
				spaces--;
				int stars = (i-1)*2+1;
				for(int k=1; k<=stars;k++)
				{
					System.out.print("*\t");
				}
				System.out.println("\r");
			
			}
			spaces=repeating-1;
			n++;
		}
	}
	
}
