public abstract class CharacterBuilder {
    public Character character;

    public Character getCharacter(){
        return character;
    }
    public void crearCharacter (){
        character =  new Character();
    }
    public abstract void setName(String name);
    public abstract void setHability(Hability hability);
    public abstract void setArmor(Armor armor);
    public abstract void setWeapon(Weapon weapon);
    public abstract void setMinioms(Minioms minioms);
    public abstract void setGold(int gold);
    public abstract void setHealth(int health);
    public abstract void setPower(int power);
    public abstract void setWeaknessList();
    public abstract void setFortressList();
}
