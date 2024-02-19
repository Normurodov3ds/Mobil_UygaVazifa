package Lesson28.HomeWork.Interface_Segregation.Bad.Bulder;

import Lesson28.HomeWork.Interface_Segregation.Good.Bulder.BuldDom;

public class Main {
    public static void main(String[] args) {
        Bulder bulder = new BuildDom();
        bulder.buildBalcony();
//      bulder.buld();
//      bulder.buildHome(); kerak emas funcsiyalar

        BuldHome buldHome = new BuldHome();
        buldHome.buildHome();
//        buldHome.buld();
//        buldHome.buildBalcony();

    }
}
