package ru.geekbrains.service;

public class ReflectionServiceFactory {

    public static ReflectionService createReflectionService(){
        return new ReflectionServiceImpl ();
    }
}
