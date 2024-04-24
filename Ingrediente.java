/**
 * FUNDAMENTOS DE ENGENHARIA DE SOFTWARE
 * - Composição
 * 
 * @author Francisco Pedro Morais Gonçalves
 * https://github.com/fgonca
 */

package fundamentos.composicao;

public class Ingrediente 
{
	private String nome;
	private float quantidade;
	
	public Ingrediente(String nome, float quantidade) 
	{
		this.nome = nome;
		this.quantidade = quantidade;
	}

	public String getNome() 
	{
		return nome;
	}

	public float getQuantidade() 
	{
		return quantidade;
	}
}