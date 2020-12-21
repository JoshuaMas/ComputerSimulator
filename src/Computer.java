import jdk.swing.interop.SwingInterOpUtils;

/*

-Project: Computer simulator

-Date: 04/12/2020

-Created by: Joshua Mas

*/
public class Computer {
    private String name;
    private int ramMemory;
    private int hardDisk;
    private Operatingsystem sistemas;

    // Constructor default
    public Computer() {
    }

    // Constructor
    public Computer(String name, int ramMemory, int hardDisk) {
        this.name = name;
        this.ramMemory = ramMemory;
        this.hardDisk = hardDisk;
    }

    // Method: Instala el sistema operativo indicado
    public void installOS(Operatingsystem sistemas) {
        if (hardDisk >= sistemas.getOsSpaceRequirement() && ramMemory >= sistemas.getOsRamMemoryRequirement()) {
                this.ramMemory = ramMemory - sistemas.getOsRamMemoryRequirement();
                this.hardDisk = hardDisk - sistemas.getOsSpaceRequirement();
                System.out.println("Se ha instalado el sistema correctamente");
                this.sistemas=sistemas;
            }
        else {
            System.out.println("No hay espacio suficiente o no hay suficiente RAM");
        }
    }
    // Method: Formateo del disco
   public void format(){
        this.hardDisk = hardDisk + sistemas.getOsSpaceRequirement();
        this.ramMemory = ramMemory + sistemas.getOsRamMemoryRequirement();
        this.sistemas=sistemas;

    }


    // Getters

    public String getName() {
        return this.name;
    }

    public int getRamMemory() {
        return this.ramMemory;
    }

    public int getHardDisk() {
        return this.hardDisk;
    }

    public Operatingsystem getSistemas() {
        return sistemas;
    }


    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setRamMemory(int ramMemory) {
        this.ramMemory = ramMemory;
    }

    public void setHardDisk(int hardDisk) {
        this.hardDisk = hardDisk;
    }

    public void setSistemas(Operatingsystem sistemas) {
        this.sistemas = sistemas;
    }
}