package Assignments_OOPs.Question2;

abstract class Instrument {
    abstract void play();
}

class Flute extends Instrument {
    @Override
    void play() {
        System.out.println("Flute is playing toot toot toot toot");
    }
}

class Guitar extends Instrument {
    @Override
    void play() {
        System.out.println("Guitar is playing tin tin tin");
    }
}

class Piano extends Instrument {
    @Override
    void play() {
        System.out.println("Piano is playing tan tan tan tan");
    }
}

public class InstrumentDriver {
    public static void main(String[] args) {

        Instrument[] instruments = new Instrument[10];

        for (int i = 0; i < instruments.length; i++) {
            if (i % 3 == 0) {
                instruments[i] = new Piano();
            } else if (i % 3 == 1) {
                instruments[i] = new Flute();
            } else {
                instruments[i] = new Guitar();
            }
        }

        for (int i = 0; i < instruments.length; i++) {
            if (instruments[i] instanceof Piano) {
                System.out.print("Instrument at index " + i + " is a Piano. ");
            } else if (instruments[i] instanceof Flute) {
                System.out.print("Instrument at index " + i + " is a Flute. ");
            } else if (instruments[i] instanceof Guitar) {
                System.out.print("Instrument at index " + i + " is a Guitar. ");
            }
            instruments[i].play();
        }
    }
}