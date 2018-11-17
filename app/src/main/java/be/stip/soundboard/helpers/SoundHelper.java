package be.stip.soundboard.helpers;

import java.util.LinkedList;
import java.util.List;

import javax.inject.Inject;

import be.stip.soundboard.models.Sound;

public class SoundHelper implements ISoundHelper {

    private static final List<Sound> SOUNDS = getSoundList();

    @Inject
    public SoundHelper() {}

    public List<Sound> getSounds() {
        return SOUNDS;
    }

    private static List<Sound> getSoundList() {
        List<Sound> sounds = new LinkedList<Sound>();

        sounds.add(new Sound("Doe is normaal!", "doeIsNormaal", 'a'));
        sounds.add(new Sound("Heey daar is die lens jom!", "heeyDaarIsDieLensJom", 'b'));
        sounds.add(new Sound("Flipse papegaai", "flipsePapegaai", 'c'));
        sounds.add(new Sound("Ik zen hiejelemaal eweg", "ikZenHiejelemaalEweg", 'd'));
        sounds.add(new Sound("Flipse awel jom…", "flipseAwelJom", 'e'));
        sounds.add(new Sound("Hey matekes", "heyMatekes", 'f'));
        sounds.add(new Sound("Geflitsth", "geflitsth", 'g'));
        sounds.add(new Sound("Kop tegen schilderij", "kopTegenSchilderij", 'h'));
        sounds.add(new Sound("Ozze papa hoert da nie", "ozzePapaHoertDaNie", 'i'));
        sounds.add(new Sound("Papaa!", "papaa", 'j'));
        sounds.add(new Sound("Pussycat", "pussycat", 'k'));
        sounds.add(new Sound("Stannie is porno", "stannieIsPorno", 'l'));
        sounds.add(new Sound("De miekes", "deMiekes", 'm'));
        sounds.add(new Sound("Zwijgeeeeuh", "zwijgeeeeuh", 'n'));
        sounds.add(new Sound("Annalisa leren", "annalisaLeren", 'o'));
        sounds.add(new Sound("Vlieger", "vlieger", 'p'));
        sounds.add(new Sound("Tis gedaan", "tisGedaan", 'q'));
        sounds.add(new Sound("Geregeld", "geregeld", 'r'));
        sounds.add(new Sound("Alle hoere moete zwijge", "alleHoereMoeteZwijge", 's'));
        sounds.add(new Sound("Jeroen pauw", "jeroenPauw", 't'));
        sounds.add(new Sound("Daar gaat ie weer", "daarGaatIeWeer", 'u'));
        sounds.add(new Sound("Hatsikideej", "hatsikideej", 'v'));
        sounds.add(new Sound("Grootgebracht met melk", "grootgebrachtMetMelk", 'w'));
        sounds.add(new Sound("Belachelijk", "belachelijk", 'x'));
        sounds.add(new Sound("Deux bouteilles de vino", "deuxBouteillesDeVino", 'y'));
        sounds.add(new Sound("Goesting om te kappen", "goestingOmTeKappen", 'z'));
        sounds.add(new Sound("Hoerenzoonnn", "hoerenzoonnn", '0'));
        sounds.add(new Sound("Ik haat sossen", "ikHaatSossen", '1'));
        sounds.add(new Sound("Kakken en zwijgen", "kakkenEnZwijgen", '2'));
        sounds.add(new Sound("Leuvense janetten", "leuvenseJanetten", '3'));
        sounds.add(new Sound("BMI van 30", "bmiVan30", '4'));
        sounds.add(new Sound("Alle venten zijn homo", "alleVentenZijnHomo", '5'));

        return sounds;
    }
}
