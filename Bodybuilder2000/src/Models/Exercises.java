package src;

import java.util.Arrays;

public class Exercises {

    private String name;
    private String mainMuscleWorked;
    private String sport;
    private String force;
    private String level;
    private String muscleHeatmap;
    private String femaleImageEnd;
    private String femaleImageStart;
    private String maleImageStart;
    private String maleImageEnd;
    private String equipment;
    private String link;
    private String otherMusclesWorked;
    private String type;
    private String mechanicsType;
    private String [] guide;

    public Exercises() {
        //empty constructor
    }

    public Exercises(String name, String mainMuscleWorked, String sport, String force, String level, String muscleHeatmap, String femaleImageEnd, String femaleImageStart, String maleImageStart, String maleImageEnd, String equipment, String link, String otherMusclesWorked, String type, String mechanicsType, String[] guide) {
        this.name = name;
        this.mainMuscleWorked = mainMuscleWorked;
        this.sport = sport;
        this.force = force;
        this.level = level;
        this.muscleHeatmap = muscleHeatmap;
        this.femaleImageEnd = femaleImageEnd;
        this.femaleImageStart = femaleImageStart;
        this.maleImageStart = maleImageStart;
        this.maleImageEnd = maleImageEnd;
        this.equipment = equipment;
        this.link = link;
        this.otherMusclesWorked = otherMusclesWorked;
        this.type = type;
        this.mechanicsType = mechanicsType;
        this.guide = guide;
    }

    @Override
    public String toString() {
        return "Exercises{" +
                "name='" + name + '\'' +
                ", mainMuscleWorked='" + mainMuscleWorked + '\'' +
                ", sport='" + sport + '\'' +
                ", force='" + force + '\'' +
                ", level='" + level + '\'' +
                ", muscleHeatmap='" + muscleHeatmap + '\'' +
                ", femaleImageEnd='" + femaleImageEnd + '\'' +
                ", femaleImageStart='" + femaleImageStart + '\'' +
                ", maleImageStart='" + maleImageStart + '\'' +
                ", maleImageEnd='" + maleImageEnd + '\'' +
                ", equipment='" + equipment + '\'' +
                ", link='" + link + '\'' +
                ", otherMusclesWorked='" + otherMusclesWorked + '\'' +
                ", type='" + type + '\'' +
                ", mechanicsType='" + mechanicsType + '\'' +
                ", guide=" + Arrays.toString(guide) +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMainMuscleWorked() {
        return mainMuscleWorked;
    }

    public void setMainMuscleWorked(String mainMuscleWorked) {
        this.mainMuscleWorked = mainMuscleWorked;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getForce() {
        return force;
    }

    public void setForce(String force) {
        this.force = force;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getMuscleHeatmap() {
        return muscleHeatmap;
    }

    public void setMuscleHeatmap(String muscleHeatmap) {
        this.muscleHeatmap = muscleHeatmap;
    }

    public String getFemaleImageEnd() {
        return femaleImageEnd;
    }

    public void setFemaleImageEnd(String femaleImageEnd) {
        this.femaleImageEnd = femaleImageEnd;
    }

    public String getFemaleImageStart() {
        return femaleImageStart;
    }

    public void setFemaleImageStart(String femaleImageStart) {
        this.femaleImageStart = femaleImageStart;
    }

    public String getMaleImageStart() {
        return maleImageStart;
    }

    public void setMaleImageStart(String maleImageStart) {
        this.maleImageStart = maleImageStart;
    }

    public String getMaleImageEnd() {
        return maleImageEnd;
    }

    public void setMaleImageEnd(String maleImageEnd) {
        this.maleImageEnd = maleImageEnd;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getOtherMusclesWorked() {
        return otherMusclesWorked;
    }

    public void setOtherMusclesWorked(String otherMusclesWorked) {
        this.otherMusclesWorked = otherMusclesWorked;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMechanicsType() {
        return mechanicsType;
    }

    public void setMechanicsType(String mechanicsType) {
        this.mechanicsType = mechanicsType;
    }

    public String[] getGuide() {
        return guide;
    }

    public void setGuide(String[] guide) {
        this.guide = guide;
    }
}
