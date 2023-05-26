package zoo.move;

public interface IWalk {
    default String walk() {
        return this.getClass().getSimpleName() +" can walk";
    }
}
