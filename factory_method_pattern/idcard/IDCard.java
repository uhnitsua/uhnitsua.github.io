package edu.xatu.factory_method_pattern.idcard;

import edu.xatu.factory_method_pattern.framework.Product;

public class IDCard extends Product {
    private String owner;

    IDCard (String owner) { //让idcard包外的类无法new出IDCard类的实例，这样就可以强迫外部必须通过IDCardFactory来生成IDCard的实例
        System.out.println ("制作"+owner+"的ID卡。");
        this.owner = owner;
    }

    public void use () {
        System.out.println ("使用"+owner+"的ID卡。");
    }

    public String getOwner () {
        return owner;
    }
}
