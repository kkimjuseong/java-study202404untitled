package day12.lambda;

public interface GenericFunction<X, Y> {

    // X 를 주면 Y를 추출
    Y apply(X x);
}
