package demo.aboutlambd.funcs;


@FunctionalInterface
public interface ShortToByteFunction {
    
    byte applyAsByte(short s);
    
}
