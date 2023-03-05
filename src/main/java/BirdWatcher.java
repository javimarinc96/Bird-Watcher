
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        if(this.birdsPerDay.length >= 6){
            return this.birdsPerDay[6];
        }
        return 0;        
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[6] = this.birdsPerDay[6] + 1;
    }

    public boolean hasDayWithoutBirds() {
        for(int dailyCount: this.birdsPerDay){
            if(dailyCount == 0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int res = 0;
        for (int i = 0; i < numberOfDays; i++) {
            if(i <= this.birdsPerDay.length - 1){
                res += this.birdsPerDay[i];
            }
        }    
        return res;
    }

    public int getBusyDays() {
        int res = 0;
        for(int dailyCount: this.birdsPerDay){
            if(dailyCount >= 5){
                res++;
            }
        }   
        return res;
    }
}
