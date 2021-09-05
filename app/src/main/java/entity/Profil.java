package com.example.gd1_a_0181.entity;

import android.os.Parcel;
import android.os.Parcelable;

public class Profil implements Parcelable {
    //  Attribute dari Kelas Profil
    private String name;
    private String npm;
    private String noHp;
    private int backgroundColor;

    //  Constructor dari Kelas Profil
    public Profil(String name, String npm, String noHp, int backgroundColor) {
        this.name = name;
        this.npm = npm;
        this.noHp = noHp;
        this.backgroundColor = backgroundColor;
    }

    //Getter dan Setter untuk kelas Profil
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public int getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(int backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    //  Bagian ini merupakan implementasi dari Parcelable agar kita dapat mengirim data dalam bentuk kelas.
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(npm);
        parcel.writeString(noHp);
        parcel.writeInt(backgroundColor);
    }

    protected Profil(Parcel in) {
        name = in.readString();
        npm = in.readString();
        noHp = in.readString();
        backgroundColor = in.readInt();
    }

    public static final Creator<Profil> CREATOR = new Creator<Profil>() {
        @Override
        public Profil createFromParcel(Parcel in) {
            return new Profil(in);
        }

        @Override
        public Profil[] newArray(int size) {
            return new Profil[size];
        }
    };
}