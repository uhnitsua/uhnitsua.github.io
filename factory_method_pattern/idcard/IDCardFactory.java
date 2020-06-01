package edu.xatu.factory_method_pattern.idcard;

import edu.xatu.factory_method_pattern.framework.Factory;
import edu.xatu.factory_method_pattern.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {

    private List owners = new ArrayList (  );

    protected Product createProduct (String owner) {
        return new IDCard ( owner );
    }

    protected void registerProduct (Product product) {
        owners.add (((IDCard) product).getOwner () );
    }

    public List getOwners () {
        return owners;
    }
}
