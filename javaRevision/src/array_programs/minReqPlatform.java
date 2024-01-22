package array_programs;

import java.util.Arrays;

public class minReqPlatform {

	public static void main(String[] args) {

		int arrival[] = { 100, 140, 150, 155, 200, 215, 400, };
		int dep[] = { 110, 300, 210, 210, 230, 315, 600 };

		Arrays.sort(arrival);
		Arrays.sort(dep);

		int count = 0, minReq = 0;
		int i = 0, j = 0;
		int l = dep.length;
		
		while (i < l && j < l) {

			if (arrival[i] < dep[j]) {
				count++;
				i++;
				if (count > minReq) {
					minReq = count;
				}
			} else {
				count--;
				j++;
			}
		}
		System.out.println(minReq);
	}
}
