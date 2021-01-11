package ComputerSimulator;/*
Proyect name:ComputerSimulator
Created by:alumnesmx
Data:11/1/21
Description: asedehe aha ahe asedehe si sarandonga asedehe
*/

public class test {
    public static void main(String[] args) {
        Computer c1 = new Computer("MasmayerPC", 4, 500);
        Operatingsystem s1 = new Operatingsystem("Windows", "10", "RISK", true, 20, 2);
        Software p1 = new Software("League of Legends", "10.24", 50, 1);
        Software p2 = new Software("Genshin Impact", "1.1", 50, 1);
        System.out.println(c1.getHardDisk());
        System.out.println(c1.getRamMemory());
        c1.installOS(s1);
        System.out.println(c1.getHardDisk());
        System.out.println(c1.getRamMemory());
        s1.installsoftware(p1, c1);
        System.out.println(c1.getHardDisk());
        System.out.println(c1.getRamMemory());
        s1.installsoftware(p2, c1);
        System.out.println(c1.getHardDisk());
        System.out.println(c1.getRamMemory());
        s1.uninstallsoftware(p2,c1);
        System.out.println(c1.getHardDisk());
        System.out.println(c1.getRamMemory());
        c1.format(c1);
        System.out.println(c1.getHardDisk());
        System.out.println(c1.getRamMemory());
        System.out.println(c1.getSistemas())
        ;
    }
}
