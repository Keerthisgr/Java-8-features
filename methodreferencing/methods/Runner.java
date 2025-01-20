package com.xworkz.features.methodreferencing.methods;

import java.util.Map;

public class Runner {
    public static void main(String[] args) {
      Addition add =   ReferencingImpl::adding;
        int add1 = add.add(3, 4);
        System.out.println(add1);

        Subtraction sub = ReferencingImpl::subtract;
        int result = sub.sub(7,2);
        System.out.println(result);

       Employee emp = ReferencingImpl::numberOfEmployee;
        System.out.println(emp.getNoOfEmployee());

        Event event = ReferencingImpl::event;
        System.out.println(event.eventType());

        Calendar calendar = ReferencingImpl::getPresentMonth;
        System.out.println(calendar.getMonth());
    }

}
