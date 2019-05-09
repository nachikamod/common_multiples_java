package brain;

import java.util.*;

public class Brain_calc {

	public static void main(String[] args) {
		long f_ip, s_ip;
		ArrayList<Long> f_op = new ArrayList<Long>();
		ArrayList<Long> s_op = new ArrayList<Long>();
		ArrayList<Long> op_Array = new ArrayList<Long>();
		System.out.println("Enter First input : ");
		Scanner first_ip = new Scanner(System.in);
		f_ip = first_ip.nextLong();
		System.out.println("Enter Second input : ");
		Scanner second_ip = new Scanner(System.in);
		s_ip = second_ip.nextLong();
		
		for (long i = 2; i < f_ip; i++) {
			if (f_ip % i == 0) {
				f_op.add(i);
				System.out.println(i);
			}
		}

		Long op1[] = new Long[f_op.size()];
		op1 = f_op.toArray(op1);
		
		
		for (long j = 2; j < s_ip; j++) {
			if (s_ip % j == 0) {
				s_op.add(j);
				System.out.println(j);
			}
		}
		
		Long op2[] = new Long[s_op.size()];
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
		System.out.println("Intersection : " + op_Array);
	}
}
