package com.example.candi.passmark;

public class AssessmentItem {
    //fields
    private String _Name = "";
    private float _Mark = 0;
    private float _Weight = 0;

    //Getters and setters
    public String get_Name() {
        return _Name;
    }

    public void set_Name(String _Name) {
        this._Name = _Name;
    }

    public float get_Mark() {
        return _Mark;
    }

    public void set_Mark(float _Mark) {
        this._Mark = _Mark;
    }

    public float get_Weight() {
        return _Weight;
    }

    public void set_Weight(float _Weight) {
        this._Weight = _Weight;
    }

    //constructor
    public AssessmentItem(String name, float mark, float weight ){
        set_Name(name);
        set_Mark(mark);
        set_Weight(weight);
    }


}
