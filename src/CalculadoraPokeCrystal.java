import javax.swing.JOptionPane;

public class CalculadoraPokeCrystal {
	static Integer password;
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"Bem-vindo à calculadorade Password do Bira para Pokémon Crystal", "PokéBEER", JOptionPane.INFORMATION_MESSAGE);
	
		String entrada = JOptionPane.
				showInputDialog(null,"Digite o nome do seu personagem (case sensitive)","NOME", JOptionPane.PLAIN_MESSAGE);
		password = converteNome(entrada);
		
		entrada = JOptionPane.showInputDialog(null,"DIGITE A QUANTIDADE DE DINHEIRO QUE TEM NO SALVO: ","DINHEIRO",
				JOptionPane.PLAIN_MESSAGE);
		
		int numero = Integer.parseInt(entrada);
		password += calculoModulo(numero);
		
		entrada = JOptionPane.showInputDialog(null,"DIGITE O ID DO SALVO: ","ID",
				JOptionPane.PLAIN_MESSAGE);
		numero = Integer.parseInt(entrada);
		password += calculoModulo(numero);
		
		String passwordFinal = "";
		
		if(password.toString().length()== 1) passwordFinal = "0000" + password;
		else if(password.toString().length()== 2) passwordFinal = "000" + password;
		else if(password.toString().length()== 3) passwordFinal = "00" + password;
		else if(password.toString().length()== 4) passwordFinal = "0" + password;
		
		JOptionPane.showMessageDialog(null,"SEU PASSWORD É: " + passwordFinal, "PokéBEER", JOptionPane.INFORMATION_MESSAGE);
		
	}
	private static int calculoModulo(int entrada) {
		int numero = entrada;
		numero = numero % 65535;
		numero = numero % 255;
		return numero;
	}
	private static int converteNome(String nome) {
	    int codigo = 0;

	    for (int i = 0; i < 5; i++) {
	        char letra = nome.charAt(i);

	        switch (letra) {
	            // Uppercase
	            case 'A': codigo += 128; break;
	            case 'B': codigo += 129; break;
	            case 'C': codigo += 130; break;
	            case 'D': codigo += 131; break;
	            case 'E': codigo += 132; break;
	            case 'F': codigo += 133; break;
	            case 'G': codigo += 134; break;
	            case 'H': codigo += 135; break;
	            case 'I': codigo += 136; break;
	            case 'J': codigo += 137; break;
	            case 'K': codigo += 138; break;
	            case 'L': codigo += 139; break;
	            case 'M': codigo += 140; break;
	            case 'N': codigo += 141; break;
	            case 'O': codigo += 142; break;
	            case 'P': codigo += 143; break;
	            case 'Q': codigo += 144; break;
	            case 'R': codigo += 145; break;
	            case 'S': codigo += 146; break;
	            case 'T': codigo += 147; break;
	            case 'U': codigo += 148; break;
	            case 'V': codigo += 149; break;
	            case 'W': codigo += 150; break;
	            case 'X': codigo += 151; break;
	            case 'Y': codigo += 152; break;
	            case 'Z': codigo += 153; break;

	            // Lowercase
	            case 'a': codigo += 160; break;
	            case 'b': codigo += 161; break;
	            case 'c': codigo += 162; break;
	            case 'd': codigo += 163; break;
	            case 'e': codigo += 164; break;
	            case 'f': codigo += 165; break;
	            case 'g': codigo += 166; break;
	            case 'h': codigo += 167; break;
	            case 'i': codigo += 168; break;
	            case 'j': codigo += 169; break;
	            case 'k': codigo += 170; break;
	            case 'l': codigo += 171; break;
	            case 'm': codigo += 172; break;
	            case 'n': codigo += 173; break;
	            case 'o': codigo += 174; break;
	            case 'p': codigo += 175; break;
	            case 'q': codigo += 176; break;
	            case 'r': codigo += 177; break;
	            case 's': codigo += 178; break;
	            case 't': codigo += 179; break;
	            case 'u': codigo += 180; break;
	            case 'v': codigo += 181; break;
	            case 'w': codigo += 182; break;
	            case 'x': codigo += 183; break;
	            case 'y': codigo += 184; break;
	            case 'z': codigo += 185; break;

	            default:
	            System.out.println("Character not in the table: " + letra);
	        }
	    }

	    return codigo;
	}

}
