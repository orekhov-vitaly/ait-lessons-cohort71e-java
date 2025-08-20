package homeworks.homework_33;

public class FilterByWeight implements Filter{
    @Override
    public boolean filter(Cat cat) {
        return cat.getWeight() > 5;
    }
}
