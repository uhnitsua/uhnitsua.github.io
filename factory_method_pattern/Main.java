package edu.xatu.factory_method_pattern;

import edu.xatu.factory_method_pattern.framework.Factory;
import edu.xatu.factory_method_pattern.framework.Product;
import edu.xatu.factory_method_pattern.idcard.IDCardFactory;

public class Main {
    public static void main (String[] args) {
        Factory factory = new IDCardFactory ();
        Product card1 = factory.create ( "小明" );
        Product card2 = factory.create ( "小红" );
        Product card3 = factory.create ( "小芳" );
        card1.use ();
        card2.use ();
        card3.use ();

    }
}
