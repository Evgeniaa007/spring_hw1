package ru.dorogova;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Gson gson = new Gson();
        Person person = new Person("Ivan", "Ivanov", 29);
        String json = gson.toJson(person);
        System.out.println(json);

        Person deserializedPerson = gson.fromJson(json, Person.class);
        System.out.println(deserializedPerson);
    }
}
