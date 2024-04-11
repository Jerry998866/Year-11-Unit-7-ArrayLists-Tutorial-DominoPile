public class Domino {
    private int top;
    private int bottom;
    public Domino(){
        top = 0;
        bottom = 0;
    }

    public Domino(int top, int bottom){
        this.top = top;
        this.bottom = bottom;
    }

    public int getTop() {
        return top;
    }

    public int getBottom(){
        return bottom;
    }

    public void setTop(int top){
        this.top = top;
    }

    public void setBottom(int bottom){
        this.bottom = bottom;
    }

    public String toString(){
        return top+"/"+bottom;
    }

    public void flip() {
        int storeTop = top;
        top = bottom;
        bottom = storeTop;
    }

    public void settle(){
        if (top>bottom){
            flip();
        }
    }

    public int compareTo(Domino other){
        settle();
        other.settle();
        if (this.top>other.top){
            return 1;
        }
        else if (this.top<other.top){
            return -1;
        }
        else{
            if (this.bottom>other.bottom){
                return 1;
            }
            else if (this.bottom<other.bottom){
                return -1;
            }
            else {
                return 0;
            }
        }
    }

    public int compareToWeight(Domino other){
        if (this.bottom+this.top>other.bottom+other.top){
            return 1;
        }
        else if (this.bottom+this.top<other.bottom+other.top){
            return -1;
        }
        else{
            return 0;
        }
    }
    public boolean canConnect(Domino other){
        if (this.top == other.top){
            return true;
        }
        else if (this.bottom == other.bottom){
            return true;
        }
        else if (this.top == other.bottom){
            return true;
        }
        else if (this.bottom == other.top){
            return true;
        }
        else{
            return false;
        }
    }

}