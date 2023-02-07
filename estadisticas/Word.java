package estadisticas;
public class Word implements Comparable<Word>{
    private String text;
    private int count;

    public Word (String text, int count){
        this.text = text;
        this.count = count;
    }

    public String getText(){
        return this.text;
    }

    public int getCount(){
        return this.count;
    }

    public int setCount(int _count){
        return this.count = _count;
    }

    public int inc(){
        return this.count++;
    }

    public int dec(){
        return this.count--;
    }

    @Override
    public String toString(){
        return this.text + String.format(" (%d)", this.count);
    }

    @Override
    public boolean equals(Object o){
        return this==o || (o.getClass() == this.getClass() && this.text.equals(((Word)o).text));
    }

    @Override
    public int compareTo(Word o) {
        Integer v1 = (Integer)this.count;
        return v1.compareTo((Integer)o.count);
    }
}
