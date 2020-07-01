package be.stip.soundboard.helpers;

import java.util.ArrayList;

import javax.inject.Inject;

import be.stip.soundboard.models.Sound;

public class SoundHelper implements ISoundHelper {

    private static final ArrayList<Sound> SOUNDS = getSoundList();

    @Inject
    public SoundHelper() {}

    public ArrayList<Sound> getSounds() {
        return SOUNDS;
    }

    private static ArrayList<Sound> getSoundList() {
        ArrayList<Sound> sounds = new ArrayList<>(36);

        sounds.add(new Sound("Doe is normaal!", "doeIsNormaal"));
        sounds.add(new Sound("Heey daar is die lens jom!", "heeyDaarIsDieLensJom"));
        sounds.add(new Sound("Flipse papegaai", "flipsePapegaai"));
        sounds.add(new Sound("Ik zen hiejelemaal eweg", "ikZenHiejelemaalEweg"));
        sounds.add(new Sound("Flipse awel jom…", "flipseAwelJom"));
        sounds.add(new Sound("Hey matekes", "heyMatekes"));
        sounds.add(new Sound("Geflitsth", "geflitsth"));
        sounds.add(new Sound("Kop tegen schilderij", "kopTegenSchilderij"));
        sounds.add(new Sound("Ozze papa hoert da nie", "ozzePapaHoertDaNie"));
        sounds.add(new Sound("Papaa!", "papaa"));
        sounds.add(new Sound("Pussycat", "pussycat"));
        sounds.add(new Sound("Stannie is porno", "stannieIsPorno"));
        sounds.add(new Sound("De miekes", "deMiekes"));
        sounds.add(new Sound("Zwijgeeeeuh", "zwijgeeeeuh"));
        sounds.add(new Sound("Annalisa leren", "annalisaLeren"));
        sounds.add(new Sound("Vlieger", "vlieger"));
        sounds.add(new Sound("Tis gedaan", "tisGedaan"));
        sounds.add(new Sound("Geregeld", "geregeld"));
        sounds.add(new Sound("Alle hoere moete zwijge", "alleHoereMoeteZwijge"));
        sounds.add(new Sound("Jeroen pauw", "jeroenPauw"));
        sounds.add(new Sound("Daar gaat ie weer", "daarGaatIeWeer"));
        sounds.add(new Sound("Hatsikideej", "hatsikideej"));
        sounds.add(new Sound("Grootgebracht met melk", "grootgebrachtMetMelk"));
        sounds.add(new Sound("Belachelijk", "belachelijk"));
        sounds.add(new Sound("Deux bouteilles de vino", "deuxBouteillesDeVino"));
        sounds.add(new Sound("Goesting om te kappen", "goestingOmTeKappen"));
        sounds.add(new Sound("Hoerenzoonnn", "hoerenzoonnn"));
        sounds.add(new Sound("Ik haat sossen", "ikHaatSossen"));
        sounds.add(new Sound("Kakken en zwijgen", "kakkenEnZwijgen"));
        sounds.add(new Sound("Leuvense janetten", "leuvenseJanetten"));
        sounds.add(new Sound("BMI van 30", "bmiVan30"));
        sounds.add(new Sound("Alle venten zijn homo", "alleVentenZijnHomo"));
        sounds.add(new Sound("Ik pak elle zoewe", "ikPakElleZoewe"));
        sounds.add(new Sound("Muziek gedaan", "muziekGedaan"));
        sounds.add(new Sound("Gene vechter", "geneVechter"));
        sounds.add(new Sound("Dikke janet", "dikkeJanet"));
        sounds.add(new Sound("Michiel Reyners janet", "michielReynersJanet"));
        sounds.add(new Sound("J'ai dronki ponki", "jAiDronkiPonki"));
        sounds.add(new Sound("Emma zatte lach", "emmaZatteLach"));
        sounds.add(new Sound("Lowe muih", "loweMuih"));

        return sounds;
    }
}
