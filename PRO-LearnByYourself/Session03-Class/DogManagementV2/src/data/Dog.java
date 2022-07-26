
package data;
//Khuon dung de duc ra cac object
//Khuon phai kin, có pheu de rot data, nguyen lieu vao
public class Dog {

    private String name;    //_________________
    private int yob;        //_________________
    private double weight;  //_________________

    public Dog(String name, int yob, double weight) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public void bark(){
        System.out.println("Gau gau");
    }
    
    
    
}
