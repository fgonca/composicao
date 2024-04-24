/**
 * FUNDAMENTOS DE ENGENHARIA DE SOFTWARE
 * - Composição
 * 
 * @author Francisco Pedro Morais Gonçalves
 * https://github.com/fgonca
 */

package fundamentos.composicao;

import java.util.ArrayList;

public class Bolo 
{
	private String nome;
	private ArrayList<Ingrediente> ingredientes= new ArrayList<Ingrediente>();

	public Bolo(String nome) 
	{
		this.nome = nome;
		if(nome=="Bolo de leite" || nome=="bolo de leite") 
		{
			// os ingredientes são criados dentro da classe Bolo
			Ingrediente trigo = new Ingrediente("trigo", 1);
			Ingrediente leite = new Ingrediente("leite", 0.5f);
			Ingrediente fermento = new Ingrediente("fermento", 0.1f);
			Ingrediente ovo = new Ingrediente("ovo", 3);
			Ingrediente acucar = new Ingrediente("açúcar", 0.5f);
			
			this.ingredientes.add(trigo);
			this.ingredientes.add(leite);
			this.ingredientes.add(fermento);
			this.ingredientes.add(ovo);
			this.ingredientes.add(acucar);
		}
	}

	public String getNome() 
	{
		return nome;
	}

	public ArrayList<Ingrediente> getIngredientes() 
	{
		return ingredientes;
	}		
}