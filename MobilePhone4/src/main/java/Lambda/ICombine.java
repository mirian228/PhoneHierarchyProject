package Lambda;
@FunctionalInterface
public interface ICombine<T, A> {

	int combine(T t, A a);
}
