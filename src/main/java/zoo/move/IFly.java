package zoo.move;

public interface IFly {
    default String fly(){
        return this.getClass().getSimpleName() +" can fly";

    }
}
