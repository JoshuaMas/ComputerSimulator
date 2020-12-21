import java.util.ArrayList;

/*

-Project: Computer simulator

-Date: 04/12/2020

-Created by: Joshua Mas

*/
// Clase principal con atributos
public class Operatingsystem {
    private String osName;
    private String osVersion;
    private String osArchitecture;
    private boolean osOnlyCommand;
    private int osSpaceRequirement;
    private int osRamMemoryRequirement;
    // Instanciamos el Array List
    private ArrayList<Software> osSoftwares = new ArrayList<Software>();

    // Constructor default
    public Operatingsystem() {
    }

    // Constructor
    public Operatingsystem(String osName, String osVersion, String osArchitecture, boolean osOnlyCommand, int osSpaceRequirement, int osRamMemoryRequirement) {
        this.osName = osName;
        this.osVersion = osVersion;
        this.osArchitecture = osArchitecture;
        this.osOnlyCommand = osOnlyCommand;
        this.osSpaceRequirement = osSpaceRequirement;
        this.osRamMemoryRequirement = osRamMemoryRequirement;
    }

    // Metodo para instalar software
    public void installsoftware(Software osSoftware, Computer c) {
        if (osSoftware.getSoftwareRamMemoryRequirement() <= c.getRamMemory() && osSoftware.getSoftwareSpaceRequirement() <= c.getHardDisk()) {
            this.osSoftwares.add(osSoftware);
            c.setRamMemory(c.getRamMemory() - osSoftware.getSoftwareRamMemoryRequirement());
            c.setHardDisk(c.getHardDisk() - osSoftware.getSoftwareSpaceRequirement());
        } else
            System.out.println("No hay espacio en el disco");
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getOsArchitecture() {
        return osArchitecture;
    }

    public void setOsArchitecture(String osArchitecture) {
        this.osArchitecture = osArchitecture;
    }

    public boolean isOsOnlyCommand() {
        return osOnlyCommand;
    }

    public void setOsOnlyCommand(boolean osOnlyCommand) {
        this.osOnlyCommand = osOnlyCommand;
    }

    public int getOsSpaceRequirement() {
        return osSpaceRequirement;
    }

    public void setOsSpaceRequirement(int osSpaceRequirement) {
        this.osSpaceRequirement = osSpaceRequirement;
    }

    public int getOsRamMemoryRequirement() {
        return osRamMemoryRequirement;
    }

    public void setOsRamMemoryRequirement(int osRamMemoryRequirement) {
        this.osRamMemoryRequirement = osRamMemoryRequirement;
    }

    public ArrayList<Software> getOsSoftwares() {
        return osSoftwares;
    }

    public void setOsSoftwares(ArrayList<Software> osSoftwares) {
        this.osSoftwares = osSoftwares;
    }

    // Metodo para desinstalar software
    public void uninstallsoftware(Software osSoftware, Computer c) {
        if (c.getHardDisk() > osSoftware.getSoftwareSpaceRequirement() && c.getRamMemory() > osSoftware.getSoftwareRamMemoryRequirement()) {
            c.setHardDisk(c.getHardDisk() + osSoftware.getSoftwareSpaceRequirement());
            c.setRamMemory(c.getRamMemory() + osSoftware.getSoftwareRamMemoryRequirement());
            this.osSoftwares.remove(osSoftware);
        } else {
            System.out.println("No tienes espacio para instalar el Sistema operaivo.");

        }
    }
}
