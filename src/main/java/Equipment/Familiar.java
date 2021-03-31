package Equipment;

import behaviours.IFamiliar;

public class Familiar implements IFamiliar {
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
