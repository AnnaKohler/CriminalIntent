package ru.startandroid.criminalintent;

import java.util.UUID;

/**
 * Created by Anna on 18.12.2016.
 */

public class Crime {
        private UUID mId;
        private String mTitle;
        public Crime() {
// Генерирование уникального идентификатора
            mId = UUID.randomUUID();
        }

        public UUID getId() {
        return mId;
        }
        public String getTitle() {
            return mTitle;
        }
        public void setTitle(String title) {
            mTitle = title;
        }
}
