/**
 * FUNDAMENTOS DE ENGENHARIA DE SOFTWARE
 * - Composição
 * 
 * @author Francisco Pedro Morais Gonçalves
 * https://github.com/fgonca
 */

package fundamentos.composicao;

public class Controle 
{

	public static void main(String[] args) 
	{

		Bolo bolo= new Bolo ("Bolo de leite");
		System.out.println("Pediu um "+bolo.getNome());
		System.out.printf("Os ingredientes do %s são:\n", bolo.getNome());
		for(int i = 0; i < bolo.getIngredientes().size(); i++) 
		{
			String nome = bolo.getIngredientes().get(i).getNome();
			float quantidade = bolo.getIngredientes().get(i).getQuantidade();
			System.out.printf(i+1+"- %s, %.2f;\n", nome, quantidade);
		}	
	}
}
