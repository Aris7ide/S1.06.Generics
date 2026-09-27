package com.main;

import com.models.Smartphone;
import com.utils.GenericUtils;

public class Main {
    static void main(String[] args) {

        Smartphone smartphone = new Smartphone();

        GenericUtils.usePhone(smartphone);
        GenericUtils.useSmartphone(smartphone);

    }
}
