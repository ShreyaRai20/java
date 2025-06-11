package com.opencvcamera;
import org.opencv.core.Core;


public class OpenCvCamera {
    public static void main(String args[]){
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        System.out.println("LOAD SUCESS");

    }
}

