import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import pokemon.Bulbasaur;
import pokemon.Charizard;
import pokemon.Charmander;
import pokemon.AttackNature;
import pokemon.Caterpie;
import pokemon.DefenseNature;
import pokemon.Pokemon;
import pokemon.Squirtle;
public class Pokedex{
	
	static ArrayList<Pokemon> team1 = new ArrayList<>();;
	public static void main(String[] args){

		
		Scanner input = new Scanner(System.in);
		while(true){
			System.out.println("Press the button according to what you wish to do");
			System.out.println("1. Load Team");
			System.out.println("2. Display Team");
			System.out.println("3. Exit");
			int i = input.nextInt();
			if(i == 1){
				System.out.println("Please enter a File Name");
				try(Scanner sc = new Scanner(new FileInputStream("team1.txt"))){
				sc.useDelimiter(":"); 
				}
				catch( FileNotFoundException e) {
					System.out.println("Can not Open File " + e.toString());
					return;
				}
			}
			else if(i == 2){
				System.out.println("Input Name of Pokemon");
				String pokeName = input.next();
				if(pokeName.equals("Bulbasaur")){
					Pokemon pok = new Bulbasaur();
				}else if(pokeName.equals("Charizard")){
					Pokemon pok = new Charizard();
				}else if(pokeName.equals("Caterpie")){
					Pokemon pok = new Caterpie();
				}else if(pokeName.equals("Charmander")){
					Pokemon pok = new Charmander();
				}else if(pokeName.equals("Squirtle")){
					Pokemon pok = new Squirtle();
				}

				System.out.println("Enter your Pokemon's Attack Nature");
				System.out.println("1.Adamant");
				System.out.println("2.Brave");
				System.out.println("3.Lonely");
				System.out.println("4.Naughty");
				int aNature = input.nextInt();
				
				if(aNature == 1){
					team1.add(AttackNature.Adamant);
				}else if(aNature == 2){
					Pokemon Brace = new AttackNature();
				}else if(aNature == 3){
					Pokemon Lonely = new AttackNature();
				}else if(aNature == 4){
					Pokemon Naughty = new AttackNature( );
				}
				System.out.println("Enter your Pokemon's Defense Nature");
				System.out.println("1.Bold");
				System.out.println("2.Lax");
				System.out.println("3.Relaxed");
				System.out.println("4.Impish");
				int dNature = input.nextInt();
				if(dNature == 1){
					team1.add(new Pokemon("Bold"));
				}else if(dNature == 2){
					team1.add(new Pokemon("Lax"));
				}else if(dNature == 3){
					team1.add(new Pokemon("Relaxed"));
				}else if(dNature == 4){
					team1.add(new Pokemon("Impish"));
				}
				System.out.println("Enter your Pokemon's health");				  int pHealth = input.nextInt();
				if(pHealth <= 0){
					throw new IllegalArgumentException("Can't have health lower than 0");
				}else if(pHealth > 100){
					throw new IllegalArgumentException("Can't have health higher than 100");
				}else{
					team1.add(newPokemon(pHealth));
				}
 			}
			else if( i == 3){
				System.exit(3);
					}
				}		
			}
		}
	
