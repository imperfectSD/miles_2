public class BonusMilesService {
    public int calculate(int price) {
        int mileCost = 20;
        int miles = price / mileCost;
        return miles;
    }
}
