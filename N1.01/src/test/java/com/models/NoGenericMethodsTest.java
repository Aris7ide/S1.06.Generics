package com.models;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NoGenericMethodsTest {

    @Test
    void shouldNotThrowException() {
        String st1 = "Value 1";
        String st2 = "Value 2";
        String st3 = "Value 3";

        NoGenericMethods ngm1 = new NoGenericMethods("Value2","Value1","Value3");
        assertThat(ngm1.getElement1()).isEqualTo("Value2");
        assertThat(ngm1.getElement2()).isEqualTo("Value1");
        assertThat(ngm1.getElement3()).isEqualTo("Value3");

        NoGenericMethods ngm2 = new NoGenericMethods("Value1","Value3","Value2");
        assertThat(ngm2.getElement1()).isEqualTo("Value1");
        assertThat(ngm2.getElement2()).isEqualTo("Value3");
        assertThat(ngm2.getElement3()).isEqualTo("Value2");
    }
}