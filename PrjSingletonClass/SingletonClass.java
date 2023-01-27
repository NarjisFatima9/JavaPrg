/*Java program to create Singleton Class*/
public class SingletonClass {
    private static SingletonClass singletonIns = new SingletonClass();

    /* A private Constructor prevents any other
     * class from instantiating.
     */
    private SingletonClass() { }

    /* Static 'instance' method */
    public static SingletonClass getInstance( ) {
        return singletonIns;
    }

    /* Other methods protected by singleton-ness */
    protected static void demoMethod( ) {
        System.out.println("demoMethod for singleton");
    }

    }

