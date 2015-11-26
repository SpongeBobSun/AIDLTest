// ServiceAIDL.aidl
package sun.bob.aidl;

// Declare any non-default types here with import statements
import sun.bob.aidl.Data;
interface ServiceAIDL {
//    /**
//     * Demonstrates some basic types that you can use as parameters
//     * and return values in AIDL.
//     */
//    void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat,
//            double aDouble, String aString);

    int getId();
    String getServiceName();
    void play();
    Data getData();
}
