package ru.mai.is.tmp.students.N.Hierarhy;

public class TestDriveDrugs {
    public static void main(String[] args) {
        Drugs lsd = new Hallucinogens();
        Drugs heroin = new Opiates();
        Drugs ephedrine = new Ephedrine();
        heroin.dependence = "очень сильная";
        lsd.dependence = "слабая";
        lsd.DependingOnTheStrength();
        heroin.DependingOnTheStrength();
        ephedrine.DependingOnTheStrength();
        lsd.SingsOfUse();
        heroin.SingsOfUse();
        ephedrine.SingsOfUse();
        ephedrine.Treatment();
    }
}
