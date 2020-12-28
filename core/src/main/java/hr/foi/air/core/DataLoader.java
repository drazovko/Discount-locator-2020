package hr.foi.air.core;

public interface DataLoader {
    //ovo je test
    void loadData(DataLoadedListener listener); //Async
    boolean isDataLoaded();
}
