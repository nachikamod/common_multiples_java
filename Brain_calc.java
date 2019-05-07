package brain;

import java.util.*;

public class Brain_calc {

	public static void main(String[] args) {
		int f_ip, s_ip;
		ArrayList<Integer> f_op = new ArrayList<Integer>();
		ArrayList<Integer> s_op = new ArrayList<Integer>();
		ArrayList<Integer> op_Array = new ArrayList<Integer>();
		System.out.println("Enter First input : ");
		Scanner first_ip = new Scanner(System.in);
		f_ip = first_ip.nextInt();
		System.out.println("Enter Second input : ");
		Scanner second_ip = new Scanner(System.in);
		s_ip = second_ip.nextInt();
		
		for (int i = 2; i < f_ip; i++) {
			if (f_ip % i == 0) {
				f_op.add(i);
			}
		}

		Integer op1[] = new Integer[f_op.size()];
		op1 = f_op.toArray(op1);
		
		
		for (int j = 2; j < s_ip; j++) {
			if (s_ip % j == 0) {
				s_op.add(j);
			}
		}
		
		Integer op2[] = new Integer[s_op.size()];
		op2 = s_op.toArray(op2);
		
		System.out.println("Multiples of first input : " + f_op);
		
		for (int comp = 0; comp < f_op.size(); comp++) {
			for ( int comp2 = 0; comp2 < s_op.size(); comp2++) {
				if (op1[comp] == op2[comp2]) {
					op_Array.add(op1[comp]);
				}
			}
		}
		System.out.println("Multiples of second input : " + s_op);
		System.out.println("__________________________________________\n");
		System.out.println("Intersecion : " + op_Array);
	}
}
