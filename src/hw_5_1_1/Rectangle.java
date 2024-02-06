package hw_5_1_1;

public class Rectangle {
    int col;
    int row;
    Rectangle(int col, int row){
        this.col = col;
        this.row = row;
    }
    public int area(){
        return this.col * this.row;
    }
    public int range(){
        return 2*(this.col + this.row);
    }
}
