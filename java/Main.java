import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Criação de credenciais
		String logincorreto = "login123";
		String senhacorreto = "senha123";
		
		// Agora a inserção do 'System.out.println()';
		
		System.out.println("Digite seu login:\n");
		String login = sc.nextLine();
		
		System.out.println("Digite sua senha:\n");
		String senha = sc.nextLine();
		
		if(login.equals(logincorreto) && senha.equals(senhacorreto)) {
		    System.out.println("Login feito com sucesso!");
		} else {
		    System.out.println("login ou senha incorretos!");
		}
		
		sc.close();
	}
}