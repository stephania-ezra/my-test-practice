package seleniuminterviewquestions;

public class TechlisticRow {

    private String structure;
    private String country;
    private String city;
    private String heightAsString;
    private int built;
    private int rank;
    private int height;

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHeightAsString() {
        return heightAsString;
    }

    public void setHeightAsString(String heightAsString) {
        this.heightAsString = heightAsString;
        String[] heightSplit = this.heightAsString.split("m");
        this.height = Integer.parseInt(heightSplit[0]);
    }

    public int getBuilt() {
        return built;
    }

    public void setBuilt(int built) {
        this.built = built;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getHeight() {
        return height;
    }


    @Override
    public String toString() {
        return "TechlisticRow{" +
                "structure='" + structure + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", heightAsString='" + heightAsString + '\'' +
                ", built=" + built +
                ", rank=" + rank +
                ", height=" + height +
                '}';
    }
}
