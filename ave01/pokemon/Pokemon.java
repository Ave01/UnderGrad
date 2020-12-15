package pokemon;
abstract public class Pokemon{

private AttackNature attack;
private DefenseNature defense;
private int health; 

public AttackNature getAttack() { return attack; }
public DefenseNature getDefense() { return defense;}
public int getHealth() { return health; }
abstract public String getName();
public void setAttack( AttackNature attack){
	this.attack = attack;
	}
public void setDefense( DefenseNature defense) {
	this.defense = defense;
	}
public void setHealth( int health){
	if(health < 0){
		throw new IllegalArgumentException(" Can't have health lower than 0!");
	}else if( health > 100){
		throw new IllegalArgumentException(" Can't have health higher than 100!");
	}else{
		this.health = health;
		}
	}	
}
