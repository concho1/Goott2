package ch07;
class Drink{
    String name;
    int cost;

    Drink(String name, int cost){
        this.name = name;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    void dPrint(){
        System.out.println(this.name + "  " + this.cost);
    }
}

public class Drink_08 {
    public static void main(String[] args) {
        Drink[] arr = new Drink[5];
        arr[0] = new Drink("포카리", 2300);
        arr[1] = new Drink("콜라", 2100);
        arr[2] = new Drink("옥수수 수염차", 2300);
        arr[3] = new Drink("솔의눈", 2500);
        arr[4] = new Drink("몬스터", 2000);

        for(int i=0; i<5; i++){
            arr[i].dPrint();
        }

    }
}
