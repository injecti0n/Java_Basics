package generics_03;

public class NumberDuo<E extends Number> extends Duo<E> {

   public NumberDuo(E first, E second) {
      super(first, second);
   }

}
