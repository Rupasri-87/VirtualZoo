package zoo;

public abstract class Animal {
    public String eat(){
        return  this.getClass().getSimpleName()+" eating";
    }

}
