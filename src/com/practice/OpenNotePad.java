package com.practice;

import java.io.IOException;

public class OpenNotePad
{
    public static void main(String[] args)
    {
        try
        {
            Runtime.getRuntime().exec("notepad.exe");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}