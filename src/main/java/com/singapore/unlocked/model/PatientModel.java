package com.singapore.unlocked.model;

import java.sql.Date;
import java.util.Hashtable;

import com.mongodb.diagnostics.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Data
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

    @PersistenceConstructor
    public PatientModel(String id, String patientId, String name, double cognitiveRatings, double physicalRatings, double socialRatings, GamesPlayed gamesPlayed ) {
        this.id = id;
        this.patientId = patientId;
        this.name = name;
        this.cognitiveRatings = cognitiveRatings;
        this.physicalRatings = physicalRatings;
        this.socialRatings = socialRatings;
        this.gamesPlayed = gamesPlayed;
    }




    public class GamesPlayed
    {
        @Field(value = "SocialGames")
        SocialGames socialGames;

        @Field(value = "PhysicalGames")
        PhysicalGames physicalGames;

        @Field(value = "CognitiveGames")
        CognitiveGames cognitiveGames;

        public SocialGames getSocialGames() {
            return this.socialGames;
        }

        public void setSocialGames(SocialGames socialGames) {
            this.socialGames = socialGames;
        }

        public PhysicalGames getPhysicalGames() {
            return this.physicalGames;
        }

        public void setPhysicalGames(PhysicalGames physicalGames) {
            this.physicalGames = physicalGames;
        }

        public CognitiveGames getCognitiveGames() {
            return this.cognitiveGames;
        }

        public void setCognitiveGames(CognitiveGames cognitiveGames) {
            this.cognitiveGames = cognitiveGames;
        }

        public GamesPlayed(SocialGames socialGames, PhysicalGames physicalGames, CognitiveGames cognitiveGames)
        {
            this.socialGames = socialGames;
            this.physicalGames = physicalGames;
            this.cognitiveGames = cognitiveGames;
            

        }
       public class SocialGames
       {
            @Field(value = "ImageMatching")
            ImageMatching imageMatching;

            public ImageMatching getImageMatching() {
                return this.imageMatching;
            }

            public void setImageMatching(ImageMatching imageMatching) {
                this.imageMatching = imageMatching;
            }




            public SocialGames(ImageMatching imageMatching)
            {
                this.imageMatching = imageMatching;
            }
       }

       public class PhysicalGames
       {

            @Field(value = "ImageMatching")
            ImageMatching imageMatching;

            public ImageMatching getImageMatching() {
                return this.imageMatching;
            }

            public void setImageMatching(ImageMatching imageMatching) {
                this.imageMatching = imageMatching;
            }

           public PhysicalGames(ImageMatching imageMatching)
           {
                this.imageMatching = imageMatching;
           }


        
        
       }
       public class CognitiveGames
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
        public CognitiveGames(ImageMatching imageMatching, SoundMatching soundMatching, Concentration concentration)
        {
            this.imageMatching = imageMatching;
            this.soundMatching = soundMatching;
            this.concentration = concentration;
        }
    }


    
    public class ImageMatching
    {
        @Field("Plays")
        private Plays[] plays;
        private int numberOfTimesPlayed;

        public Plays[] getPlays() {
            return this.plays;
        }

        public void setPlays(Plays[] plays) {
            this.plays = plays;
        }

        public int getNumberOfTimesPlayed() {
            return this.numberOfTimesPlayed;
        }

        public void setNumberOfTimesPlayed(int numberOfTimesPlayed) {
            this.numberOfTimesPlayed = numberOfTimesPlayed;
        }

        public ImageMatching(Plays[] plays, int numberOfTimesPlayed)
        {
            this.plays = plays;
            this.numberOfTimesPlayed = numberOfTimesPlayed;

        }


        public void updateNumberOfTimesPlayedInLevel()
        {
           

            Hashtable<Integer,Integer> playedCountDict = new Hashtable<Integer,Integer>();
            for (Plays play : plays) 
            {   
                if (playedCountDict.containsKey(play.getLevel()))
                {
                    playedCountDict.put(play.getLevel(), playedCountDict.get(play.getLevel()) +1 );
                }
                else
                {
                    playedCountDict.put(play.getLevel(), 1);
                }
            }
            for (Plays plays2 : plays) 
            {
                if (playedCountDict.containsKey(plays2.getLevel()))
                {
                    plays2.setTimesPlayedInLevel(playedCountDict.get(plays2.getLevel()));
                }
                
            }

        }


       




    }
    public class SoundMatching
    {
        @Field("Plays")
        private Plays[] plays;
        private int numberOfTimesPlayed;

        public Plays[] getPlays() {
            return this.plays;
        }

        public void setPlays(Plays[] plays) {
            this.plays = plays;
        }

        public int getNumberOfTimesPlayed() {
            return this.numberOfTimesPlayed;
        }

        public void setNumberOfTimesPlayed(int numberOfTimesPlayed) {
            this.numberOfTimesPlayed = numberOfTimesPlayed;
        }

        public SoundMatching(Plays[] plays, int numberOfTimesPlayed)
        {
            this.plays = plays;
            this.numberOfTimesPlayed = numberOfTimesPlayed;

        }
        public void updateNumberOfTimesPlayedInLevel()
        {
            Hashtable<Integer,Integer> playedCountDict = new Hashtable<Integer,Integer>();
            for (Plays play : plays) 
            {
                if (playedCountDict.containsKey(play.getLevel()))
                {
                    playedCountDict.put(play.getLevel(), playedCountDict.get(play.getLevel()) +1 );
                }
                else
                {
                    playedCountDict.put(play.getLevel(), 1);
                }
            }
            for (Plays plays2 : plays) 
            {
                if (playedCountDict.containsKey(plays2.getLevel()))
                {
                    plays2.setTimesPlayedInLevel(playedCountDict.get(plays2.getLevel()));
                }
                
            }

        }

       
      


    }
    public class Concentration
    {
        @Field("Plays")
        private Plays[] plays;
        private int numberOfTimesPlayed;
       
        public Plays[] getPlays() {
            return this.plays;
        }

        public void setPlays(Plays[] plays) {
            this.plays = plays;
        }

        public int getNumberOfTimesPlayed() {
            return this.numberOfTimesPlayed;
        }

        public void setNumberOfTimesPlayed(int numberOfTimesPlayed) {
            this.numberOfTimesPlayed = numberOfTimesPlayed;
        }

        public Concentration(Plays[] plays, int numberOfTimesPlayed)
        {
            this.plays = plays;
            this.numberOfTimesPlayed = numberOfTimesPlayed;

        }
        public void updateNumberOfTimesPlayedInLevel()
        {
            Hashtable<Integer,Integer> playedCountDict = new Hashtable<Integer,Integer>();
            for (Plays play : plays) 
            {
                if (playedCountDict.containsKey(play.getLevel()))
                {
                    playedCountDict.put(play.getLevel(), playedCountDict.get(play.getLevel()) +1 );
                }
                else
                {
                    playedCountDict.put(play.getLevel(), 1);
                }
            }
            for (Plays plays2 : plays) 
            {
                if (playedCountDict.containsKey(plays2.getLevel()))
                {
                    plays2.setTimesPlayedInLevel(playedCountDict.get(plays2.getLevel()));
                }
                
            }

        }


    }

   
        public class Plays
        {
          
            @Field("CurrentPlay")
            private int currentPlay;
            @Field("Time")
            private int time;
            @Field("Incorrect")
            private int incorrect;
            @Field("Level")
            private int level;
            @Field("Date")
            private java.util.Date date;

            public java.util.Date getDate() {
                return this.date;
            }

            public void setDate(java.util.Date date) {
                this.date = date;
            }

            private int timesPlayedInLevel;

            public int getTimesPlayedInLevel() {
                return this.timesPlayedInLevel;
            }

            public void setTimesPlayedInLevel(int timesPlayedInLevel) {
                this.timesPlayedInLevel = timesPlayedInLevel;
            }

            public int getLevel() {
                return this.level;
            }

            public void setLevel(int level) {
                this.level = level;
            }

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
            public Plays(int currentPlay, int time, int incorrect, int level, java.util.Date date)
            {
                this.currentPlay = currentPlay;
                this.time = time;
                this.incorrect = incorrect;
                this.level = level;
                this.date = date;
                
            }



        }
     

    }





    
}


