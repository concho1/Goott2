package hw_5_1_1;

public class Person {
    String name;
    String gender;
    int age;

    Person(String name, String gender, int age){
        this.name = name;
        this.gender = gender.equals("male") ? "남자" : "여자";
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setGender(String gender) {
        this.gender = gender.equals("male") ? "남자" : "여자";
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {

        return name;
    }
    public String getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }

    public void printAll(){
        System.out.println("================================");
        System.out.printf("이름 : %s\n",this.name);
        System.out.printf("성별 : %s\n",this.gender);
        System.out.printf("나이 : %d\n",this.age);
    }
}
