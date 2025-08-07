package PrimeiraAvaliacao;

public class Questao01 {
    public static void main(String[] args) {
        double n1 = 8.5;
        double n2 = 9.0;
        double n3 = 7.5;
        double n4 = 7.0;
        double n5 = 8.0;
        double n6 = 9.0;
        double n7 = 10.5;
        double n8 = 6.5;

        double mediaBimestre1 = (n1+n2)/2;
        double mediaBimestre2 = (n3+n4)/2;
        double mediaBimestre3 = (n5+n6)/2;
        double mediaBimestre4 = (n7+n8)/2;

        double Semestre1=(mediaBimestre1 + mediaBimestre2)/2;
        double Semestre2=(mediaBimestre3 + mediaBimestre4)/2;

        System.out.println("=== Resultado Escolar ===");
        System.out.printf(" 1°Bimestre: %.2f \n", mediaBimestre1);
        System.out.printf(" 2°Bimestre: %.2f \n", mediaBimestre2);
        System.out.printf("1° semestre: %.2f \n",Semestre1);
        System.out.println("----------------------");
        System.out.printf("3°Bimestre: %.2f \n", mediaBimestre3);
        System.out.printf("4° Bimestre: %.2f \n", mediaBimestre4);
        System.out.printf("2°Semestre: %.2f \n", Semestre2);
        System.out.println("===============================");


    }
}
