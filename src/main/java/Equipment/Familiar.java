package Equipment;

public class Familiar  {
    FamiliarType familiar;

    public Familiar(FamiliarType familiar){
        this.familiar = familiar;
    }

    public FamiliarType getFamiliar(){
        return this.familiar;
    }

    public int getHealth(){
        return this.familiar.getHealth();
    }
}
