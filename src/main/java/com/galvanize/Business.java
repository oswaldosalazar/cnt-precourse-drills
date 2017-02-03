package com.galvanize;

import java.util.*;

public class Business implements Addressable {
    private String name;
    private ArrayList<Address> addresses = new ArrayList<Address>();

    public Business(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addAddress(Address address) {
        addresses.add(address);
    }

    public List<Address> getAddresses() {
        return addresses;
    }
}
