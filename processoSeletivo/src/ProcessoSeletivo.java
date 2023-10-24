import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProcessoSeletivo {

    
    public static void main(String[] args) throws Exception {

        double salarioBase = 2000;
        int numeroCandidatos = 5;
        String[] candidatos = new String[numeroCandidatos];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numeroCandidatos; i++) {
            System.out.println("Digite o seu nome");
        String nome = sc.nextLine();
        System.out.println("Qual a pretensão salarial?");
        double pretensaoSalarial = sc.nextDouble();
        sc.nextLine();

        if (pretensaoSalarial < salarioBase) {
            System.out.println("Ligar para o candidato " + nome);
             candidatos[i] = nome;
            
        } else if (pretensaoSalarial == salarioBase) {
            System.out.println("Ligar para o candidato " + nome + " com contra proposta");
            candidatos[i] = nome;
        } else {
            System.out.println("Aguardando resultado demais candidatos");
            i--;
        }
        } 
        System.out.println("Candidatos selecionados:");
        for(String candidato : candidatos){
            System.out.println(candidato);

        } 
    }
    
}
