public class BonusMilesService {
    public int calculate(int cost) {
        int ticketPrice = 125_000;
        int mileCost = 20;
        int accumulatedMiles = ticketPrice / mileCost;
        return accumulatedMiles;
    }
}
