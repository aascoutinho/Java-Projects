package course;

import java.util.Locale;

public class Program3 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 30;
		int num3 = num1 + num2;
		System.out.printf("Soma = %d%n", num3);
		
		int num4 = -30;
		int num5 = 10;
		int num6 = num4 + num5;
		System.out.printf("Soma = %d%n", num6);
		
		int num7 = 0;
		int num8 = 0;
		int num9 = num7 + num8;
		System.out.printf("Soma = %d%n", num9);
		
		System.out.println("------------------");
		
		Locale.setDefault(Locale.US);
		
		double r1 = 2.00;
		double a1 = 3.14159 * (2*2);
		
		double r2 = 100.64;
		double a2 = 3.14159 * (100.64*100.64);
		
		double r3 = 150.00;
		double a3 = 3.14159 * (150.00*150.00);
		
		System.out.printf("A1 = %.4f", a1);
		System.out.printf("%nA1 = %.4f", a2);
		System.out.printf("%nA1 = %.4f%n", a3);
		System.out.println("------------------");
		
		int A1 = 5;
		int B1 = 6;
		int C1 = 7;
		int D1 = 8;
		int E1 = A1*B1-C1*D1;
		
		System.out.printf("DIFERENCA = %d%n", E1);
		
		int A2 = 5;
		int B2 = 6;
		int C2 = -7;
		int D2 = 8;
		int E2 = A2*B2-C2*D2;
		
		System.out.printf("DIFERENCA = %d%n", E2);
		System.out.println("------------------");
		
		int nf1 = 25;
		int s1 = 100;
		double h1 = 5.50;
		double sf1 = s1*h1;
		
		int nf2 = 1;
		int s2 = 200;
		double h2 = 20.50;
		double sf2 = s2*h2;		
		
		int nf3 = 6;
		int s3 = 145;
		double h3 = 15.55;
		double sf3 = s3*h3;
		
		System.out.printf("Number = %d%nSalary = U$ %.2f%n%n", nf1, sf1);
		System.out.printf("Number = %d%nSalary = U$ %.2f%n%n", nf2, sf2);
		System.out.printf("Number = %d%nSalary = U$ %.2f%n%n", nf3, sf3);
		System.out.println("------------------");
		
		int cp10 = 12;
		int np10 = 1;
		double vu10 = 5.30;
		int cp12 = 16;
		int np12 = 2;
		double vu12 = 5.10;
		double price1 = np10*vu10 + np12*vu12;		
				
				
		int cp20 = 13;
		int np20 = 2;
		double vu20 = 15.30;
		int cp21 = 161;
		int np21 = 4;
		double vu21 = 5.20;
		double price2 = np20*vu20 + np21*vu21;	
		
		int cp30 = 1;
		int np30 = 1;
		double vu30 = 15.10;
		int cp31 = 2;
		int np31 = 1;
		double vu31 = 15.10;
		double price3 = np30*vu30 + np31*vu31;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", price1);
		System.out.printf("%nVALOR A PAGAR: R$ %.2f", price2);
		System.out.printf("%nVALOR A PAGAR: R$ %.2f%n", price3);
		System.out.println("------------------");
		
		double A = 3.0;
		double B = 4.0;
		double C = 5.2;
				
		double tr1 = A*C/2;
		double cc1 = 3.14159*C*C;
		double tp1 = (B+A)*C/2;
		double qd1 = B*B;
		double ret1 = A*B;
		
		System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n", tr1, cc1, tp1, qd1, ret1);
		System.out.println("------------------");
		
		double A0 = 12.7;
		double B0 = 10.4;
		double C0 = 15.2;
				
		double tr0 = A0*C0/2;
		double cc0 = 3.14159*C0*C0;
		double tp0 = (B0+A0)*C0/2;
		double qd0 = B0*B0;
		double ret0 = A0*B0;
		
		System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n", tr0, cc0, tp0, qd0, ret0);
						
	}

}
