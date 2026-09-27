package com.utils;

import com.interfaces.Phone;
import com.models.Smartphone;

public class GenericUtils {

    public static <T extends Phone> void usePhone(T phone) {
        phone.call();
    }

    public static <T extends Smartphone> void useSmartphone(T smartphone) {
        smartphone.takePhoto();
        smartphone.call();
    }
}
