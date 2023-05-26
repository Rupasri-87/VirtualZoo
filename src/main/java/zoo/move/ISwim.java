package zoo.move;

public interface ISwim {
    default String swim(){
        return this.getClass().getSimpleName() +" can swim";
    }
}
