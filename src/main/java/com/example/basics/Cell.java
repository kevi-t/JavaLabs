package com.example.basics;

public class Cell<T> {
    private T t;
    
    public void set(T celldata)
    {
       t = celldata;
    }
    
    public T get() 
    {
      return t;
    }
}