package ru.startandroid.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by Anna on 05.01.2017.
 */

public class CrimeLab {
    private static CrimeLab sCrimeLab;
    private Context mAppContext;
    private ArrayList<Crime> mCrimes;


    private CrimeLab(Context appContext){ //Context позволяет запускать активности etc
        mAppContext= appContext;
        mCrimes=new ArrayList<Crime>();
        for (int i = 0; i < 100; i++) {
            Crime c = new Crime();
            c.setTitle("Crime #" + i);
            c.setSolved(i % 2 == 0); // Для каждого второго объекта
            mCrimes.add(c);
        }
    }
    public static CrimeLab get(Context c){
        if(sCrimeLab==null){
            sCrimeLab=new CrimeLab(c.getApplicationContext()); //если экземпляр не сущ-ет, он создается
        }
        return sCrimeLab; //если экземпляр сущ-ет, он и возвращается
    }

    public ArrayList<Crime> getCrimes(){
        return mCrimes;
    }
    public Crime getCrime(UUID id){
        for (Crime c: mCrimes){
            if(c.getId().equals(id)){
                return c;
            }
        }
        return null;
    }
}
