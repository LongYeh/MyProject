package yeh.pratice;

public class Person {
    private String name;
    private double weight;
    private double height;
    private double bmi;

    public Person(double w,double h){
        this.weight=w;
        this.height=h;
    }

    public Person(String n,double w,double h){

        weight=w;
        height=h;
        name=n;

    }


    public double bmi(){

        bmi=weight/(height*height);
        return bmi;
    }

    public void show(double weight,double height,String name){

        System.out.println("name="+name);
        System.out.println("weight="+weight);
        System.out.println("height="+height);
        bmi=weight/(height*height);
        System.out.println("BMI="+bmi);

    }

    public void show(){
        System.out.println("name="+this.name);
        System.out.println("weight="+this.weight);
        System.out.println("height="+this.height);
        System.out.println("BMI="+this.bmi());
    }
}
