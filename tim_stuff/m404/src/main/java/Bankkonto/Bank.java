package Bankkonto;

import java.util.Random;
import java.util.Scanner;

public class Bank {
    Scanner scanner = new Scanner(System.in);
    public Bank() {
        run();
    }

    public static void main(String[] args) {
        new Bank();
    }

    public void run() {
        int amountKonten = 5;
        int amountKunden = amountKonten;

        String[] vornamen = {"Phillip", "Tim", "Marc", "Alyssa", "Magnus", "Moritz"};
        String[] nachnamen = {"Jerebic", "Irmler", "Fuchs", "Heimlicher", "Goetz", "Gasbichler"};
        Kunde[] kunden = new Kunde[amountKunden];
        for(int i=0; i<amountKunden; i++) {
            kunden[i] = new Kunde(i+1, vornamen[getRandomIndex(vornamen.length)], nachnamen[getRandomIndex(nachnamen.length)], ((int) (Math.random() * 100))+1);
        }

        Konto[] konten = new Konto[amountKonten];
        for(int i=0; i<amountKonten; i++) {
            long min = 100L;
            long max = 10000L;
            long amountMoney = min + (long) (Math.random() * (max - min));
            konten[i] = new Konto(i+1,amountMoney, kunden[i]);
        }

        for(Konto konto : konten) {
            System.out.println(konto.toString());
            System.out.println("\n");
        }

        // Simulate
        for(Konto konto : konten) {
            simulate(konto, konten);
        }

        boolean exit = false;
        while(!exit) {
            boolean b = false;
            int targetBankaccount = -1;
            while(!b) {
                System.out.println("\n");
                System.out.println("Welches Konto möchtest du dir ansehen? ");
                for (Konto konto : konten) {
                    System.out.println("(" + konto.getId() + ") " + konto.getKontoBesitzer().getVorname() + " " + konto.getKontoBesitzer().getNachname());
                }
                System.out.println("Um das Programm zu beenden, schreibe \"exit\" oder \"close\"");
                System.out.print("Deine Eingabe > ");
                String input = scanner.nextLine();

                try {
                    targetBankaccount = Integer.parseInt(input);
                    if(targetBankaccount > konten.length) {
                        System.out.println("Deine Zahl kann nicht grösser als " + konten.length + " sein!");
                    } else if(targetBankaccount < 1) {
                        System.out.println("Deine Zahl kann nicht kleiner als " + 1 + " sein!");
                    } else {
                        targetBankaccount-=1;
                        b = true;
                    }
                } catch (NumberFormatException e) {
                    if(input.equals("exit") || input.equals("close")) {
                        b = true;
                        exit = true;
                    } else {
                        System.out.println("Bitte gebe eine Zahl ein!");
                    }
                }
            }

            System.out.println("\n\n");
            konten[targetBankaccount].printTransactionHistory();
            System.out.println("\n");
            System.out.println(konten[targetBankaccount].toString());
        }
    }

    public boolean abheben(Konto konto, long amount, Date when) {
        long _amountMoney = konto.getAmountMoney();
        if (amount > _amountMoney) {
            konto.addTransaction(konto.transactionId++, konto, when, _amountMoney, -amount, TransaktionStatus.FAILED, TransaktionsTypen.ABHEBEN);
            return false;
        }

        konto.amountMoney-=amount;

        konto.addTransaction(konto.transactionId++, konto, when, _amountMoney, -amount, TransaktionStatus.DONE, TransaktionsTypen.ABHEBEN);
        return true;
    }

    public boolean zahlen(Konto from, Konto to, long amount, Date when) {
        long _amountMoney = from.getAmountMoney();
        if (amount > _amountMoney) {
            from.addTransaction(from.transactionId++, from, to, when, _amountMoney, -amount, TransaktionStatus.FAILED, TransaktionsTypen.ZAHLEN);
            return false;
        }

        from.amountMoney-=amount;
        eingehendeZahlung(from, to, amount, when);

        from.addTransaction(from.transactionId++, from, to, when, _amountMoney, -amount, TransaktionStatus.DONE, TransaktionsTypen.ZAHLEN);
        return true;
    }
    
    public void eingehendeZahlung(Konto from, Konto to, long amount, Date when) {
        long _amountMoney = to.getAmountMoney();
        to.amountMoney+= amount;
        to.addTransaction(to.transactionId++, from, to, when, _amountMoney, amount, TransaktionStatus.DONE, TransaktionsTypen.EINGEHENDE_ZAHLUNG);
    }

    public void einzahlen(Konto konto, long amount, Date when) {
        long _amountMoney = konto.getAmountMoney();
        konto.amountMoney+=amount;
        konto.addTransaction(konto.transactionId++, konto, when, _amountMoney, amount, TransaktionStatus.DONE, TransaktionsTypen.EINZAHLEN);
    }

    private void simulate(Konto konto, Konto[] konten) {
        int howManyDaysToSimulate = 30;
        int min = 0;
        int hour = 0;
        int simulatedDaysCounter = 1;
        WeekDays weekDay = WeekDays.MONTAG;
        int amountOfWeekDays = WeekDays.values().length;
        int amountOfTransactionTypes = TransaktionsTypen.values().length;

        Random rand = new Random();

        while(simulatedDaysCounter <= howManyDaysToSimulate) {
            //System.out.println(getDate(simulatedDaysCounter, weekDay, hour, min).toString());

            float chanceOfAction = (float) Math.random();
            if(chanceOfAction >= 0.99) { // The randomness decided that the konto will do something
                int actionToDo = rand.nextInt(amountOfTransactionTypes-1);
                TransaktionsTypen transactionType = TransaktionsTypen.values()[actionToDo];
                Date when = getDate(simulatedDaysCounter, weekDay, hour, min);
                long amountToTransfer = (long) ((Math.random() + 1)*5000);
                Konto randomTo = null;

                boolean b = false;
                while(!b) {
                    randomTo = konten[getRandomIndex(konten.length)];
                    if(randomTo != konto) {
                        b = true;
                    }
                }

                switch(transactionType) {
                    case ABHEBEN:
                        abheben(konto, amountToTransfer, when);
                        break;

                    case ZAHLEN:
                        zahlen(konto, randomTo, amountToTransfer, when);
                        break;
                        
                    case EINZAHLEN:
                        einzahlen(konto, amountToTransfer, when);
                        break;

                    case EINGEHENDE_ZAHLUNG:
                        eingehendeZahlung(randomTo, konto, amountToTransfer, when);
                        break;
                }
            }

            min+=10;
            if (min == 60) {
                hour++;
                min = 0;
            }

            if (hour == 24) {
                simulatedDaysCounter++;
                hour = 0;

                if (weekDay.ordinal() < amountOfWeekDays) {
                    weekDay = weekDay.next();
                } else {
                    weekDay = WeekDays.MONTAG;
                }
            }
        }
        konto.hasBeenSimulated = true;
    }

    private Date getDate(int simulatedDayCounter, WeekDays weekday, int hour, int min) {
        return new Date(simulatedDayCounter, weekday, hour, min);
    }

    private int getRandomIndex(int arrayLength) {
        Random r = new Random();
        return r.nextInt(arrayLength);
    }
}