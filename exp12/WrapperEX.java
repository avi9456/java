class WrapperEX{
    public static void main(String arg[]){
        byte b=10;
        short s=20;
        int i = 30;
        long l=40;
        float f=50f;
        double d=60;
        char c='a';
        boolean b2=true;
        Byte bo=b;
        short so=s;
        int io = i;
        long lo=l;
        float fo=f;
        double d1o=d;
        char co=c;
        boolean b2o=b2;
        System.out.println("Printing Primitive object value");
        System.out.println("ByteObject"+bo);
        System.out.println("ByteObject"+so);
        System.out.println("ByteObject"+io);
        System.out.println("ByteObject"+lo);
        System.out.println("ByteObject"+fo);
        System.out.println("ByteObject"+d1o);
        System.out.println("ByteObject"+co);
        System.out.println("ByteObject"+b2o);

        byte bv=bo;
        short sv=so;
        int iv = io;
        long lv=lo;
        float fv=fo;
        double dv=d1o;
        char cv=co;
        boolean b2v=b2o;

        System.out.println("Printing Primitive value");
        System.out.println("ByteValue"+bv);
        System.out.println("ByteValue"+sv);
        System.out.println("ByteValue"+iv);
        System.out.println("ByteValue"+lv);
        System.out.println("ByteValue"+fv);
        System.out.println("ByteValue"+dv);
        System.out.println("ByteValue"+cv);
        System.out.println("ByteValue"+b2v);

    }
}