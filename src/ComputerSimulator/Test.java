package ComputerSimulator;

/*

-Project: ComputerSimulator.Computer simulator

-Date: 04/12/2020

-Created by: Joshua Mas

*/
public class Test {
    public static void main(String[] args) {
        Computer c1 = new Computer("MasmayerPC", 10, 500);
        Operatingsystem s1 = new Operatingsystem("Windows", "10", "RISK", true, 100, 2);
        Software p1 = new Software("League of Legends", "10.24", 50, 1);
        Software p2 = new Software("Genshin Impact", "1.1", 50, 1);
        Software p3 = new Software("asdasd", "1.1", 50, 1);

        System.out.println("procedemos a instalar el sistema operativo");

        c1.installOS(s1);

        System.out.println("Procedemos a instalar el programa número 1. " + "Actualmente hay un espacio en el disco de: " + c1.getHardDisk() + " y una RAM de " + c1.getRamMemory());
        if (c1.getHardDisk() >= s1.getOsRamMemoryRequirement() && c1.getRamMemory() >= s1.getOsRamMemoryRequirement()) {
            c1.getSistemas().installsoftware(p1);
            c1.setRamMemory(c1.getRamMemory() - p1.getSoftwareRamMemoryRequirement());
            c1.setHardDisk(c1.getHardDisk() - p1.getSoftwareSpaceRequirement());
            System.out.println("Se ha instalado correctamente." + " Actualmente hay un espacio en el disco de: " + c1.getHardDisk() + " y una RAM de " + c1.getRamMemory());

        } else {
            System.out.println("No hay suficiente espacio en el disco o no hay suficiente RAM");
        }
        System.out.println("Procedemos a instalar el programa número 2. " + "Actualmente hay un espacio en el disco de: " + c1.getHardDisk() + " y una RAM de " + c1.getRamMemory());
        if (c1.getHardDisk() >= s1.getOsRamMemoryRequirement() && c1.getRamMemory() >= s1.getOsRamMemoryRequirement()) {
            c1.getSistemas().installsoftware(p2);
            c1.setRamMemory(c1.getRamMemory() - p2.getSoftwareRamMemoryRequirement());
            c1.setHardDisk(c1.getHardDisk() - p2.getSoftwareSpaceRequirement());
            System.out.println("Se ha instalado el programa" + " Actualmente hay un espacio en el disco de: " + c1.getHardDisk() + " y una RAM de " + c1.getRamMemory());

        } else {
            System.out.println("No hay suficiente espacio en el disco o no hay suficiente RAM");
        }
        System.out.println("Procedemos a instalar el programa número 3. " + "Actualmente hay un espacio en el disco de: " + c1.getHardDisk() + " y una RAM de " + c1.getRamMemory());
        if (c1.getHardDisk() >= s1.getOsRamMemoryRequirement() && c1.getRamMemory() >= s1.getOsRamMemoryRequirement()) {
            c1.getSistemas().installsoftware(p3);
            c1.setRamMemory(c1.getRamMemory() - p3.getSoftwareRamMemoryRequirement());
            c1.setHardDisk(c1.getHardDisk() - p3.getSoftwareSpaceRequirement());
            System.out.println("Se ha instalado correctamente." + " Actualmente hay un espacio en el disco de: " + c1.getHardDisk() + " y una RAM de " + c1.getRamMemory());

        } else {
            System.out.println("No hay suficiente espacio en el disco o no hay suficiente RAM");
        }

        System.out.println("Procedemos a desinstalar el programa número 2" + " Actualmente hay un espacio en el disco de: " + c1.getHardDisk() + " y una RAM de " + c1.getRamMemory());
        c1.getSistemas().uninstallsoftware(p2);
        c1.setRamMemory(c1.getRamMemory() + p2.getSoftwareRamMemoryRequirement());
        c1.setHardDisk(c1.getHardDisk() + p2.getSoftwareSpaceRequirement());
        System.out.println("ComputerSimulator.Software desinstalado correctamente" + " Actualmente hay un espacio en el disco de: " + c1.getHardDisk() + " y una RAM de " + c1.getRamMemory());

        System.out.println("Procedemos a formatear el disco" + " Actualmente hay un espacio en el disco de: " + c1.getHardDisk() + " y una RAM de " + c1.getRamMemory());
        c1.getSistemas().uninstallsoftware(p1);
        c1.setRamMemory(c1.getRamMemory() + p3.getSoftwareRamMemoryRequirement());
        c1.setHardDisk(c1.getHardDisk() + p3.getSoftwareSpaceRequirement());
        c1.getSistemas().uninstallsoftware(p3);
        c1.setRamMemory(c1.getRamMemory() + p3.getSoftwareRamMemoryRequirement());
        c1.setHardDisk(c1.getHardDisk() + p3.getSoftwareSpaceRequirement());
        c1.format();
        System.out.println("se ha formateado el software" + " Actualmente hay un espacio en el disco de: " + c1.getHardDisk() + " y una RAM de " + c1.getRamMemory());
    }
}

