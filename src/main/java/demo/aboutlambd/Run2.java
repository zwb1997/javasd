package demo.aboutlambd;

import java.util.function.Supplier;

import demo.aboutlambd.funcs.ShortToByteFunction;

public class Run2 {

    public byte[] transformArray(short[] array, ShortToByteFunction function) {
        byte[] transformArray = new byte[array.length];

        for (int i = 0; i < array.length; i++) {
            transformArray[i] = function.applyAsByte(array[i]);
        }

        return transformArray;
    }

    public static void main(String[] args) {

        // Run2 r2 = new Run2();
        // short[] array = { (short) 1, (short) 2, (short) 3 };
        // byte[] transformArray = r2.transformArray(array, s -> (byte) (s * 2));

        // byte[] expectedArray = { (byte) 2, (byte) 4, (byte) 6 };

        // assertArray

        Supplier<Object> constructor = () -> {
            return new Object();
        };

    }
}
