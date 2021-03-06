package ComputerSimulator;

/*

-Project: ComputerSimulator.Computer simulator

-Date: 04/12/2020

-Created by: Joshua Mas

*/
public class Software {
    private String softwareName;
    private String softwareVersion;
    private int softwareSpaceRequirement;
    private int softwareRamMemoryRequirement;

    // Constructor default
    public Software(){
    }
    // Constructor
    public Software(String softwareName, String softwareVersion, int softwareSpaceRequirement, int softwareRamMemoryRequirement){
        this.softwareName = softwareName;
        this.softwareVersion = softwareVersion;
        this.softwareSpaceRequirement = softwareSpaceRequirement;
        this.softwareRamMemoryRequirement = softwareRamMemoryRequirement;
    }
    // Getters
    public String getSoftwareName(){
        return this.softwareName;
    }

    public String getSoftwareVersion(){
        return this.softwareVersion;
    }

    public int getSoftwareSpaceRequirement(){
        return this.softwareSpaceRequirement;
    }

    public int getSoftwareRamMemoryRequirement(){
        return this.softwareRamMemoryRequirement;
    }

    // Setters
    public void setSoftwareName(String softwareName){
        this.softwareName = softwareName;
    }

    public void setSoftwareVersion(String softwareVersion){
        this.softwareVersion = softwareVersion;
    }

    public void setSoftwareSpaceRequirement(int softwareSpaceRequirement){
        this.softwareSpaceRequirement = softwareSpaceRequirement;
    }

    public void setSoftwareRamMemoryRequirement(int softwareRamMemoryRequirement){
        this.softwareRamMemoryRequirement = softwareRamMemoryRequirement;
    }


}
