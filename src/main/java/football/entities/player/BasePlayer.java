package football.entities.player;

import static football.common.ExceptionMessages.*;

public abstract class BasePlayer implements Player{

    private String name;
    private String nationality;
    private double kg;
    private int strength;

    protected BasePlayer(String name, String nationality, int strength) {
        setName(name);
        setNationality(nationality);
        setStrength(strength);
    }

    private void setNationality(String nationality) {
        if (name == null || name.trim().isEmpty()){
            throw new NullPointerException(PLAYER_NATIONALITY_NULL_OR_EMPTY);
        }

        this.nationality = nationality;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()){
            throw new NullPointerException(PLAYER_NAME_NULL_OR_EMPTY);
        }

        this.name = name;
    }

    protected void setStrength(int strength) {
        if (strength <= 0){
            throw new IllegalArgumentException(PLAYER_STRENGTH_BELOW_OR_EQUAL_ZERO);
        }
        this.strength = strength;
    }

    @Override
    public double getKg() {
        return kg;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getStrength() {
        return strength;
    }

}
