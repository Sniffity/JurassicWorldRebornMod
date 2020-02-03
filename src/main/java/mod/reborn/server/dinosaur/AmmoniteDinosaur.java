package mod.reborn.server.dinosaur;

import mod.reborn.server.entity.Diet;
import mod.reborn.server.entity.dinosaur.AmmoniteEntity;
import mod.reborn.server.food.FoodType;
import mod.reborn.server.period.TimePeriod;

public class AmmoniteDinosaur extends Dinosaur {
    public static final double SPEED = 0.3F;
    public AmmoniteDinosaur() {
        super();
        this.setName("Ammonite");
        this.setDinosaurType(DinosaurType.SCARED);
        this.setDinosaurClass(AmmoniteEntity.class);
        this.setTimePeriod(TimePeriod.TRIASSIC);
        this.setEggColorMale(0xE4936B, 0xBC5312);
        this.setEggColorFemale(0xE4936B, 0xB86D1B);
        this.setHealth(10, 40);
        this.setSpeed((SPEED -0.15), SPEED);
        this.setStorage(27);
        this.setStrength(1, 20);
        this.setMaximumAge(fromDays(45));
        this.setMarineAnimal(true);
        this.setEyeHeight(0.45F, 1.6F);
        this.setSizeX(0.3F, 1.4F);
        this.setSizeY(0.5F, 1.8F);
        this.setMarineAnimal(true);
        this.setBirthType(BirthType.LIVE_BIRTH);
        this.setDiet(Diet.PISCIVORE.get().withModule(new Diet.DietModule(FoodType.FILTER)));
        this.setBones("perisphinctes_beak", "shell_cover");
        this.setHeadCubeName("Head");
        this.setScale(1.0F, 0.5F);
        this.setBreeding(true, 0, 3, 20, false, false);
        this.setImprintable(false);
        this.setOffset(0, 0.2f, 0);
    }
}
