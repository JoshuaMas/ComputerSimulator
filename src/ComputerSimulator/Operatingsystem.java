package ComputerSimulator;

import java.util.ArrayList;

/*

-Project: ComputerSimulator.Computer simulator

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
    public void installsoftware(Software osSoftware) {
        this.osSoftwares.add(osSoftware);
    }

    // Metodo para desinstalar software
    public void uninstallsoftware(Software osSoftware) {
        this.osSoftwares.remove(osSoftware);

    }

    // Getters

    public String getOsName() {
        return this.osName;
    }

    public String getOsVersion() {
        return this.osVersion;
    }

    public String getOsArchitecture() {
        return this.osArchitecture;
    }

    public boolean getOsOnlyCommand() {
        return this.osOnlyCommand;
    }

    public int getOsSpaceRequirement() {
        return this.osSpaceRequirement;
    }

    public int getOsRamMemoryRequirement() {
        return this.osRamMemoryRequirement;
    }
    // Setters

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public void setOsArchitecture(String osArchitecture) {
        this.osArchitecture = osArchitecture;
    }

    public void setOsOnlyCommand(boolean osOnlyCommand) {
        this.osOnlyCommand = osOnlyCommand;
    }

    public void setOsSpaceRequirement(int osSpaceRequirement) {
        this.osSpaceRequirement = osSpaceRequirement;
    }

    public void setOsRamMemoryRequirement(int osRamMemoryRequirement) {
        this.osRamMemoryRequirement = osRamMemoryRequirement;
    }

}