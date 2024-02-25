package com.cydeo.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberTest {
    public static void main(String[] args) {

        Person p1 = new Person("mike",35,Gender.MALE);
        Person p2 = new Person("ozzy",25,Gender.MALE);
        Person p3 = new Person("tom",15,Gender.MALE);
        Person p4 = new Person("ally",45,Gender.FEMALE);

        List<Person> personList = new ArrayList<>(Arrays.asList(p1,p2,p3,p4));


        Member member = person -> person.getGender()==Gender.MALE && person.getAge() >=18 && person.getAge() <= 25;

        printMember(personList,member);


    }

    private static void printMember( List<Person> personList, Member member){

        List<Person> result = new ArrayList<>();


        for (Person person : result) {
            if (member.check(person)){
                result.add(person);
            }
        }


    }
}
