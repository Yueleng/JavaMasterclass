package com.company;

public class Main {

    public static void main(String[] args) {
	    ITelephone timsPhone;
	    timsPhone = new DeskPhone(123456);
	    timsPhone.powerOn();
	    timsPhone.callPhone(123456);
	    timsPhone.answer();
        System.out.println(timsPhone.isRinging());

        ITelephone timsPhone2 = new MobilePhone(24565);
        timsPhone2.powerOn();
        timsPhone2.callPhone(24565);
        timsPhone2.answer();

    }
}
