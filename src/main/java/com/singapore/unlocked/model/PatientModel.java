package com.singapore.unlocked.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Patient")

public class PatientModel {
    @Id 
    private String id;

    @Field(value="ID")
    private String patientId;
    @Field(value = "Name")
    private String name;
    @Field(value = "CognitiveRating")
    private double cognitiveRatings;
    @Field(value = "SocialRating")
    private double socialRatings;
    @Field(value = "PhysicalRating")
    private double physicalRatings;
    @Field(value = "GamesPlayed")
    private GamesPlayed gamesPlayed;

    public String getId()
    {
        return this.id;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    
    public String getPatientId()
    {
        return this.patientId;
    }

    public void setPatientId(String patientId)
    {
        this.patientId = patientId;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getCognitiveRatings()
    {
        return this.cognitiveRatings;
    }
    
    public void setCognitiveRatings(double cogRat)
    {
        this.cognitiveRatings = cogRat;
    }

    public double getPhysicalRatings()
    {
        return this.physicalRatings;
    }

    public void setPhysicalRatings(double phyRat)
    {
        this.physicalRatings = phyRat;
    }

    public double getSocialRatings()
    {
        return this.socialRatings;
    }
    public void setSocialRatings(double socRat)
    {
        this.socialRatings = socRat;
    }

    public GamesPlayed getGamesPlayed()
    {
        return this.gamesPlayed;
    }

    public void setGamesPlayed(GamesPlayed gamesPlayed)
    {
        this.gamesPlayed = gamesPlayed;
    }

    public PatientModel(String id, String patientId, String name, double cognitiveRatings, double physicalRatings, double socialRatings, GamesPlayed gamesPlayed ) {
        this.id = id;
        this.patientId = patientId;
        this.name = name;
        this.cognitiveRatings = cognitiveRatings;
        this.physicalRatings = physicalRatings;
        this.socialRatings = socialRatings;
        this.gamesPlayed = gamesPlayed;
    }




    class GamesPlayed
    {
        @Field(value = "ImageMatching")
        ImageMatching imageMatching;
        @Field(value = "SoundMatching")
        SoundMatching soundMatching;
        @Field(value = "Concentration")
        Concentration concentration;

        public ImageMatching getImageMatching() {
            return this.imageMatching;
        }

        public void setImageMatching(ImageMatching imageMatching) {
            this.imageMatching = imageMatching;
        }

        public SoundMatching getSoundMatching() {
            return this.soundMatching;
        }

        public void setSoundMatching(SoundMatching soundMatching) {
            this.soundMatching = soundMatching;
        }

        public Concentration getConcentration() {
            return this.concentration;
        }

        public void setConcentration(Concentration concentration) {
            this.concentration = concentration;
        }

        public GamesPlayed(ImageMatching imageMatching, SoundMatching soundMatching, Concentration concentration)
        {
            this.imageMatching = imageMatching;
            this.soundMatching = soundMatching;
            this.concentration = concentration;

        }

      






        class ImageMatching
        {
            @Field("NumberOfTimesPlayed")
            private int numberOfTimesPlayed;
            @Field("Level1")
            private Level1 level1;
            @Field("Level2")
            private Level2 level2;
            @Field("Level3")
            private Level3 level3;



            public int getNumberOfTimesPlayed() {
                return this.numberOfTimesPlayed;
            }

            public void setNumberOfTimesPlayed(int numberOfTimesPlayed) {
                this.numberOfTimesPlayed = numberOfTimesPlayed;
            }

            public Level1 getLevel1() {
                return this.level1;
            }

            public void setLevel1(Level1 level1) {
                this.level1 = level1;
            }

            public Level2 getLevel2() {
                return this.level2;
            }

            public void setLevel2(Level2 level2) {
                this.level2 = level2;
            }

            public Level3 getLevel3() {
                return this.level3;
            }

            public void setLevel3(Level3 level3) {
                this.level3 = level3;
            }

            public ImageMatching(int numberOfTimesPlayed, Level1 level1, Level2 level2, Level3 level3)
            {
                this.numberOfTimesPlayed = numberOfTimesPlayed;
                this.level1 = level1;
                this.level2 = level2;
                this.level3 = level3;
            }
            

        }
        class SoundMatching
        {
           
            @Field("NumberofTimesPlayed")
            private int numberOfTimesPlayed;
            @Field("Level1")
            private Level1 level1;
            @Field("Level2")
            private Level2 level2;
            @Field("Level3")
            private Level3 level3;



            public int getNumberOfTimesPlayed() {
                return this.numberOfTimesPlayed;
            }

            public void setNumberOfTimesPlayed(int numberOfTimesPlayed) {
                this.numberOfTimesPlayed = numberOfTimesPlayed;
            }

            public Level1 getLevel1() {
                return this.level1;
            }

            public void setLevel1(Level1 level1) {
                this.level1 = level1;
            }

            public Level2 getLevel2() {
                return this.level2;
            }

            public void setLevel2(Level2 level2) {
                this.level2 = level2;
            }

            public Level3 getLevel3() {
                return this.level3;
            }

            public void setLevel3(Level3 level3) {
                this.level3 = level3;
            }

            public SoundMatching(int numberOfTimesPlayed, Level1 level1, Level2 level2, Level3 level3)
            {
                this.numberOfTimesPlayed = numberOfTimesPlayed;
                this.level1 = level1;
                this.level2 = level2;
                this.level3 = level3;
            }


        }
        class Concentration
        {
            @Field("NumberofTimesPlayed")
            private int numberOfTimesPlayed;
            @Field("Level1")
            private Level1 level1;
            @Field("Level2")
            private Level2 level2;
            @Field("Level3")
            private Level3 level3;



            public int getNumberOfTimesPlayed() {
                return this.numberOfTimesPlayed;
            }

            public void setNumberOfTimesPlayed(int numberOfTimesPlayed) {
                this.numberOfTimesPlayed = numberOfTimesPlayed;
            }

            public Level1 getLevel1() {
                return this.level1;
            }

            public void setLevel1(Level1 level1) {
                this.level1 = level1;
            }

            public Level2 getLevel2() {
                return this.level2;
            }

            public void setLevel2(Level2 level2) {
                this.level2 = level2;
            }

            public Level3 getLevel3() {
                return this.level3;
            }

            public void setLevel3(Level3 level3) {
                this.level3 = level3;
            }

            public Concentration(int numberOfTimesPlayed, Level1 level1, Level2 level2, Level3 level3)
            {
                this.numberOfTimesPlayed = numberOfTimesPlayed;
                this.level1 = level1;
                this.level2 = level2;
                this.level3 = level3;
            }

        }


        class Level1
        {

            @Field("NumberofTimesPlayed")
            private int numberOfTimesPlayed;
            @Field("Plays") 
            private Plays[] plays;

            public int getNumberOfTimesPlayed() {
                return this.numberOfTimesPlayed;
            }

            public void setNumberOfTimesPlayed(int numberOfTimesPlayed) {
                this.numberOfTimesPlayed = numberOfTimesPlayed;
            }

            public Plays[] getPlays() {
                return this.plays;
            }

            public void setPlays(Plays[] plays) {
                this.plays = plays;
            }


            public Level1(int numberOfTimesPlayed, Plays[] plays)
            {
                this.numberOfTimesPlayed = numberOfTimesPlayed;
                this.plays = plays;
            }

        }
        class Level2
        {
            @Field("NumberofTimesPlayed")
            private int numberOfTimesPlayed;
            @Field("Plays") 
            private Plays[] plays;

            public int getNumberOfTimesPlayed() {
                return this.numberOfTimesPlayed;
            }

            public void setNumberOfTimesPlayed(int numberOfTimesPlayed) {
                this.numberOfTimesPlayed = numberOfTimesPlayed;
            }

            public Plays[] getPlays() {
                return this.plays;
            }

            public void setPlays(Plays[] plays) {
                this.plays = plays;
            }


            public Level2(int numberOfTimesPlayed, Plays[] plays)
            {
                this.numberOfTimesPlayed = numberOfTimesPlayed;
                this.plays = plays;
            }
        }
        class Level3
        {
            @Field("NumberofTimesPlayed")
            private int numberOfTimesPlayed;
            @Field("Plays") 
            private Plays[] plays;

            public int getNumberOfTimesPlayed() {
                return this.numberOfTimesPlayed;
            }

            public void setNumberOfTimesPlayed(int numberOfTimesPlayed) {
                this.numberOfTimesPlayed = numberOfTimesPlayed;
            }

            public Plays[] getPlays() {
                return this.plays;
            }

            public void setPlays(Plays[] plays) {
                this.plays = plays;
            }


            public Level3(int numberOfTimesPlayed, Plays[] plays)
            {
                this.numberOfTimesPlayed = numberOfTimesPlayed;
                this.plays = plays;
            }
        }


        class Plays
        {
          


            @Field("CurrentPlay")
            private int currentPlay;
            @Field("Time")
            private int time;
            @Field("Incorrect")
            private int incorrect;

            public int getCurrentPlay() {
                return this.currentPlay;
            }

            public void setCurrentPlay(int currentPlay) {
                this.currentPlay = currentPlay;
            }

            public int getTime() {
                return this.time;
            }

            public void setTime(int time) {
                this.time = time;
            }

            public int getIncorrect() {
                return this.incorrect;
            }

            public void setIncorrect(int incorrect) {
                this.incorrect = incorrect;
            }
            public Plays(int currentPlay, int time, int incorrect)
            {
                this.currentPlay = currentPlay;
                this.time = time;
                this.incorrect = incorrect;
            }



        }
     

    }





    
}


